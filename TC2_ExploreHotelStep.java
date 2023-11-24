package com.omrbranch.step;
import org.junit.Assert;

import com.omrbranch.base.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_ExploreHotelStep extends BaseClass   {
	PageObjectManager pom = new PageObjectManager();

	@When("User explore Hotels {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userExploreHotelsAnd(String selectState, String selectCity,
			String selectRoomType, String checkIn, String checkOut, String selectNoOfRooms, String selectNoOfAdults,
			String selectNoOfChild) throws InterruptedException {
		pom.getExploreHotelPage().searchhotels(selectState, selectCity, selectRoomType, checkIn, checkOut, selectNoOfRooms, selectNoOfAdults, selectNoOfChild);



	}
	@Then("User should verify sucess message after search Hotel {string}")
	public void userShouldVerifySucessMessageAfterSearchHotel(String verifyTxt) {
		Assert.assertEquals(pom.getExploreHotelPage().verifySuccessMsgAfterSearch(verifyTxt), true);
	}

	@Then("User should verify the room type filters displayed {string}")
	public void userShouldVerifyTheRoomTypeFiltersDisplayed(String selectRoomType) {
		Assert.assertEquals(pom.getExploreHotelPage().verifyDisplayedFilters(selectRoomType), true);

	}
	@Then("User should verify whether the selected room type is displayed and all the Hotel names end with {string}")
	public void userShouldVerifyWhetherTheSelectedRoomTypeIsDisplayedAndAllTheHotelNamesEndWith(String selectRoomType) {
		Assert.assertEquals(pom.getExploreHotelPage().verifyHotelNameEndsWith(selectRoomType), true);

	}

	@When("User click the Hotel search button without selecting any fields")
	public void userClickTheHotelSearchButtonWithoutSelectingAnyFields() {
		pom.getExploreHotelPage().clickHotelSearch();
	}
	@Then("User should verify without entering any search fields error message {string},{string},{string},{string},{string} and {string}")
	public void userShouldVerifyWithoutEnteringAnySearchFieldsErrorMessageAnd(String stateError, String cityError, String checkInError, String checkOutError, String noOfRoomsError,
			String noOfAdultsError) {
		Assert.assertEquals(pom.getExploreHotelPage().verifyErrorMsgInUnselectedBox(stateError, cityError, checkInError,
				checkOutError, noOfRoomsError, noOfAdultsError), true);

	}







}
