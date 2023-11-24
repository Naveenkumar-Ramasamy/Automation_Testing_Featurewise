package com.omrbranch.step;
import java.awt.AWTException;

import org.junit.Assert;

import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TC5_ChangeBookingStep {
	PageObjectManager pom = new PageObjectManager();
	@When("User navigates to My Bookings page")
	public void userNavigatesToMyBookingsPage() {
		pom.getBookingConfrimPage().findMyBookings();

	}
	@Then("User verify success message {string} after navigate into my bookings page")
	public void userVerifySuccessMessageAfterNavigateIntoMyBookingsPage(String string) {
		Assert.assertEquals(pom.getBookingConfrimPage().afterSuccessMgs(string), true);	
	}
	@When("User enter and search the generated order id")
	public void userEnterAndSearchTheGeneratedOrderId() throws AWTException {
		pom.getBookingConfrimPage().searchOrderId();
	}
	@Then("User should verify the same order id or not")
	public void userShouldVerifyTheSameOrderIdOrNot() throws InterruptedException {
		Assert.assertEquals(pom.getBookingConfrimPage().verifyBookingId(), true);

	}
	@Then("User should verify the same Hotel name or not")
	public void userShouldVerifyTheSameHotelNameOrNot() throws InterruptedException {
		Assert.assertEquals(pom.getBookingConfrimPage().bookingHotelNameSameOrNot(), true);
	}
	@Then("User should verify the same price or not")
	public void userShouldVerifyTheSamePriceOrNot() throws InterruptedException {
		Assert.assertEquals(pom.getBookingConfrimPage().verifySamePriceOrNot(), false);

	}
	@When("User modify the booking date {string}")
	public void userModifyTheBookingDate(String checkInUpdate) {
		pom.getBookingConfrimPage().modifyBookingDate(checkInUpdate);
	}
	@Then("User should verify success message after edit booking {string}")
	public void userShouldVerifySuccessMessageAfterEditBooking(String bookingUpdateMsg) {
		Assert.assertEquals(pom.getBookingConfrimPage().verifyBookingUpdateMsg(bookingUpdateMsg), true);
	}

	@When("User modify the first order  id booking {string}")
	public void userModifyTheFirstOrderIdBooking(String checkInUpdate) {
		pom.getBookingConfrimPage().firstOrderId(checkInUpdate);
	}
	@Then("User should verify success message after modify the chckin date {string}")
	public void userShouldVerifySuccessMessageAfterModifyTheChckinDate(String bookingUpdateMsg) {
		Assert.assertEquals(pom.getBookingConfrimPage().verifyBookingUpdateMsg(bookingUpdateMsg), true);
	}

	@When("User enter the existing {string}")
	public void userEnterTheExisting(String bookingId) {
		pom.getBookingConfrimPage().existingOderId(bookingId);

	}
	@Then("User should verify the same order id is displayed")
	public void userShouldVerifyTheSameOrderIdIsDisplayed() throws InterruptedException {
		
		Assert.assertEquals(pom.getBookingConfrimPage().verifyExistingSameOrderId(), true);
	}








}
