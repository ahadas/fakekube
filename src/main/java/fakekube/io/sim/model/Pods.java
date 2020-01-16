package fakekube.io.sim.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import fakekube.io.model.IoK8sApiCoreV1Pod;
import fakekube.io.utils.NamespacedName;

@Named
@ApplicationScoped
public class Pods {

	private Map<NamespacedName, IoK8sApiCoreV1Pod> pods = new HashMap<>();

	public void add(IoK8sApiCoreV1Pod pod) {
		pods.put(new NamespacedName(pod.getMetadata().getNamespace(), pod.getMetadata().getName()), pod);
	}

	public List<IoK8sApiCoreV1Pod> list() {
		return new ArrayList<>(pods.values());
	}

	public List<IoK8sApiCoreV1Pod> list(String namespace) {
		return pods.entrySet().stream()
				.filter(e -> e.getKey().getNamespace().equals(namespace))
				.map(Map.Entry::getValue)
				.collect(Collectors.toList());
	}

	public IoK8sApiCoreV1Pod get(String namespace, String name) {
		return pods.get(new NamespacedName(namespace, name));
	}

	public IoK8sApiCoreV1Pod delete(String namespace, String name) {
		return pods.remove(new NamespacedName(namespace, name));
	}
}
