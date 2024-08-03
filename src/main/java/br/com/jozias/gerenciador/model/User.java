package br.com.jozias.gerenciador.model;

public class User {
	
	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	private String login;
	private String password;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEquals(String login, String password) {
		if (!this.login.equals(login) && !this.password.equals(password)) {
			return false;
		}
		return true;
	}
}