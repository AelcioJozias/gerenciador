package br.com.jozias.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListEnterprisesServlet
 */
@WebServlet("/listEnterprises")
public class ListEnterprisesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Database database = new Database();
		List<Enterprise> enterprises = database.getEnterprises();
		
		PrintWriter out = response.getWriter();
		out.println("<html><body><h3> Enterprises </h3>");
		enterprises.forEach(enterprise -> {
			out.println(" Name: " + enterprise.getName() + "<br>");
		});
		out.print("</body></html>");
		
	}

}
