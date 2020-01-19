package fakekube.io.sim.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import fakekube.io.model.IoK8sApiAppsV1Deployment;
import fakekube.io.utils.NamespacedName;

@Named
@ApplicationScoped
public class Deployments {
	private Map<NamespacedName, IoK8sApiAppsV1Deployment> deployments = new HashMap<>();

	public void add(IoK8sApiAppsV1Deployment deployment) {
		deployments.put(new NamespacedName(deployment.getMetadata().getNamespace(), deployment.getMetadata().getName()), deployment);
	}

	public List<IoK8sApiAppsV1Deployment> list() {
		return new ArrayList<>(deployments.values());
	}

	public List<IoK8sApiAppsV1Deployment> list(String namespace) {
		return deployments.entrySet().stream()
				.filter(e -> e.getKey().getNamespace().equals(namespace))
				.map(Map.Entry::getValue)
				.collect(Collectors.toList());
	}

	public IoK8sApiAppsV1Deployment get(String namespace, String name) {
		return deployments.get(new NamespacedName(namespace, name));
	}

	public IoK8sApiAppsV1Deployment delete(String namespace, String name) {
		return deployments.remove(new NamespacedName(namespace, name));
	}

}
