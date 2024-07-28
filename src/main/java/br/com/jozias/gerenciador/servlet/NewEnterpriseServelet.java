package br.com.jozias.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jozias.gerenciador.model.Database;
import br.com.jozias.gerenciador.model.Enterprise;

/**
 * Servlet implementation class NewEnterpriseServelet
 */
@WebServlet("/newEnterprise")
public class NewEnterpriseServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String enterpriseName = request.getParameter("name");
		String openedDateEnterpriseParam  = request.getParameter("date");
		Date openedDate = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			openedDate = sdf.parse(openedDateEnterpriseParam);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		Database database = new Database();
		Enterprise enterprise = new Enterprise();
		enterprise.setName(enterpriseName);
		enterprise.setOpenedDate(openedDate);
		database.add(enterprise);
		response.sendRedirect("listEnterprises");
	}

}
