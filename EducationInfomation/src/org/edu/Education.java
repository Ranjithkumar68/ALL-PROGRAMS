package org.edu;

public class Education extends Arts {
	private void ug() {
		System.out.println("Undergraduate");
	}

	private void pg() {
		System.out.println("Postgraduate");
	}

	public static void main(String[] args) {
		Education e = new Education();
		e.ug();
		e.pg();
		e.bsc();
		e.bEd();
		e.bA();
		e.bBA();
		e.bE();
		e.bTech();
		e.physio();
		e.dental();
		e.mbbs();
	}

}
