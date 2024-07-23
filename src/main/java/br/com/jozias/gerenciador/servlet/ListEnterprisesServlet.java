package br.com.jozias.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
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
		
		enterprises.forEach(e -> {
			System.out.println(e.getName());
		});
		System.out.println("quantity: " + enterprises.size());
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/listEnterprises.jsp");
		request.setAttribute("enterprises", enterprises);
		requestDispatcher.forward(request, response);
		
	}

}
