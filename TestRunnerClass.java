package com.omrbranch.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.base.BaseClass;
import com.omrbranch.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@Login or @State or @City or @Address or @Search",plugin="json:target\\Report.json", features="src\\test\\resources",glue="com.omrbranch.step",dryRun=!true,snippets=SnippetType.CAMELCASE,stepNotifications=false)

public class TestRunnerClass extends BaseClass {
	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException {
		Reporting.generateJVMReport("C:\\Users\\vino\\eclipse-workspace\\OmrBranchGroceryApiAutomation\\target\\Report.json");

	}

}

