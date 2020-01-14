package fakekube.api;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.kubernetes.client.openapi.JSON;
import io.kubernetes.client.openapi.models.V1APIGroupList;

@WebServlet(name = "APIGroupList", urlPatterns = {"/apis"}, loadOnStartup = 1)
public class APIGroupList extends KubeServlet<V1APIGroupList> {
	public static final String API_GROUP_LIST_FILE = "/fakekube/api/groups.json";

	protected V1APIGroupList query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str = readFromFile(API_GROUP_LIST_FILE);
		return new JSON().getGson().fromJson(str, V1APIGroupList.class);
	}
}
