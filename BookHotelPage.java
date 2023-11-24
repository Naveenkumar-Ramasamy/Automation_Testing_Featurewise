package com.omrbranch.pages;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.base.BaseClass;

import io.cucumber.datatable.DataTable;

public class BookHotelPage extends BaseClass {
	public  BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@type='radio'][@value='own']")
	private WebElement radioMyself;

	@FindBy(id="user_title")
	private WebElement selectSalutation;

	@FindBy(xpath="//input[@placeholder='First Name *']")
	private WebElement txtFirstName;

	@FindBy(xpath="//input[@placeholder='Last Name *']")
	private WebElement txtLastName;

	@FindBy(xpath="//input[@placeholder='Mobile No. *']")
	private WebElement txtMobileNo;

	@FindBy(xpath="//input[@placeholder='Email *']")
	private WebElement txtEmail;

	@FindBy(id ="gst")
	private WebElement clickGstCheckBox;

	@FindBy(id ="gst_registration")
	private WebElement txtGstReg;

	@FindBy(id ="company_name")
	private WebElement txtCompanyName;

	@FindBy(id ="company_address")
	private WebElement txtCompanyAddress;


	@FindBy(id = "step1next")
	private WebElement btnNext1;

	@FindBy(id = "early")
	private WebElement clickEarly;

	@FindBy(id = "other_request")
	private WebElement txtOtherRequest;


	@FindBy(id = "step2next")
	private WebElement btnNext2;

	@FindBy(xpath = "(//div[@class='fliter_box_inner'])[3]")
	private WebElement selectPaymentModeUsingCard;

	@FindBy(id= "payment_type")
	private WebElement selectCardType;

	@FindBy(xpath = "//select[@name='card_type']")
	private WebElement selectCard;

	@FindBy(xpath = "//input[@placeholder='Enter Card Number *']")
	private WebElement txtCardNo;

	@FindBy(xpath = "//input[@placeholder='Enter Your Name On Card *']")
	private WebElement txtCardName;

	@FindBy(xpath = "//select[@name='card_month']")
	private WebElement selectMonth;

	@FindBy(xpath = "//select[@name='card_year']")
	private WebElement selectYear;

	@FindBy(xpath = "//input[@name='cvv']")
	private WebElement txtCardCVV; 

	@FindBy(id = "submitBtn")
	private WebElement btnSubmit;

	@FindBy(id = "invalid-payment_type")
	private WebElement invalidCardType;

	@FindBy(id = "invalid-card_type")
	private WebElement invalidSelectCard;

	@FindBy(id = "invalid-card_no")
	private WebElement invalidCardNo;

	@FindBy(id = "invalid-card_name")
	private WebElement invalidCardName;

	@FindBy(id = "invalid-card_month")
	private WebElement invalidCardMonth;

	@FindBy(id = "invalid-cvv")
	private WebElement invalidCardCVV;

	@FindBy(xpath = "//strong[starts-with(text(),'#')]")
	private WebElement bookingID;

	@FindBy(xpath = "//h2[text()=' Booking is Confirmed ']")
	private WebElement bookingConfirmationMsg;

	@FindBy(xpath = "//p//strong[text()]")
	private WebElement bookedHotelName;

	@FindBy(xpath = "//button[text()='My Booking']")
	private WebElement btnMyBooking;


	public WebElement getRadioMyself() {
		return radioMyself;
	}

	public WebElement getSelectSalutation() {
		return selectSalutation;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtMobileNo() {
		return txtMobileNo;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}


	public WebElement getClickGstCheckBox() {
		return clickGstCheckBox;
	}

	public WebElement getTxtGstReg() {
		return txtGstReg;
	}

	public WebElement getTxtCompanyName() {
		return txtCompanyName;
	}

	public WebElement getTxtCompanyAddress() {
		return txtCompanyAddress;
	}



	public WebElement getInvalidCardType() {
		return invalidCardType;
	}

	public WebElement getInvalidSelectCard() {
		return invalidSelectCard;
	}

	public WebElement getInvalidCardNo() {
		return invalidCardNo;
	}

	public WebElement getInvalidCardName() {
		return invalidCardName;
	}

	public WebElement getInvalidCardMonth() {
		return invalidCardMonth;
	}

	public WebElement getInvalidCardCVV() {
		return invalidCardCVV;
	}

	public static String getBookingId() {
		return bookingId;
	}

	public WebElement getBtnNext1() {
		return btnNext1;
	}


	public WebElement getClickEarly() {
		return clickEarly;
	}

	public WebElement getTxtOtherRequest() {
		return txtOtherRequest;
	}

	public WebElement getBtnNext2() {
		return btnNext2;
	}

	public WebElement getSelectPaymentModeUsingCard() {
		return selectPaymentModeUsingCard;
	}

	public WebElement getSelectCardType() {
		return selectCardType;
	}

	public WebElement getSelectCard() {
		return selectCard;
	}

	public WebElement getTxtCardNo() {
		return txtCardNo;
	}

	public WebElement getTxtCardName() {
		return txtCardName;
	}

	public WebElement getSelectMonth() {
		return selectMonth;
	}

	public WebElement getSelectYear() {
		return selectYear;
	}

	public WebElement getTxtCardCVV() {
		return txtCardCVV;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public WebElement getBookingID() {
		return bookingID;
	}

	public WebElement getBookingConfirmationMsg() {
		return bookingConfirmationMsg;
	}

	public WebElement getBookedHotelName() {
		return bookedHotelName;
	}

	public WebElement getBtnMyBooking() {
		return btnMyBooking;
	}


	// When User enters guest details
	public void enterGuestDetails(String salutation, String firstName, String lastName, String mobileNo, String email) throws InterruptedException {
		Thread.sleep(3000);
		btnClick(getRadioMyself());
		sByVisibleText(getSelectSalutation(), salutation);
		insertText(getTxtFirstName(), firstName);
		insertText(getTxtLastName(), lastName);
		insertText(getTxtMobileNo(), mobileNo);
		insertText(getTxtEmail(), email);
		btnClick(getBtnNext1());
		btnClick(getBtnNext2());

	}

	public void enterGuestDetailsWithGst(String salutation, String firstName, String lastName, String mobileNo, String email) throws InterruptedException {
		Thread.sleep(3000);
		btnClick(getRadioMyself());
		sByVisibleText(getSelectSalutation(), salutation);
		insertText(getTxtFirstName(), firstName);
		insertText(getTxtLastName(), lastName);
		insertText(getTxtMobileNo(), mobileNo);
		insertText(getTxtEmail(), email);


	}

	// user enter gst details
	public void enterGstDetails(String regNo, String companyName, String companyAddress) throws InterruptedException {

		btnClick(getClickGstCheckBox());
		Thread.sleep(3000);
		insertText(getTxtGstReg(), regNo);
		insertText(getTxtCompanyName(), companyName);
		insertText(getTxtCompanyAddress(), companyAddress);
		btnClick(getBtnNext1());




	}

	//User should verify without entering a card details
	public boolean verifyErrorMgs(String invalidType,String invalidtCard,String invalidName,String invalidNo,String invalidMonth,String invalidCVV ) {
		btnClick(getSelectPaymentModeUsingCard());
		btnClick(getBtnSubmit());
		String invalidCardType = getWebText(getInvalidCardType());
		String invalidSelectCard = getWebText(getInvalidSelectCard());
		String invalidCardName = getWebText(getInvalidCardName());
		String invalidCardNo = getWebText(getInvalidCardNo());
		String invalidCardMonth = getWebText(getInvalidCardMonth());
		String invalidCardCVV = getWebText(getInvalidCardCVV());
		if (invalidCardType.equals(invalidType) && invalidSelectCard.equals(invalidtCard) && invalidCardName.equals(invalidName) 
				&& invalidCardNo.equals(invalidNo) && invalidCardMonth.equals(invalidMonth) && invalidCardCVV.equals(invalidCVV)) {
			return true;
		} else {
			return false;
		}


	}
	//User add the special request

	public void addSpecialRequest(String data) {
		btnClick(getClickEarly());
		insertText(getTxtOtherRequest(), data);
		btnClick(getBtnNext2());


	}


	// User enter card details
	public void enterCardDetails(String cardType,DataTable table) throws InterruptedException {

		btnClick(getSelectPaymentModeUsingCard());
		List<Map<String, String>> m=table.asMaps();	
		switch (cardType) {
		case "Debit Card":
			Map<String, String> d=m.get(0);
			sByVisibleText(getSelectCardType(),d.get("selectCard") );
			sByVisibleText(getSelectCard(),d.get("selectCardType") );
			insertText(getTxtCardNo(),d.get("cardNumber") );
			insertText(getTxtCardName(),d.get("nameONCard") );
			sByVisibleText(getSelectMonth(),d.get("selectMonth") );
			sByVisibleText(getSelectYear(),d.get("selectYear") );
			insertText(getTxtCardCVV(),d.get("CVV") );
			break;
		case "Credit Card":	
			Map<String, String> c=m.get(4);
			sByVisibleText(getSelectCardType(),c.get("selectCard") );
			sByVisibleText(getSelectCard(),c.get("selectCardType") );
			insertText(getTxtCardNo(),c.get("cardNumber") );
			insertText(getTxtCardName(),c.get("nameONCard") );
			sByVisibleText(getSelectMonth(),c.get("selectMonth") );
			sByVisibleText(getSelectYear(),c.get("selectYear") );
			insertText(getTxtCardCVV(),c.get("CVV") );

			break;

		default:
			break;
		}
		btnClick(getBtnSubmit());
	}


	// User should verify booking confirmation message "Booking is Confirmed",
	// save the booking ID and verify whether selected hotel is booked or not

	public static String bookingId = "";

	public void saveBookingId() {
		String bookId = getWebText(getBookingID());
		String id = bookId.replace("#", "");
		bookingId = id;
	}

	public boolean verifyBooking(String bookingConfirmation) {
		boolean isEqual = false;
		String bookingMsg = getWebText(getBookingConfirmationMsg());
		String bookedHtlName = getWebText(getBookedHotelName());
		if (bookingMsg.contains(bookingConfirmation) && SelectHotelPage.hotelName.contains(bookedHtlName)) {
			isEqual = true;
		}
		return isEqual;
	}



}
