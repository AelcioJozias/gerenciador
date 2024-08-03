package br.com.jozias.gerenciador.servlet;

import java.io.IOException;
import java.util.ServiceLoader;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jozias.gerenciador.action.Action;
import br.com.jozias.gerenciador.action.ListEnterprise;

/**
 * Servlet implementation class MainEntryServlet
 */
@WebServlet("/entry")
public class MainEntryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String actionParamater = req.getParameter("action");
		String className = "br.com.jozias.gerenciador.action." + actionParamater;
		Action action = null;
		
		try {
			Class<?> clazz = Thread.currentThread().getContextClassLoader().loadClass(className);
			action = (Action) clazz.getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			throw new ServletException(e);
		}
		
		String actionReturned = action.execute(req, res);
		String[] addresType = actionReturned.split(":");
		
		if(addresType[0].equals("forward")) {
			RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/" + addresType[1]);
			rd.forward(req, res);
		} else {
			res.sendRedirect(addresType[1]);
		}

	}

}
