package org.testrunner;

import org.junit.runner.RunWith;

import CommonClass.AdactinBase;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith (Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\folder\\login.feature"},glue = {"StepDefenition"},dryRun=false,monochrome=true)

public class Testrunner   {




}
