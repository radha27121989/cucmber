package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={
		"src\\test\\resources\\folder\\amazo.feature" }, glue = {
				"StepDefenition" }, dryRun = false,monochrome= true, plugin ={"json:C:\\Users\\HP\\eclipse-workspace\\Cucumnew\\report\\ad.json",})

public class AmazonTestRnunner    {
@AfterClass
public static void generateRepo() {
JvmReport.reportGe("C:\\Users\\HP\\eclipse-workspace\\Cucumnew\\report\\ad.json");
}
	
	

}
	
	

