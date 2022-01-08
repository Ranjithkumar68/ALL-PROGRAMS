package org.sel;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	public static void main(String[] args) {
		List<Details> li = new ArrayList<Details>();
		
		Details d = new Details();
		d.setEmpId(100);
		d.setEmpName("Ranjith");
		d.setEmpPhoneNo(8124410260l);
		
		
		Details d1 = new Details();
		d1.setEmpId(200);
		d1.setEmpName("Mahesh");
		d1.setEmpPhoneNo(9842967997l);
	
		li.add(d);
		li.add(d1);
		for (int i = 0; i <li.size(); i++) {
			System.out.println(li.get(i).getEmpId());
			System.out.println(li.get(i).getEmpName());
			System.out.println(li.get(i).getEmpPhoneNo());
			
		}
		
	
	}
}
