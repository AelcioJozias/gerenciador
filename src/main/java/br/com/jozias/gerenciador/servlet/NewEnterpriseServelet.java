package br.com.jozias.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewEnterpriseServelet
 */
@WebServlet("/newEnterprise")
public class NewEnterpriseServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String enterpriseName = request.getParameter("name");
		Enterprise enterprise = new Enterprise();
		enterprise.setName(enterpriseName);
		Database database = new Database();
		database.add(enterprise);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/newEnterpriseCreated.jsp");
		request.setAttribute("enterprise", enterprise.getName());
		dispatcher.forward(request, response);
		
	}

}
