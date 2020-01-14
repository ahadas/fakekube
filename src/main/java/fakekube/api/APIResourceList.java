package fakekube.api;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.kubernetes.client.openapi.JSON;
import io.kubernetes.client.openapi.models.V1APIResourceList;

@WebServlet(name = "APIResourceList", urlPatterns = {"/api/v1"}, loadOnStartup = 1)
public class APIResourceList extends KubeServlet<V1APIResourceList> {
	private static final Logger LOGGER = Logger.getLogger(APIResourceList.class.getName());
	public static final String API_RESOURCE_LIST_FILE = "/fakekube/api/resources.json";

	protected V1APIResourceList query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str = readFromFile(API_RESOURCE_LIST_FILE);
		return new JSON().getGson().fromJson(str, V1APIResourceList.class);
	}
}
