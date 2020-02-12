package fakekube.io.sim.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import fakekube.io.model.IoK8sApiCoreV1Node;

@Named
@ApplicationScoped
public class Nodes {

	private Map<String, IoK8sApiCoreV1Node> nodes = new HashMap<>();
	private List<Observer<IoK8sApiCoreV1Node>> observers = new ArrayList<>();

	public void add(IoK8sApiCoreV1Node node) {
		nodes.put(node.getMetadata().getName(), node);
		observers.forEach(o -> o.added(node));
	}

	public List<IoK8sApiCoreV1Node> list() {
		return new ArrayList<>(nodes.values());
	}

	public IoK8sApiCoreV1Node get(String name) {
		return nodes.get(name);
	}

	public IoK8sApiCoreV1Node delete(String name) {
		IoK8sApiCoreV1Node node = nodes.remove(name);
		observers.forEach(o -> o.deleted(node));
		return node;
	}

	public void register(Observer<IoK8sApiCoreV1Node> observer) {
		observers.add(observer);
	}

	public void unregister(Observer<IoK8sApiCoreV1Node> observer) {
		observers.remove(observer);
	}
}
