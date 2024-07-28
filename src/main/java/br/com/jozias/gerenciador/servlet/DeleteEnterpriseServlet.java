package br.com.jozias.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteEnterpriseServlet
 */
@WebServlet("/deleteEnterprise")
public class DeleteEnterpriseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
		protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			int id = Integer.parseInt(req.getParameter("id"));
			Database database = new Database();
			List<Enterprise> enterprises = database.getEnterprises();
			Enterprise enterprise = database.getEnterpriseById(id);
			database.delete(enterprise);
		}
}
