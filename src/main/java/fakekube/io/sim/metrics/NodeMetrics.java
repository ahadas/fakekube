package fakekube.io.sim.metrics;

import java.util.HashMap;
import java.util.Map;

import fakekube.io.model.IoK8sApiCoreV1Node;
import io.kubernetes.client.custom.Quantity;
import io.prometheus.client.Gauge;

public class NodeMetrics {
	private Map<Key, Gauge> metrics = new HashMap<>();

	private static enum Key {
		KUBE_NODE_STATUS_CAPACITY,
		KUBE_NODE_STATUS_ALLOCATABLE,
	}

	private final String[] CAPACITY_LABELS = new String[] { "node", "resource", "unit" };

	public NodeMetrics(IoK8sApiCoreV1Node node) {
		metrics.put(Key.KUBE_NODE_STATUS_CAPACITY, Gauge.build()
				.name("kube_node_status_capacity")
				.help("The capacity for different resources of a node.")
				.labelNames(CAPACITY_LABELS)
				.register());

		metrics.put(Key.KUBE_NODE_STATUS_ALLOCATABLE, Gauge.build()
				.name("kube_node_status_allocatable")
				.help("The allocatable for different resources of a node that are available for scheduling.")
				.labelNames(CAPACITY_LABELS)
				.register());
	}

	public void update(IoK8sApiCoreV1Node node) {
		String nodeName = node.getMetadata().getName();

		Gauge capacity = metrics.get(Key.KUBE_NODE_STATUS_CAPACITY);
		double capacityMemory = doubleValue(node.getStatus().getCapacity().get("memory"));
		capacity.labels(nodeName, "memory", "bytes").set(capacityMemory);
		double capacityCpu = doubleValue(node.getStatus().getCapacity().get("cpu"));
		capacity.labels(nodeName, "cpu", "core").set(capacityCpu);
		double capacityPods = doubleValue(node.getStatus().getCapacity().get("pods"));
		capacity.labels(nodeName, "pods", "integer").set(capacityPods);
		double capabityHugepages1Gi = doubleValue(node.getStatus().getCapacity().get("hugepages-1Gi"));
		capacity.labels(nodeName, "hugepages_1Gi", "bytes").set(capabityHugepages1Gi);
		double capabityHugepages2Mi = doubleValue(node.getStatus().getCapacity().get("hugepages-2Mi"));
		capacity.labels(nodeName, "hugepages_2Mi", "bytes").set(capabityHugepages2Mi);
		double capacityEphemeralStorage = doubleValue(node.getStatus().getCapacity().get("ephemeral-storage"));
		capacity.labels(nodeName, "ephemeral_storage", "bytes").set(capacityEphemeralStorage);

		Gauge allocatable = metrics.get(Key.KUBE_NODE_STATUS_ALLOCATABLE);
		double allocatableMemory = doubleValue(node.getStatus().getAllocatable().get("memory"));
		allocatable.labels(nodeName, "memory", "bytes").set(allocatableMemory);
		double allocatableCpu = doubleValue(node.getStatus().getAllocatable().get("cpu"));
		allocatable.labels(nodeName, "cpu", "core").set(allocatableCpu);
		double allocatablePods = doubleValue(node.getStatus().getAllocatable().get("pods"));
		allocatable.labels(nodeName, "pods", "integer").set(allocatablePods);
		double allocatableHugepages1Gi = doubleValue(node.getStatus().getAllocatable().get("hugepages-1Gi"));
		allocatable.labels(nodeName, "hugepages_1Gi", "bytes").set(allocatableHugepages1Gi);
		double allocatableHugepages2Mi = doubleValue(node.getStatus().getAllocatable().get("hugepages-2Mi"));
		allocatable.labels(nodeName, "hugepages_2Mi", "bytes").set(allocatableHugepages2Mi);
		double allocatableEphemeralStorage = doubleValue(node.getStatus().getAllocatable().get("ephemeral-storage"));
		allocatable.labels(nodeName, "ephemeral_storage", "bytes").set(allocatableEphemeralStorage);
	}

	private double doubleValue(String str) {
		return Quantity.fromString(str).getNumber().doubleValue();
	}

}
