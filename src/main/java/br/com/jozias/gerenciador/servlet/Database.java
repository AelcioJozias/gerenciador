package br.com.jozias.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;

/**
 * This class is just to simulate a real connection database
 */
public class Database {

	private static List<Enterprise> enterprises = new ArrayList<>();
	private static Integer sequenceId = 1;
	
	static {
		Enterprise enterprise1 = new Enterprise();
		enterprise1.setId(sequenceId++);
		enterprise1.setName("Google");
		Enterprise enterprise2 = new Enterprise();
		enterprise2.setId(sequenceId++);
		enterprise2.setName("Microsoft");
		enterprises.add(enterprise1);
		enterprises.add(enterprise2);
	}
	
	public void add(Enterprise enterprise) {
		enterprise.setId(Database.sequenceId++);
		enterprises.add(enterprise);
	}

	public List<Enterprise> getEnterprises() {
		return enterprises;
	}
	
	public Enterprise getEnterpriseById(int id) throws ServletException {
		return Database.enterprises.stream()
				.filter(e -> e.getId() == id)
				.findFirst().orElseThrow(
				() -> new ServletException(
						new ClassNotFoundException("Dont exist a enterprise with this id")));
	}
}
