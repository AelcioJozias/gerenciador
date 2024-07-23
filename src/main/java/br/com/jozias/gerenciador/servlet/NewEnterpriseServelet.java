package br.com.jozias.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

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
		System.out.println("Cadastrando nova empresa");
		String enterpriseName = request.getParameter("name");
		Enterprise enterprise = new Enterprise();
		enterprise.setName(enterpriseName);
		
		Database database = new Database();
		database.add(enterprise);
		PrintWriter out = response.getWriter();
		out.println("<html><body>Enterprise " + enterpriseName + " saved with success!</body><html/>");
	}
	
	

}
