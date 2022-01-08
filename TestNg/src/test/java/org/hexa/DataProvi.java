package org.hexa;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvi {
	@Test(dataProvider="testdata")
	private void tc1(String s1,int s2) {
		System.out.println(s1+"\t"+s2);
		
	}
	
	@DataProvider(name = "testdata")
	@Test
	public Object[][] data() {
		Object obj[][] = new Object[][] {{"ranjith",1234},{"kumar",2548},{"rko",555}}; 
		return obj;
	}

	}

