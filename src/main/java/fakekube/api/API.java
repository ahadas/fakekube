package fakekube.api;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.kubernetes.client.openapi.JSON;
import io.kubernetes.client.openapi.models.V1APIVersions;

@WebServlet(name = "API", urlPatterns = {"/api"}, loadOnStartup = 1)
public class API extends KubeServlet<V1APIVersions> {
	public static final String API_VERSIONS_FILE = "/fakekube/api/api.json";
	private static final Logger LOGGER = Logger.getLogger(API.class.getName());

	protected V1APIVersions query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str = readFromFile(API_VERSIONS_FILE);
		return new JSON().getGson().fromJson(str, V1APIVersions.class);
	}
}
