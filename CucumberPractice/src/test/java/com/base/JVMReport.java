package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateJVMReport(String jsonFile) {
		File loc = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Report");
			
		//cucumber reporting maven dependency
		Configuration con = new Configuration(loc, "Adactin");
		con.addClassifications("Platform", "Windows10");
		
		List<String> li = new ArrayList<String>();
		li.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(li, con);
		builder.generateReports();
	
	}

}
