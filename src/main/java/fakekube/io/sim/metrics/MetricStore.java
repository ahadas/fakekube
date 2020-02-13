package fakekube.io.sim.metrics;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import fakekube.io.model.IoK8sApiCoreV1Node;
import fakekube.io.sim.model.Observer;
import fakekube.io.utils.NamespacedName;

@Named
@ApplicationScoped
public class MetricStore implements Observer<IoK8sApiCoreV1Node> {

	Map<NamespacedName, NodeMetrics> nodeMetrics = new HashMap<>();

	@Override
	public void added(IoK8sApiCoreV1Node node) {
		nodeMetrics.put(new NamespacedName(node.getMetadata()), new NodeMetrics());
	}

	@Override
	public void deleted(IoK8sApiCoreV1Node node) {
		nodeMetrics.remove(new NamespacedName(node.getMetadata()));
	}

	@Override
	public void generate(Collection<IoK8sApiCoreV1Node> nodes) {
		nodes.forEach(node -> {
			NodeMetrics metrics = nodeMetrics.get(new NamespacedName(node.getMetadata()));
			if (metrics != null)
				metrics.update(node);
		});
	}
}
