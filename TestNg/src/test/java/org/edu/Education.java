package org.edu;

import org.testng.annotations.Test;

public class Education  {
	@Test(groups="smoke")
	private void ug() {
		System.out.println("Undergraduate");
		System.out.println(Thread.currentThread().getId());
	}
	@Test(groups="reg")
	private void pg() {
		System.out.println("Postgraduate");
		System.out.println(Thread.currentThread().getId());
	}

	

}
