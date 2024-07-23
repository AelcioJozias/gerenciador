package br.com.jozias.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is just to simulate a real connection database
 */
public class Database {

	private static List<Enterprise> enterprises = new ArrayList<>();
	
	{
		Enterprise enterprise1 = new Enterprise();
		enterprise1.setId(1);
		enterprise1.setName("Google");
		Enterprise enterprise2 = new Enterprise();
		enterprise2.setId(2);
		enterprise2.setName("Microsoft");
			
		enterprises.add(enterprise1);
		enterprises.add(enterprise2);
	}
	
	public void add(Enterprise enterprise) {
		enterprises.add(enterprise);
	}

	public List<Enterprise> getEnterprises() {
		return enterprises;
	}
}
