package fakekube.io.sim.model;

import fakekube.io.model.IoK8sApiCoreV1Pod;
import fakekube.io.model.IoK8sApiCoreV1Service;
import fakekube.io.utils.NamespacedName;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Named
@ApplicationScoped
public class Services {

	private Map<NamespacedName, IoK8sApiCoreV1Service> services = new HashMap<>();

	public void add(IoK8sApiCoreV1Service service) {
		services.put(new NamespacedName(
				service.getMetadata().getNamespace(), service.getMetadata().getName()), service);
	}

	public List<IoK8sApiCoreV1Service> list() {
		return new ArrayList<>(services.values());
	}

	public List<IoK8sApiCoreV1Service> list(String namespace) {
		return services.entrySet().stream()
				.filter(e -> e.getKey().getNamespace().equals(namespace))
				.map(Map.Entry::getValue)
				.collect(Collectors.toList());
	}

	public IoK8sApiCoreV1Service get(String namespace, String name) {
		return services.get(new NamespacedName(namespace, name));
	}

	public IoK8sApiCoreV1Service delete(String namespace, String name) {
		return services.remove(new NamespacedName(namespace, name));
	}
}
