package com.omrbranch.step;
import org.junit.Assert;

import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC6_CancelBookingStep {
	PageObjectManager pom=new PageObjectManager();
	@When("User click the cancel button")
	public void userClickTheCancelButton() {
		pom.getBookingPage().clickCancelBtn();
	   
	}
	@Then("User should verify success message after cancel the booking {string}")
	public void userShouldVerifySuccessMessageAfterCancelTheBooking(String cancelledMsg) {
		Assert.assertEquals(pom.getBookingPage().verifyCancelSucessMgs(cancelledMsg), true);
	}
	
	




	


}
