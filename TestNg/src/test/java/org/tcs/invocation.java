package org.tcs;

import org.testng.annotations.Test;

public class invocation {
	
	@Test(invocationCount = 10)
	private void test1() {
		System.out.println("Ranjith");
	}
	
	
}
