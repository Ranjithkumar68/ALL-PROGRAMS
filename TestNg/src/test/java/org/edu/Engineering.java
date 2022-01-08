package org.edu;

import org.testng.annotations.Test;

public class Engineering {
	@Test(groups="smoke")
	public  void bE() {
System.out.println("BE");
System.out.println(Thread.currentThread().getId());
	}
	@Test(groups="reg")
	public  void bTech() {
System.out.println("B.Tech");
System.out.println(Thread.currentThread().getId());
	}

}
