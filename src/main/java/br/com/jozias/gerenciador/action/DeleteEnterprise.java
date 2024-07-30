package br.com.jozias.gerenciador.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jozias.gerenciador.model.Database;
import br.com.jozias.gerenciador.model.Enterprise;

public class DeleteEnterprise implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		Database database = new Database();
		List<Enterprise> enterprises = database.getEnterprises();
		Enterprise enterprise = database.getEnterpriseById(id);
		database.delete(enterprise);
		return "redirect:" + "entry?action=ListEnterprise";
	}

}
