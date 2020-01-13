package fakekube;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import io.kubernetes.client.openapi.models.V1APIResource;
import io.kubernetes.client.openapi.models.V1APIResourceList;

@WebServlet(name = "APIResourceList", urlPatterns = {"/api/v1"}, loadOnStartup = 1)
public class APIResourceList extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		V1APIResourceList l = new V1APIResourceList();
		l.setKind("APIResourceList");
		l.setApiVersion("v1");
		List<V1APIResource> resources = new ArrayList<>();
		V1APIResource nodes = new V1APIResource();
		nodes.setName("nodes");
		nodes.setSingularName("");
		nodes.setNamespaced(false);
		nodes.setVerbs(Arrays.asList("get", "list"));
		nodes.setShortNames(Arrays.asList("no"));
		nodes.setKind("Node");
		resources.add(nodes);
		l.setResources(resources);
		String str= new Gson().toJson(l);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(str);
		response.getWriter().flush();
	}
}
