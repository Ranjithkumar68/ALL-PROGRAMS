package org.edu;

import org.apache.xmlbeans.XmlFactoryHook.ThreadContext;
import org.testng.annotations.Test;

public class Arts  {
	@Test(groups="smoke")
	public void bsc() {
		System.out.println("Bsc");
		System.out.println(Thread.currentThread().getId());
	}
	@Test(invocationCount=5)
	public void bEd() {
		System.out.println("B.Ed");
	}
	@Test(enabled = false)
	public void bA() {
		System.out.println("BA");
		System.out.println(Thread.currentThread().getId());
	}
	@Test(groups="smoke")
	public void bBA() {
		System.out.println("BBA");
		System.out.println(Thread.currentThread().getId());
	}
}
