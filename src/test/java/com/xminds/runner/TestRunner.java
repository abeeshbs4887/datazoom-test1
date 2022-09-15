package com.xminds.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.xminds.report.Report;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\asus\\eclipse-workspace\\DataZoom\\resources\\Features",glue="com.xminds.steps"
,dryRun=false,snippets=SnippetType.CAMELCASE,plugin="json:target/output.json")
public class TestRunner {

	@AfterClass
	public static void afterClass() {
		Report.generateJVMReports(System.getProperty("user.dir")+"\\target\\output.json");
	}
	
}
