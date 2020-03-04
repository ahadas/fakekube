package fakekube.io.sim.metrics;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import org.xerial.snappy.Snappy;

import io.prometheus.client.Collector.MetricFamilySamples;
import io.prometheus.client.CollectorRegistry;
import prometheus.Remote;
import prometheus.Remote.WriteRequest;
import prometheus.Types.Label;
import prometheus.Types.Sample;
import prometheus.Types.TimeSeries;

@Named
@ApplicationScoped
public class RemoteWrite {
	private static final Logger LOGGER = Logger.getLogger(RemoteWrite.class.getName());

	private CollectorRegistry registry;
	private final HttpClient httpClient;
	private IoK8sApiMonitoringV1Prometheus prometheus;

	public RemoteWrite() {
		registry = CollectorRegistry.defaultRegistry;
		httpClient = HttpClient.newBuilder()
	            .version(HttpClient.Version.HTTP_2)
	            .build();
	}

	public void send() {
		getURLs().forEach(this::send);
	}

	private List<String> getURLs() {
		if (prometheus == null)
			return Collections.emptyList();;
		IoK8sApiMonitoringV1RemoteWrite[] remoteWrite = prometheus.getSpec().getRemoteWrite();
		if (remoteWrite == null)
			return Collections.emptyList();
		return Arrays.stream(remoteWrite).map(IoK8sApiMonitoringV1RemoteWrite::getUrl).collect(Collectors.toList());
	}

	private void send(String url) {
		try {
			HttpRequest request = HttpRequest.newBuilder()
					.POST(buildData())
					.uri(URI.create(url))
					//.uri(URI.create("http://10.46.9.101:19291/write"))
					.setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
					.header("Content-Type", "application/x-protobuf")//"text/plain; version=0.0.4; charset=utf-8")
					.header("Content-Encoding", "snappy")//"text/plain; version=0.0.4; charset=utf-8")
					.build();

			HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
			LOGGER.info("remote-write post status: " + response.statusCode());
			LOGGER.info("remote-write post body: " + response.body());
		} catch (IOException | InterruptedException e) {
			LOGGER.warning("failed to send metrics via remote-write: " + e.getMessage());
		}
	}

	private HttpRequest.BodyPublisher buildData() throws IOException {
		long timestamp = new Date().getTime();
		Enumeration<MetricFamilySamples> enumeration = registry.filteredMetricFamilySamples(Collections.emptySet());
		WriteRequest.Builder writeRequestBuilder = Remote.WriteRequest.newBuilder();
		while (enumeration.hasMoreElements()) {
			MetricFamilySamples samples = enumeration.nextElement();
			List<TimeSeries> protoTimeSeries = new ArrayList<>();

			for (MetricFamilySamples.Sample sample : samples.samples) {
				TimeSeries.Builder timeSeriesBuilder = TimeSeries.newBuilder();
				List<Sample> protoSamples = new ArrayList<>();
				List<Label> protoLabels = new ArrayList<>();

				protoLabels.add(Label.newBuilder().setName("__name__").setValue(sample.name).build());
				int numOfLabels = sample.labelNames.size();
				for (int i=0; i<numOfLabels; i++) {
					String name = sample.labelNames.get(i);
					String value = sample.labelValues.get(i);
					protoLabels.add(Label.newBuilder().setName(name).setValue(value).build());
				}

				Sample protoSample = Sample.newBuilder().setValue(sample.value).setTimestamp(timestamp).build();
				TimeSeries timeSeries = timeSeriesBuilder.addAllLabels(protoLabels).addSamples(protoSample).build();
				protoTimeSeries.add(timeSeries);
			}
			writeRequestBuilder.addAllTimeseries(protoTimeSeries);
		}
			
		WriteRequest request = writeRequestBuilder.build();
		byte[] compressed = Snappy.compress(request.toByteArray());
		return HttpRequest.BodyPublishers.ofByteArray(compressed);
	}

	public IoK8sApiMonitoringV1Prometheus getPrometheus() {
		return prometheus;
	}

	public void setPrometheus(IoK8sApiMonitoringV1Prometheus prometheus) {
		this.prometheus = prometheus;
	}
}
