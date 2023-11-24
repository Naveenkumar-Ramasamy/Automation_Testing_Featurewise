package com.omrbranch.step;
import org.junit.Assert;

import com.omrbranch.base.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3_SelectHotelStep extends BaseClass  {
	PageObjectManager pom = new PageObjectManager();	

	@When("User select the first Hotel name and save the Hotel name,prize")
	public void userSelectTheFirstHotelNameAndSaveTheHotelNamePrize() {
		pom.getSelectHotelPage().saveHotelName();
		pom.getSelectHotelPage().saveHotelPrice();
		
	}
	@When("User accept the alert message to select Hotel")
	public void userAcceptTheAlertMessageToSelectHotel() {
		pom.getSelectHotelPage().selectHotelWithAccept();
	}
	@Then("User should verify after select Hotel name sucess message {string}")
	public void userShouldVerifyAfterSelectHotelNameSucessMessage(String verifyTxt) throws InterruptedException {
		Assert.assertEquals(pom.getSelectHotelPage().verifySuccessMsgAfterAccept(verifyTxt), true);
	}
	@When("User dismiss the alert message")
	public void userDismissTheAlertMessage() {
		pom.getSelectHotelPage().selectHotelWithDismiss();
	}
	
	@Then("User should verify after select Hotel name it remain same page sucess message {string}")
	public void userShouldVerifyAfterSelectHotelNameItRemainSamePageSucessMessage(String verifyTxt) throws InterruptedException {
		Assert.assertEquals(pom.getSelectHotelPage().verifySuccessMsgAfterDismiss(verifyTxt), true);
	}
	
	@When("User click name ascending radio button")
	public void userClickNameAscendingRadioButton() {
		pom.getSelectHotelPage().sortNameAscending();
	}
	
	@Then("User should verify Hotel name in ascending order")
	public void userShouldVerifyHotelNameInAscendingOrder() throws InterruptedException {
		Assert.assertEquals(pom.getSelectHotelPage().verifyNameAscending(), true);
	}
	

	@When("User unselect the room type by click the room type radio button")
	public void userUnselectTheRoomTypeByClickTheRoomTypeRadioButton() {
		pom.getSelectHotelPage().unSelectRoomType();
	}
	
	@Then("User should verify whether all Hotel names are displayed")
	public void userShouldVerifyWhetherAllHotelNamesAreDisplayed() throws InterruptedException {
		Assert.assertEquals(pom.getSelectHotelPage().verifyHotelNamesAfterUnselect(), true);
	}









}
