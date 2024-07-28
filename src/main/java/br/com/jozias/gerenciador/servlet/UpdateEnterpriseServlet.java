package br.com.jozias.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jozias.gerenciador.model.Database;
import br.com.jozias.gerenciador.model.Enterprise;

/**
 * Servlet implementation class UpdateEnterpriseServlet
 */
@WebServlet("/updateEnterprise")
public class UpdateEnterpriseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		Database database = new Database();
		Enterprise enterprise = database.getEnterpriseById(id);
		String openedDateEnterpriseParam  = req.getParameter("date");
		Date openedDate = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			openedDate = sdf.parse(openedDateEnterpriseParam);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		enterprise.setName(req.getParameter("name"));
		enterprise.setOpenedDate(openedDate);
		resp.sendRedirect("listEnterprises");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		Database database = new Database();
		List<Enterprise> enterprises = database.getEnterprises();
		Enterprise enterprise = database.getEnterpriseById(id);
		RequestDispatcher rd = req.getRequestDispatcher("/updateEnterpriseForm.jsp");
		req.setAttribute("enterprise", enterprise);
		rd.forward(req, resp);
		
	}
	
	

}
