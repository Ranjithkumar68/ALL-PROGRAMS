package org.edu;

import org.testng.annotations.Test;

public class Medicine {
	@Test(groups="smoke")
	public void physio() {
System.out.println("BPT");
System.out.println(Thread.currentThread().getId());
	}
	@Test(groups="reg")
	public void dental() {
System.out.println("BDS");
System.out.println(Thread.currentThread().getId());
	}
	@Test(groups="reg")
	public void mbbs() {
System.out.println("MBBS");
System.out.println(Thread.currentThread().getId());
	}

}
