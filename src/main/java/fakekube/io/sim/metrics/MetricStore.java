package fakekube.io.sim.metrics;

import java.util.Collection;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import fakekube.io.model.IoK8sApiCoreV1Node;
import fakekube.io.sim.model.Observer;

@Named
@ApplicationScoped
public class MetricStore implements Observer<IoK8sApiCoreV1Node> {

	@Inject
	private NodeMetrics nodeMetrics;

	@Override
	public void added(IoK8sApiCoreV1Node node) {
		nodeMetrics.add(node);
	}

	@Override
	public void deleted(IoK8sApiCoreV1Node node) {
	}

	@Override
	public void generate(Collection<IoK8sApiCoreV1Node> nodes) {
		nodes.forEach(nodeMetrics::update);
	}
}
