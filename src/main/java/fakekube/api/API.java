package fakekube.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.kubernetes.client.openapi.models.V1APIVersions;

@WebServlet(name = "API", urlPatterns = {"/api"}, loadOnStartup = 1)
public class API extends KubeServlet<V1APIVersions> {

	protected V1APIVersions query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		V1APIVersions apiVersions = new V1APIVersions();
		apiVersions.setApiVersion("v1");
		apiVersions.setKind("APIVersions");
		List<String> versions = new ArrayList<>();
		versions.add("v1");
		apiVersions.setVersions(versions);
		return apiVersions;
	}
}
