package org;

public class CompanyInfo {

	private void CompanyName(String name, int year) {
		System.out.println("Company Name:" + name + "\n" + year);
	}

	private void CompanyName(int phoneNo, String Email) {
		System.out.println(phoneNo +"\t"+ Email);
	}

	private void CompanyName(String Address, long pincode) {
		System.out.println(Address + "\n" + pincode);
	}

	public static void main(String[] args) {
		CompanyInfo c = new CompanyInfo();
		c.CompanyName("WIPRO", 1995);
		c.CompanyName(260260, "wipro@gmail.com");
		c.CompanyName("chennai", 600001L);
}
}
//QUESTION 4:
//------------
// Project     :MyPhone
// Package     :org.phone
// Class       :Phone
// Methods     :phoneInfo()
//
//Description
//You have to overload the method phoneInfo() 
//based on different datatype order in arguments