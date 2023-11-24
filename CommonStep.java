package com.omrbranch.step;






import org.junit.Assert;

import io.cucumber.java.en.Then;

public class CommonStep {
	@Then("User should verify status code is {int}")
	public void userShouldVerifyStatusCodeIs(int expStatusCode) {
		Assert.assertEquals("Verfiy status code", expStatusCode,TC1_LoginStep.globalDatas.getStatusCode());
	
		
		
		
		

	}


}
