package fakekube.api;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.joda.time.DateTime;

import io.kubernetes.client.openapi.JSON;
import io.kubernetes.client.openapi.models.V1Node;
import io.kubernetes.client.openapi.models.V1NodeCondition;
import io.kubernetes.client.openapi.models.V1NodeList;
import io.kubernetes.client.openapi.models.V1NodeSpec;
import io.kubernetes.client.openapi.models.V1NodeStatus;
import io.kubernetes.client.openapi.models.V1NodeSystemInfo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;

@WebServlet(name = "Nodes", urlPatterns = {"/api/v1/nodes"}, loadOnStartup = 1)
public class Nodes extends KubeServlet<V1NodeList> {

    protected V1NodeList query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	V1NodeList nodes = new V1NodeList();
    	nodes.apiVersion("v1");
    	nodes.setKind("List");
    	nodes.setItems(Arrays.asList(createNode("arik", true), createNode("derez", false)));
    	return nodes;
    }

    private V1Node createNode(String name, boolean master) {
    	V1Node node = new V1Node();
    	node.setMetadata(new V1ObjectMeta());
    	node.setSpec(new V1NodeSpec());
    	node.setStatus(new V1NodeStatus());
    	node.getMetadata().setName(name);
    	node.setApiVersion("v1");
    	node.setKind("Node");
    	node.getMetadata().setCreationTimestamp(DateTime.parse("2020-01-13T10:59:06.370+02:00"));

    	Map<String, String> labels = new HashMap<>();
    	if (master)
    		labels.put("node-role.kubernetes.io/master", "");
    	node.getMetadata().setLabels(labels);

    	V1NodeCondition c = new V1NodeCondition();
    	c.setStatus("True");
    	c.setReason("KubeletReady");
    	c.setType("Ready");
    	node.getStatus().setConditions(Arrays.asList(c));
    	V1NodeSystemInfo i = new V1NodeSystemInfo();
    	i.setKubeProxyVersion("v1.13.3");
    	i.setKubeletVersion("v1.13.3");
    	node.getStatus().setNodeInfo(i);
    	return node;
    }
}
