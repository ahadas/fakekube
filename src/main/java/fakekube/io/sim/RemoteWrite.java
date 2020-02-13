package fakekube.io.sim;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.logging.Logger;

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

	public RemoteWrite() {
		this.registry = CollectorRegistry.defaultRegistry;
	}

	private final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .build();

	public void send() throws IOException, InterruptedException {
		HttpRequest request = HttpRequest.newBuilder()
                .POST(buildData())
                .uri(URI.create("http://10.46.9.101:19291/api/v1/receive"))
                //.uri(URI.create("http://10.46.9.101:19291/write"))
                .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
                .header("Content-Type", "application/x-protobuf")//"text/plain; version=0.0.4; charset=utf-8")
                .header("Content-Encoding", "snappy")//"text/plain; version=0.0.4; charset=utf-8")
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        LOGGER.info("remote-write post status: " + response.statusCode());
        LOGGER.info("remote-write post body: " + response.body());
	}

	private HttpRequest.BodyPublisher buildData() throws IOException {
		Enumeration<MetricFamilySamples> enumeration = registry.filteredMetricFamilySamples(Collections.emptySet());
		WriteRequest.Builder writeRequestBuilder = Remote.WriteRequest.newBuilder();
		while (enumeration.hasMoreElements()) {
			MetricFamilySamples samples = enumeration.nextElement();
//			List<Label> labels = samples.samples.stream().
		}
			
			WriteRequest request = Remote.WriteRequest.newBuilder()
					.addTimeseries(
							TimeSeries.newBuilder()
							// https://github.com/influxdata/influxdb/pull/9599
							.addLabels(Label.newBuilder().setName("__name__").setValue("arik"))
							.addLabels(Label.newBuilder().setName("worker").setValue("derez"))
							.addSamples(Sample.newBuilder().setValue(4).setTimestamp(new Date().getTime()).build())
							//						.gets
							.build())
					.addTimeseries(TimeSeries.newBuilder()
							.addLabels(Label.newBuilder().setName("__name__").setValue("derez"))
							.addLabels(Label.newBuilder().setName("arik").setValue("b"))
							.addSamples(Sample.newBuilder().setValue(6).setTimestamp(new Date().getTime()).build())
							//						.gets
							.build())
					.build();
			
//		WriteRequest request = writeRequestBuilder.build();
		byte[] compressed = Snappy.compress(request.toByteArray());
		return HttpRequest.BodyPublishers.ofByteArray(compressed);
	}
}
