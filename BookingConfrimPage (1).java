package com.omrbranch.pages;
import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.base.BaseClass;

public class BookingConfrimPage extends BaseClass {
	public BookingConfrimPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement btnDownOption;

	@FindBy(xpath = "//a[text()='My Account']")
	private WebElement btnMyAccount;
	
	@FindBy(xpath = "(//div[@class='col-md-5'])[1]")
	private WebElement afterNavigateSucessMgs;
	

	@FindBy(xpath = "//input[@name='search']")
	private WebElement txtEnterID;

	@FindBy(xpath = "(//div[@id='bookinglist']//h5)[1]")
	private WebElement verifyHotelName;
	
	@FindBy(xpath = "(//div[@id='bookinglist']//span)[1]")
	private WebElement verifyOrderId;

	@FindBy(xpath = "(//div[@id='bookinglist']//strong)[1]")
	private WebElement verifyPrice;
	
	@FindBy(xpath = "(//div[@class='my-booking  prize']//button[text()='Edit'])[1]")
	private WebElement btnEditBooking;

	@FindBy(xpath = "//input[@placeholder='Check-In --/--/--']")
	private WebElement modifyCheckIn;

	@FindBy(xpath = "//button[text()='Confirm']")
	private WebElement btnConfirm;

	@FindBy(xpath = "//li[@class='alertMsg']")
	private WebElement bookingConfirmationMsg;

	public WebElement getBtnDownOption() {
		return btnDownOption;
	}

	public WebElement getBtnMyAccount() {
		return btnMyAccount;
	}

	public WebElement getAfterNavigateSucessMgs() {
		return afterNavigateSucessMgs;
	}

	public WebElement getTxtEnterID() {
		return txtEnterID;
	}

	

	public WebElement getVerifyHotelName() {
		return verifyHotelName;
	}

	public WebElement getVerifyOrderId() {
		return verifyOrderId;
	}

	public WebElement getVerifyPrice() {
		return verifyPrice;
	}

	public WebElement getBtnEditBooking() {
		return btnEditBooking;
	}

	public WebElement getModifyCheckIn() {
		return modifyCheckIn;
	}

	public WebElement getBtnConfirm() {
		return btnConfirm;
	}

	public WebElement getBookingConfirmationMsg() {
		return bookingConfirmationMsg;
	}

	// User navigates to My Bookings and searches for bookings by providing the
	// booking Id
	public void findMyBookings() {
		waitExplicitlyForElementTobeClickable(getBtnDownOption(), 10);
		btnClick(getBtnDownOption());
		btnClick(getBtnMyAccount());
		
	}
	
	//User verify success message {string} after navigate into my bookings page
	public  boolean afterSuccessMgs(String s) {
		String text = getWebText(getAfterNavigateSucessMgs());
		boolean contains = text.contains(s);
		return contains;

	}
	
	//User enter and search the generated order id
	public void searchOrderId() throws AWTException {
		insertText(getTxtEnterID(),BookHotelPage.bookingId);
		keyPressActionsTab();
	}
	
	

	//User should verify booking Hotel name same or not
	
	public boolean bookingHotelNameSameOrNot() throws InterruptedException {
		
			boolean isEqual = false;
			Thread.sleep(2000);
			String text = getWebText(getVerifyHotelName());
			if (text.contains(SelectHotelPage.hotelName) ) {
				isEqual = true;
			}
			return isEqual;

		}
	
	
	// User should verify the booking id 
	public boolean verifyBookingId() throws InterruptedException {
		boolean isEqual = false;
		Thread.sleep(2000);
		String text = getWebText(getVerifyOrderId());
		if ( text.contains(BookHotelPage.bookingId)) {
			isEqual = true;
		}
		return isEqual;
	}

	//User should verify the same price or not
	public boolean verifySamePriceOrNot() throws InterruptedException {
		boolean isEqual = false;
		Thread.sleep(2000);
		String text = getWebText(getVerifyPrice());
		if (text.contains(SelectHotelPage.hotelPrice) ) {
			isEqual = true;
		}
		return isEqual;


	}
	
	
	// User modify the booking date "<Check-In-Update>"
	public void modifyBookingDate(String checkInUpdate)  {
		waitExplicitlyForElementTobeClickable(getBtnEditBooking(), 10);
		btnClick(getBtnEditBooking());
		btnClick(getModifyCheckIn());
		sendkeysViaJSExecutor(modifyCheckIn, checkInUpdate);
		btnClick(getBtnConfirm());
	}

	// User should verify success message after edit booking "Booking updated
	// successfully"
	public boolean verifyBookingUpdateMsg(String bookingUpdateMsg) {
		waitExplicitlyForVisibility(5, getBookingConfirmationMsg());
		String text = getWebText(getBookingConfirmationMsg());
		boolean equals = text.equals(bookingUpdateMsg);
		return equals;
	}

	//User modify the first order  id booking {string}
	public void firstOrderId(String checkInUpdate) {
		btnClick(getBtnEditBooking());
		btnClick(getModifyCheckIn());
		sendkeysViaJSExecutor(modifyCheckIn, checkInUpdate);
		btnClick(getBtnConfirm());

	}
//User enter the existing 
	public void existingOderId(String bookingId) {
		insertText(getTxtEnterID(),BookHotelPage.bookingId);
	}

//User should verify the same order id is displayed
	public boolean verifyExistingSameOrderId() throws InterruptedException {
		boolean isEqual = false;
		Thread.sleep(2000);
		String text = getWebText(getVerifyOrderId());
		if ( text.contains(BookHotelPage.bookingId)) {
			isEqual = true;
		}
		return isEqual;

	}
	
	
	
}
