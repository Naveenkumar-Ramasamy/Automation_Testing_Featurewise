package com.omrbranch.step;
import org.junit.Assert;

import com.omrbranch.base.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC4_BookHotelStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();

	@When("User add the guest details {string},{string},{string}, {string} and {string}")
	public void userAddTheGuestDetailsAnd(String salutation, String firstName, String lastName, String mobileNo,
			String email) throws InterruptedException {
		pom.getBookHotelPage().enterGuestDetails(salutation, firstName, lastName, mobileNo, email);

	}

	@When("User add the guest details with gst {string},{string},{string}, {string} and {string}")
	public void userAddTheGuestDetailsWithGstAnd(String salutation, String firstName, String lastName, String mobileNo,
			String email) throws InterruptedException {
		pom.getBookHotelPage().enterGuestDetailsWithGst(salutation, firstName, lastName, mobileNo, email);
	}
	@When("User enter the GST details {string},{string} and {string}")
	public void userEnterTheGSTDetailsAnd(String regNo, String companyName, String companyAddress) throws InterruptedException {

		pom.getBookHotelPage().enterGstDetails(regNo, companyName, companyAddress);  
	}

	@When("User enter the payment details {string}")
	public void userEnterThePaymentDetails(String cardType, io.cucumber.datatable.DataTable table) throws InterruptedException {

		pom.getBookHotelPage().enterCardDetails(cardType, table);


	}
	@Then("User should verify sucess message after payment {string} and Order id is save and verify whether selected hotel is booked or not")
	public void userShouldVerifySucessMessageAfterPaymentAndOrderIdIsSaveAndVerifyWhetherSelectedHotelIsBookedOrNot(String bookingConfirmation) {
		pom.getBookHotelPage().saveBookingId();
		Assert.assertEquals(pom.getBookHotelPage().verifyBooking(bookingConfirmation), true);
	}



	@When("User should verify without entering a card details {string},{string},{string},{string},{string},{string}")
	public void userShouldVerifyWithoutEnteringACardDetails(String invalidType,String invalidtCard,String invalidName,String invalidNo,String invalidMonth,String invalidCVV) {
		Assert.assertEquals(pom.getBookHotelPage().verifyErrorMgs(invalidType, invalidtCard, invalidName, invalidNo, invalidMonth, invalidCVV), false);
	}




	@When("User add the special request {string}")
	public void userAddTheSpecialRequest(String data) {
		pom.getBookHotelPage().addSpecialRequest(data);


	}


}
