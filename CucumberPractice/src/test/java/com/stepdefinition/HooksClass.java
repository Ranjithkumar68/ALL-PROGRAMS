package com.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.LibGlobal;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends LibGlobal  {

	@Before
	public void beforeExecution() {
		launchBrowser("https://adactinhotelapp.com/");
		
	}
	@After
	public void afterExecution(Scenario s) {
		
	
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		byte[] bs = tk.getScreenshotAs(OutputType.BYTES);
		s.embed(bs, "img/png");
		
		quit();
	}
}
