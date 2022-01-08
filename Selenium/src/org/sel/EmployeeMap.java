package org.sel;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeMap {
	public static void main(String[] args) {
		Map<Integer, Details> m = new LinkedHashMap<>();
		

		Details d = new Details();
		d.setEmpId(100);
		d.setEmpName("Ranjith");
		d.setEmpPhoneNo(8124410260l);

		Details d1 = new Details();
		d1.setEmpId(200);
		d1.setEmpName("Mahesh");
		d1.setEmpPhoneNo(9842967997l);

		m.put(1, d);
		m.put(2, d1);
		m.put(4, d1);
		m.put(4, d);
		Set<Entry<Integer,Details>> entrySet = m.entrySet();
		for (Entry<Integer, Details> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getEmpId()); 
			System.out.println(entry.getValue().getEmpName()); 
			System.out.println(entry.getValue().getEmpPhoneNo()); 

		}
		}

	}

