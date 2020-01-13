package fakekube.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import io.kubernetes.client.openapi.models.V1APIVersions;

@WebServlet(name = "API", urlPatterns = {"/api"}, loadOnStartup = 1)
public class API extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		V1APIVersions apiVersions = new V1APIVersions();
		apiVersions.setApiVersion("v1");
		apiVersions.setKind("APIVersions");
		List<String> versions = new ArrayList<>();
		versions.add("v1");
		apiVersions.setVersions(versions);
		String str= new Gson().toJson(apiVersions);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(str);
		response.getWriter().flush();
	}
}
