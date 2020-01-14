package fakekube.api;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.kubernetes.client.openapi.JSON;

public abstract class KubeServlet<T> extends HttpServlet {
	private static final Logger LOGGER = Logger.getLogger(KubeServlet.class.getName());

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

	protected String readFromFile(String path) throws ServletException {
		try {
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream(path);
			byte[] bytes = new byte[inputStream.available()];
			inputStream.read(bytes);
			return new String(bytes);
		} catch (IOException e) {
			LOGGER.severe("failed to load APIResourceList, return empty list");
			throw new ServletException("failed to read from " + path);
		}
	}
}
