package br.com.jozias.gerenciador.action;

public enum RedirectAction {
	
	REDIRECT("redirect:"),
	FORWARD("forward:");
	
	RedirectAction(String value) {
		this.value = value;
	}

	private String value;
	
	public String value() {
		return this.value;
	}
	
	
}
