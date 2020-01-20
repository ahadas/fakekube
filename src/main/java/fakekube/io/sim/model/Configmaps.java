package fakekube.io.sim.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import fakekube.io.model.IoK8sApiCoreV1ConfigMap;
import fakekube.io.utils.NamespacedName;

@Named
@ApplicationScoped
public class Configmaps {
	private Map<NamespacedName, IoK8sApiCoreV1ConfigMap> configmaps = new HashMap<>();

	public void add(IoK8sApiCoreV1ConfigMap configmap) {
		configmaps.put(new NamespacedName(configmap.getMetadata().getNamespace(), configmap.getMetadata().getName()), configmap);
	}

	public List<IoK8sApiCoreV1ConfigMap> list() {
		return new ArrayList<>(configmaps.values());
	}

	public List<IoK8sApiCoreV1ConfigMap> list(String namespace) {
		return configmaps.entrySet().stream()
				.filter(e -> e.getKey().getNamespace().equals(namespace))
				.map(Map.Entry::getValue)
				.collect(Collectors.toList());
	}

	public IoK8sApiCoreV1ConfigMap get(String namespace, String name) {
		return configmaps.get(new NamespacedName(namespace, name));
	}

	public IoK8sApiCoreV1ConfigMap delete(String namespace, String name) {
		return configmaps.remove(new NamespacedName(namespace, name));
	}
}
