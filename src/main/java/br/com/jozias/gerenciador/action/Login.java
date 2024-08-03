package br.com.jozias.gerenciador.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jozias.gerenciador.model.Database;
import br.com.jozias.gerenciador.model.User;

public class Login implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String login = req.getParameter("login");
		String password = req.getParameter("password");
		Database database = new Database();
		User user = database.existUser(login, password);
		if(user != null) {
			return RedirectAction.REDIRECT.value() + "entry?action=ListEnterprise";
		} else {
			return RedirectAction.REDIRECT.value() + "entry?action=LoginForm";
		}
		
	}

}
