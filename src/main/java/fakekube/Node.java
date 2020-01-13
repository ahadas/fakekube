package fakekube;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.joda.time.DateTime;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.kubernetes.client.openapi.JSON;
import io.kubernetes.client.openapi.JSON.DateTimeTypeAdapter;
import io.kubernetes.client.openapi.models.V1Node;
import io.kubernetes.client.openapi.models.V1NodeCondition;
import io.kubernetes.client.openapi.models.V1NodeSpec;
import io.kubernetes.client.openapi.models.V1NodeStatus;
import io.kubernetes.client.openapi.models.V1NodeSystemInfo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;

@WebServlet(name = "Node", urlPatterns = {"/api/v1/nodes/arik"}, loadOnStartup = 1) //"/hello"}, loadOnStartup = 1) 
public class Node extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    	V1Node node = new V1Node();
    	node.setMetadata(new V1ObjectMeta());
    	node.setSpec(new V1NodeSpec());
    	node.setStatus(new V1NodeStatus());
    	node.getMetadata().setName("arik123");
    	node.setApiVersion("v1");
    	node.setKind("Node");
    	node.getMetadata().setCreationTimestamp(DateTime.now());

    	Map<String, String> labels = new HashMap<>();
    	labels.put("node-role.kubernetes.io/master", "");
    	node.getMetadata().setLabels(labels);

    	V1NodeCondition c = new V1NodeCondition();
    	c.setStatus("True");
    	c.setReason("KubeletReady");
    	c.setType("Ready");
    	node.getStatus().setConditions(Arrays.asList(c));
    	V1NodeSystemInfo i = new V1NodeSystemInfo();
    	i.setKubeProxyVersion("v1.13.3");
    	i.setKernelVersion("v1.13.3");
    	node.getStatus().setNodeInfo(i);

    	String nodeJsonString = new JSON().getGson().toJson(node);
//    	String nodeJsonString = new Gson().toJson(node);
//        response.getWriter().print(node.toString());
    	response.setContentType("application/json");
    	response.setCharacterEncoding("UTF-8");
    	response.getWriter().print(nodeJsonString);
    	response.getWriter().flush();
//    	response.getWriter().print("aaaa");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String name = request.getParameter("name");
        if (name == null) name = "World";
        request.setAttribute("user", name);
        request.getRequestDispatcher("response.jsp").forward(request, response); 
    }
}


