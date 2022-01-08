package org.rerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Company {
	@Test(retryAnalyzer=Failed.class)
	private void tc1() {
		System.out.println("c1");
		Assert.assertTrue(false);

	}

	@Test
	private void tc2() {
		Assert.assertTrue(false);
	}

	@Test(retryAnalyzer=Failed.class)
	private void tc3() {
		System.out.println("c3");
		Assert.assertTrue(false);

	}

	@Test
	private void tc4() {
		Assert.assertTrue(false);
	}

	@Test
	private void tc5() {

	}

}
