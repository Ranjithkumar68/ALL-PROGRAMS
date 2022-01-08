package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.base.JVMReport;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features", glue="com.stepdefinition" ,
dryRun=false, plugin= { "json:src\\test\\resources\\Report\\Adactin.json"}, 
tags= {"@reg,@smoke"})
public class TestRunner {
	
	@AfterClass
		public static void after() {
		JVMReport.generateJVMReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Report\\Adactin.json");
		}
	

}
//plugin= {
//		"pretty" ,"junit:src\\test\\resources\\Report\\adactin.xml" , "html:src\\test\\resources\\Report", "json:src\\test\\resources\\Report.Adactin.json"} ,monochrome=true)
