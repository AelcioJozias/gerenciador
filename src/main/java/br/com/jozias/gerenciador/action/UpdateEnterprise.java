package br.com.jozias.gerenciador.action;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;

import br.com.jozias.gerenciador.model.Database;
import br.com.jozias.gerenciador.model.Enterprise;

public class UpdateEnterprise implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
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
		return RedirectAction.REDIRECT.value() + "entry?action=ListEnterprise";
	}

}
