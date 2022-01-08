package org.company;

public class Company extends Client {
	private void CompanyName() {
		System.out.println("WIPRO");
	}

	public static void main(String[] args) {
		Company c = new Company();
		c.CompanyName();
		c.ClientName();
	}
}
