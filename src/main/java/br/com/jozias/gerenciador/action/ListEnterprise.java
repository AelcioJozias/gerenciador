package br.com.jozias.gerenciador.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jozias.gerenciador.model.Database;
import br.com.jozias.gerenciador.model.Enterprise;

public class ListEnterprise implements Action{
	
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		getClass().getName();
		Database database = new Database();
		List<Enterprise> enterprises = database.getEnterprises();
		enterprises.forEach(e -> {
			System.out.println(e.getName());
		});
		System.out.println("quantity: " + enterprises.size());
		req.setAttribute("enterprises", enterprises);
		return "forward:" + "listEnterprises.jsp";
	}

}
