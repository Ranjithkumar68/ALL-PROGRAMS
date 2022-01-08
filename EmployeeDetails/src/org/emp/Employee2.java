package org.emp;

public class Employee2 {

	private void empId(String name, int id) {
		System.out.println("EMPLOYEE NAME:" + name + "\n" + id);
	}

	public static void main(String[] args) {
		Employee2 r = new Employee2();
		r.empId("RANJITH", 6895);
	}
}
