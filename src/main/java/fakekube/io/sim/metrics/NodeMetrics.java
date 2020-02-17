package fakekube.io.sim.metrics;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import fakekube.io.model.IoK8sApiCoreV1Node;
import fakekube.io.model.IoK8sApiCoreV1NodeSystemInfo;
import io.kubernetes.client.custom.Quantity;
import io.prometheus.client.Gauge;

@Named
@ApplicationScoped
public class NodeMetrics {
	private static Map<Key, Gauge> metrics = new HashMap<>();
	private static final String[] CAPACITY_LABELS = new String[] { "node", "resource", "unit" };
	private static final String[] NODE_LABELS = new String[] { "node", "label_beta_kubernetes_io_arch", "label_beta_kubernetes_io_os", "label_kubernetes_io_arch", "label_kubernetes_io_hostname", "label_kubernetes_io_os", "label_node_role_kubernetes_io_master" };

	static {
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

		metrics.put(Key.KUBE_NODE_CREATED, Gauge.build()
				.name("kube_node_created")
				.help("Unix creation timestamp")
				.labelNames("node")
				.register());

		metrics.put(Key.KUBE_NODE_LABELS, Gauge.build()
				.name("kube_node_labels")
				.help("Kubernetes labels converted to Prometheus labels.")
				.labelNames(NODE_LABELS)
				.register());

		metrics.put(Key.KUBE_NODE_INFO, Gauge.build()
				.name("kube_node_info")
				.help("Information about a cluster node.")
				.labelNames(new String[] { "node", "kernel_version", "os_image", "container_runtime_version", "kubelet_version", "kubeproxy_version", "provider_id", "pod_cidr" })
				.register());
	}

	private static enum Key {
		KUBE_NODE_STATUS_CAPACITY,
		KUBE_NODE_STATUS_ALLOCATABLE,
		KUBE_NODE_CREATED,
		KUBE_NODE_LABELS,
		KUBE_NODE_INFO
	}

	public void add(IoK8sApiCoreV1Node node) {
		String name = node.getMetadata().getName();
		Gauge created = metrics.get(Key.KUBE_NODE_CREATED);
		created.labels(name).set(new Date().getTime());

		Map<String, String> nodeLabels = node.getMetadata().getLabels();
		Gauge labels = metrics.get(Key.KUBE_NODE_LABELS);
		List<String> values = Arrays.stream(NODE_LABELS).skip(1).map(l -> nodeLabels.containsKey(l) ? nodeLabels.get(l) : "").collect(Collectors.toList());
		values.add(0, name);
		labels.labels(values.toArray(new String[0])).set(1);

		IoK8sApiCoreV1NodeSystemInfo nodeInfo = node.getStatus().getNodeInfo();
		Gauge info = metrics.get(Key.KUBE_NODE_INFO);
		info.labels(name, nodeInfo.getKernelVersion(), nodeInfo.getOsImage(), nodeInfo.getContainerRuntimeVersion(), nodeInfo.getKubeletVersion(), nodeInfo.getKubeProxyVersion(), "", "").set(1);
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
