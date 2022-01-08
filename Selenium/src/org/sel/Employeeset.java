package org.sel;

import java.util.LinkedHashSet;
import java.util.Set;

public class Employeeset {
	public static void main(String[] args) {
		Set<Details> s = new LinkedHashSet<>();

		Details d = new Details();
		d.setEmpId(100);
		d.setEmpName("Ranjith");
		d.setEmpPhoneNo(8124410260l);

		Details d1 = new Details();
		d1.setEmpId(200);
		d1.setEmpName("Mahesh");
		d1.setEmpPhoneNo(9842967997l);

		s.add(d);
		s.add(d1);
		for (Details x : s) {
			System.out.println(x.getEmpId());
			System.out.println(x.getEmpName());
			System.out.println(x.getEmpPhoneNo());
		
		}
		}

	}

