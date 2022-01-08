package org.hexa;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Company {
	@DataProvider(name = "testdata",parallel=true)
	public Object[][] data() {
		return new Object[][] {{"ranjith","12345"},{"kumar","1345"},{"rko","12345"}};
	}


}
