package br.com.jozias.gerenciador.action;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jozias.gerenciador.model.Database;
import br.com.jozias.gerenciador.model.Enterprise;

public class NewEnterprise implements Action{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String enterpriseName = req.getParameter("name");
		String openedDateEnterpriseParam  = req.getParameter("date");
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
		return RedirectAction.REDIRECT.value() + "entry?action=ListEnterprise";
	}

}
