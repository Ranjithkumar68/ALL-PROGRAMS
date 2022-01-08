package org.rerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Employee {
	@Test
	private void tc11() {

	}

	@Test
	private void tc12() {
		Assert.assertTrue(false);

	}

	@Test(retryAnalyzer=Failed.class)
	private void tc13() {
		System.out.println("e13");
		Assert.assertTrue(false);

	}

	@Test(retryAnalyzer=Failed.class)
	private void tc14() {
		System.out.println("e14");
		Assert.assertTrue(false);
	}

	@Test
	private void tc15() {

	}
}
