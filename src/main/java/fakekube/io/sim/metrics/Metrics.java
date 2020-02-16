package fakekube.io.sim.metrics;

import java.io.IOException;
import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import fakekube.io.model.IoK8sApiCoreV1Namespace;
import fakekube.io.model.IoK8sApiCoreV1NamespaceStatus;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1ObjectMeta;
import fakekube.io.sim.Clock;
import fakekube.io.sim.RemoteWrite;
import fakekube.io.sim.model.Namespaces;
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
	@Inject
	private Clock clock;
	@Inject
	private Namespaces namespaces;

	private Thread metrics;

	public void init() {
		addMonitoringNamespace();
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

	private void addMonitoringNamespace() {
		LOGGER.info("adding 'monitoring' namespace");
		IoK8sApiCoreV1Namespace defaultNamespace = new IoK8sApiCoreV1Namespace()
				.apiVersion("v1")
				.kind("Namespace")
				.metadata(new IoK8sApimachineryPkgApisMetaV1ObjectMeta().name("monitoring").creationTimestamp(clock.creationTimestamp()))
				.status(new IoK8sApiCoreV1NamespaceStatus().phase("Active"));
		namespaces.add(defaultNamespace);
	}
}
