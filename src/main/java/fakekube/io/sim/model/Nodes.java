package fakekube.io.sim.model;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import fakekube.io.model.IoK8sApiCoreV1Node;

@Named
@ApplicationScoped
public class Nodes {

	private List<IoK8sApiCoreV1Node> nodes = new ArrayList<>();

	public void add(IoK8sApiCoreV1Node node) {
		nodes.add(node);
	}

	public List<IoK8sApiCoreV1Node> list() {
		return nodes;
	}
}
