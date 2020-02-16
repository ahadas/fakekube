package fakekube.io.sim.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import fakekube.io.model.IoK8sApiCoreV1Namespace;

@Named
@ApplicationScoped
public class Namespaces {
	private Map<String, IoK8sApiCoreV1Namespace> namespaces = new HashMap<>();

	public void add(IoK8sApiCoreV1Namespace node) {
		namespaces.put(node.getMetadata().getName(), node);
	}

	public List<IoK8sApiCoreV1Namespace> list() {
		return new ArrayList<>(namespaces.values());
	}

	public IoK8sApiCoreV1Namespace get(String name) {
		return namespaces.get(name);
	}

	public IoK8sApiCoreV1Namespace delete(String name) {
		return namespaces.remove(name);
	}
}
