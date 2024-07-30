package br.com.jozias.gerenciador.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewEnterpriseForm implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		return RedirectAction.FORWARD.value() + "newEnterpriseForm.jsp";
	}

}
