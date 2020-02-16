package fakekube.io.sim.metrics;

import java.io.IOException;
import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import fakekube.io.sim.RemoteWrite;
import fakekube.io.sim.model.Nodes;

@Named
@ApplicationScoped
public class Metrics {
	private static final Logger LOGGER = Logger.getLogger(Metrics.class.getName());

	@Inject
	private Nodes nodes;
	@Inject
	private MetricStore metricStore;
	@Inject
	private RemoteWrite remoteWrite;

	private Thread metrics;

	public void init() {
		nodes.register(metricStore);
		metrics = new Thread(() -> {
			while (true) {
				metricStore.generate(nodes.list());
				try {
					remoteWrite.send();
				} catch (IOException | InterruptedException e) {
					LOGGER.warning("failed to send metrics via remote-write: " + e.getMessage());
				}
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {}
			}
		});
		metrics.start();
	}
}
