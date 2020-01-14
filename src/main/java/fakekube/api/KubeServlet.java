package fakekube.api;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.kubernetes.client.openapi.JSON;

public abstract class KubeServlet<T> extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		T obj = query(request, response);
		if (obj == null)
			throw new ServletException("failed to query resource");
		String json = new JSON().getGson().toJson(obj);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(json);
		response.getWriter().flush();
	}

	protected T query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		return null;
	}
}
