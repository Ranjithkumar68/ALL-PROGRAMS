package org.com;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.library.LibGlobal;

public class JunitFrame extends LibGlobal {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
		launchBrowser("edge", "http://www.facebook.com/");
	}

	@AfterClass
	public static void afterClass() {
		quit();
	}

	@Test
	public void Test() {
		pojo p = new pojo();
		sendKeys(p.getUserName(), "123456");
		sendKeys(p.getPassWord(), "46545");
		p.getBtnLogin().click();
	}

	@Before
	public void before() {

		Date d = new Date();
		System.out.println(d);

	}

	@After
	public void after() {
		Date d = new Date();
		System.out.println(d);
	}

}
