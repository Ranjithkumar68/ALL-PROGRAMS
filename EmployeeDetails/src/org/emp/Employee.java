package org.emp;


public class Employee {
	
	
private void empId() {
	System.out.println("empId - 68");
}
private void empName() {
	System.out.println("empName - RANJITHKUMAR");
}
private void empDob() {
System.out.println("empDob - 06.07.1995");
}
private void empPhone() {
	System.out.println("empPhone - 8124410260");
}
private void empEmail() {
System.out.println("empEMail - ranjithkumar68j@gmail.com");
}
private void empAddress() {
	System.out.println("empAddress - Mayiladuthurai");
}
public static void main(String[] args) {
	Employee r = new Employee();
			r.empId();
	r.empName();
	r.empDob();
	r.empPhone();
	r.empEmail();
	r.empAddress();
}
}
