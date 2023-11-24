package com.omrbranch.step;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.omrbranch.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass extends BaseClass {
	@Before
	public void beforeExecution() throws FileNotFoundException, IOException {
		getBrowserDriver(getPropertyFileValue("browser"));
		lauchbrowser();
		launchUrl(getPropertyFileValue("url"));
		maximizeWindow();
		implicityWait();
	}
	@After
	public void afterExecution() {
		
		quitBrowser();
	}
}
