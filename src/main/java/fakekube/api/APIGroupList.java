package fakekube.api;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.kubernetes.client.openapi.models.V1APIGroupList;

@WebServlet(name = "APIGroupList", urlPatterns = {"/apis"}, loadOnStartup = 1)
public class APIGroupList extends KubeServlet<V1APIGroupList> {

	protected V1APIGroupList query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		V1APIGroupList apiGroupList = new V1APIGroupList();
		apiGroupList.setKind("APIGroupList");
		apiGroupList.setApiVersion("v1");
		return apiGroupList;
	}
}
