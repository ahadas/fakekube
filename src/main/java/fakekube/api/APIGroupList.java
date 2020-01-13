package fakekube.api;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import io.kubernetes.client.openapi.models.V1APIGroupList;

@WebServlet(name = "APIGroupList", urlPatterns = {"/apis"}, loadOnStartup = 1)
public class APIGroupList extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		V1APIGroupList l = new V1APIGroupList();
		l.setKind("APIGroupList");
		l.setApiVersion("v1");
		String str= new Gson().toJson(l);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(str);
		response.getWriter().flush();
	}
}
