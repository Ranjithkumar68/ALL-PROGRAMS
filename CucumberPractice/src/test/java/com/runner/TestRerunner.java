package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( glue="com.stepdefinition" ,features= {"@src\\test\\resources\\failed.txt"}, plugin= { "json:src\\test\\resources\\Report\\rerun.json"})
public class TestRerunner {

	@AfterClass
	public static void after() {
	JVMReport.generateJVMReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Report\\rerun.json");
	}
}
