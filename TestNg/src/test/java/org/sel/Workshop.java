package org.sel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Workshop {
	
	private void CountDuplicate() {
		List<Integer> n = new ArrayList<Integer>();
		n.add(10);
		n.add(20);
		n.add(30);
		n.add(40);
		n.add(10);//duplicate
		n.add(20);
		n.add(30);
		Set<Integer> s = new HashSet<Integer>();
		s.addAll(n);
		System.out.println(n.size()-s.size());
		}
	
	private void dup() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Santosh");
		al.add("Saket");
		al.add("Saket");
		al.add("Shyam");
		al.add("Santosh");
		al.add("Shyam");
		al.add("Santosh");
		al.add("Santosh");
		HashSet<String> hs = new HashSet<String>();
		hs.addAll(al);
		int totalDuplicates =al.size() - hs.size();
		System.out.println(totalDuplicates);
		
	}
	public static void main(String[] args) {
	Workshop w = new Workshop();
	w.CountDuplicate();
//	w.dup();
	}
	
		
	


}
