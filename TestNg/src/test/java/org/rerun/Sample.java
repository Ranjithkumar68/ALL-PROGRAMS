package org.rerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
	@Test
	private void tc6() {
		System.out.println("s6");
		Assert.assertTrue(false);

	}

	@Test
	private void tc7() {
		Assert.assertTrue(false);

	}

	@Test
	private void tc8() {
		Assert.assertTrue(false);

	}

	@Test
	private void tc9() {
		System.out.println("s9");
		Assert.assertTrue(false);
	}

	@Test
	private void tc10() {

	}
}
