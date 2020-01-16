package fakekube.io.sim.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import org.joda.time.DateTime;

import fakekube.io.model.IoK8sApiCoreV1Namespace;
import fakekube.io.model.IoK8sApiCoreV1NamespaceStatus;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1ObjectMeta;

@Named
@ApplicationScoped
public class Namespaces {
	private Map<String, IoK8sApiCoreV1Namespace> namespaces = new HashMap<>();
	private IoK8sApiCoreV1Namespace defaultNamespace;

	public Namespaces() {
		defaultNamespace = new IoK8sApiCoreV1Namespace()
				.apiVersion("v1")
				.kind("Namespace")
				.metadata(new IoK8sApimachineryPkgApisMetaV1ObjectMeta().name("default").creationTimestamp(DateTime.now().toString()))
				.status(new IoK8sApiCoreV1NamespaceStatus().phase("Active"));
		namespaces.put(defaultNamespace.getMetadata().getName(), defaultNamespace);
	}

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
