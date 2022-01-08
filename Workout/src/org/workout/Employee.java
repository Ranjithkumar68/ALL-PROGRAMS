package org.workout;
import java.util.Scanner;
public class Employee {
	
	private static Scanner input;

	public static void main(String[] args) {	
		String empName;
		int empId;
		String empDob;
		long empPhone;
		String empEmail;
		String empAddress;
	
	input = new Scanner(System.in);
	
	System.out.println("Enter Your Name:");
	empName = input.next();
	System.out.println("Enter Your ID:");
	empId = input.nextInt();
	System.out.println("Enter your DOB:");
	empDob = input.next();
	System.out.println("Enter your Phone No:");
	empPhone = input.nextLong();
	System.out.println("Enter you EMailID:");
	empEmail = input.next();
	System.out.println("Enter your address");
	empAddress = input.next();
	
	System.out.println("Name:"+ " "+empName.toUpperCase());
	System.out.println("ID:"+ " "+empId);
	System.out.println("DOB:"+ empDob);
	System.out.println("PhoneNO:"+empPhone);
	System.out.println("Email:" + empEmail);
System.out.println("Address:"+ empAddress.toUpperCase());

	}}



