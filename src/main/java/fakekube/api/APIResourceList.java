package fakekube.api;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
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
	public static final String API_RESOURCE_LIST_FILE = "/fakekube/api/V1APIResourceList.json";

	protected V1APIResourceList query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		byte[] bytes;
		try {
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream(API_RESOURCE_LIST_FILE);
			bytes = new byte[inputStream.available()];
			inputStream.read(bytes);
		} catch (IOException e) {
			LOGGER.severe("failed to load APIResourceList, return empty list");
			V1APIResourceList l = new V1APIResourceList();
			l.setKind("APIResourceList");
			l.setApiVersion("v1");
			l.setResources(new ArrayList<>());
			return l;
		}
		return new JSON().getGson().fromJson(new String(bytes), V1APIResourceList.class);
	}
}
