package com.omrbranch.runner;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.base.BaseClass;
import com.omrbranch.report.Report;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(plugin="json:target//Report.json", features="src\\test\\resources",glue="com.omrbranch.step",dryRun=!true,snippets=SnippetType.CAMELCASE,stepNotifications=false)

public class Runner extends BaseClass {
	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException {
Report.generateJVMReport(getProjectPath()+"\\target\\Report.json");

	}

}
