package com.omrbranch.pages;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.base.BaseClass;

public class ExploreHotelPage extends BaseClass {
	public  ExploreHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement verifyUserName;
	@FindBy(xpath = "//div[@class='row explore-hotels']//h5")
	private WebElement verifySelectHotel;
	@FindBy(id="state")
	private WebElement state; 
	@FindBy(id="city")
	private WebElement city; 
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement roomType; 
	@FindBy(name="check_in")
	private WebElement checkIn; 
	@FindBy(name="check_out")
	private WebElement checkOut; 
	@FindBy(id="no_rooms")
	private WebElement noRooms; 
	@FindBy(id="no_adults")
	private WebElement noAdults; 
	@FindBy(id="no_child")
	private WebElement noChild; 
	@FindBy(id = "hotelsearch_iframe")
	private WebElement switchFrame;
	@FindBy(id="searchBtn")
	private WebElement btnSearch;
	
	public WebElement getVerifyFilters() {
		return verifyFilters;
	}
	public WebElement getVerifyUserName() {
		return verifyUserName;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getCheckIn() {
		return checkIn;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	public WebElement getNoRooms() {
		return noRooms;
	}
	public WebElement getNoAdults() {
		return noAdults;
	}
	public WebElement getNoChild() {
		return noChild;
	}
	public WebElement getSwitchFrame() {
		return switchFrame;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
	//When User explore Hotels
	
	public void searchhotels(String stateName,String cityName,String roomType,String selectInDate,String selectOutDate,String noOfRooms,String noOfAdults,String noOfChild) throws InterruptedException {
		sByVisibleText(getState(),stateName );
		sByVisibleText(getCity(), cityName);
		Thread.sleep(3000);
		sByVisibleText(getRoomType(), roomType);
		sendkeysViaJSExecutor(getCheckIn(), selectInDate);
		sendkeysViaJSExecutor(getCheckOut(), selectOutDate);
		sByVisibleText(getNoRooms(), noOfRooms);
		sByVisibleText(getNoAdults(), noOfAdults);
		insertText(getNoChild(), noOfChild);
		switchToFrameId("hotelsearch_iframe");
		btnClick(btnSearch);
		switchToDefaultFrame();
	}
	
	
	
	@FindBy(xpath="//div[@class='fliter_box_inner mb-4']//h5")
	private List<WebElement> hotelNames;
	@FindBy(id="invalid-state")
	private WebElement invalidState;
	@FindBy(id="invalid-city")
	private WebElement invalidCity;
	@FindBy(id="invalid-check_in")
	private WebElement invalidCheckIn;
	@FindBy(id="invalid-check_out")
	private WebElement invalidCheckOut;
	@FindBy(id="invalid-no_rooms")
	private WebElement invalidNoRooms;
	@FindBy(id="invalid-no_adults")
	private WebElement invalidNoAdults;
	@FindBy(xpath = "//a[@id='room_type']")
	private WebElement verifyFilters;
	
	
	
	
	public WebElement getVerifySelectHotel() {
		return verifySelectHotel;
	}
	public List<WebElement> getHotelNames() {
		return hotelNames;
	}
	public WebElement getInvalidState() {
		return invalidState;
	}
	public WebElement getInvalidCity() {
		return invalidCity;
	}
	public WebElement getInvalidCheckIn() {
		return invalidCheckIn;
	}
	public WebElement getInvalidCheckOut() {
		return invalidCheckOut;
	}
	public WebElement getInvalidNoRooms() {
		return invalidNoRooms;
	}
	public WebElement getInvalidNoAdults() {
		return invalidNoAdults;
	}
	
	
	
	// Verifying 6 error meassages without entering any field in Explore Hotels
	public void clickHotelSearch() {
		switchToFrameId("hotelsearch_iframe");
		btnClick(btnSearch);
		switchToDefaultFrame();
	}
	// User should verify a success message after searching for hotel "Select Hotel"
		public boolean verifySuccessMsgAfterSearch(String verifyTxt) {
			String text = getWebText(getVerifySelectHotel());
			boolean equals = text.equals(verifyTxt);
			return equals;
		}
		
		// User should verify the filters displayed "<Select Room Type>"
		public boolean verifyDisplayedFilters(String selectRoomType) {
			String text = getWebText(getVerifyFilters());
			boolean equals = text.equals(selectRoomType);
			return equals;
		}
		
		// User should verify whether the selected room type is displayed and all the hotel names end with "<Select Room Type>"
		public boolean verifyHotelNameEndsWith(String selectRoomType) {
			List<WebElement> hotelNames = getHotelNames();
			List<String> l1 = new ArrayList<String>();
			List<String> l2 = new ArrayList<String>();
			for (WebElement hNames : hotelNames) {
				String text = hNames.getText();
				if (text.endsWith(selectRoomType)) {
					l1.add(text);
				} else {
					l2.add(text);
				}
			}boolean empty = l2.isEmpty();
			return empty;
		}
	
		public boolean verifyErrorMsgInUnselectedBox(String stateError, String cityError, String checkInError,
				String checkOutError, String noOfRoomsError, String noOfAdultsError) {

			String invalidState = getWebText(getInvalidState());
			String invalidCity = getWebText(getInvalidCity());
			String invalidCheckIn = getWebText(getInvalidCheckIn());
			String invalidCheckOut = getWebText(getInvalidCheckOut());
			String invalidNoOfRooms = getWebText(getInvalidNoRooms());
			String invalidNoOfAdults = getWebText(getInvalidNoAdults());

			if (invalidState.equals(stateError) && invalidCity.equals(cityError) && invalidCheckIn.equals(checkInError)
					&& invalidCheckOut.equals(checkOutError) && invalidNoOfRooms.equals(noOfRoomsError)
					&& invalidNoOfAdults.equals(noOfAdultsError)) {
				return true;
			} else {
				return false;
			}
		}


}
