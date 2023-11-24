package com.omrbranch.step;
import java.awt.AWTException;

import org.junit.Assert;

import com.omrbranch.base.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginStep extends BaseClass  {
PageObjectManager pom=new PageObjectManager();
	

	@Given("User is on the OMR Branch Hotel page")
	public void userIsOnTheOMRBranchHotelPage(){
	
	}
	@When("User login {string},{string}")
	public void userLogin(String userName, String password) {
		pom.getLoginPage().login(userName, password);
	}
	@Then("User should verify sucess message after login {string}")
	public void userShouldVerifySucessMessageAfterLogin(String expLoginSuccessMgs) {
		Assert.assertEquals(pom.getLoginPage().verifyLoginSuccessMessage(expLoginSuccessMgs), true);

	}

	@When("User login {string},{string} with Enter key")
	public void userLoginWithEnterKey(String userName, String password) throws AWTException {
		pom.getLoginPage().loginWithEnter(userName, password);		
	}
	@Then("User should verify error message after login {string}")
	public void userShouldVerifyErrorMessageAfterLogin(String loginError) {
		Assert.assertEquals(pom.getLoginPage().getLoginTextErrorMgs(loginError), false);	
		
	
	
	}







}
