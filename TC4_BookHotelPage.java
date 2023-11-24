package com.omr.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrhotel.base.BaseClass;

public class TC4_BookHotelPage extends BaseClass {
	public void bookHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//div[@class='row'])[1]")
private WebElement selectHotelSuccessMgs;
	@FindBy(id="user_title")
	private WebElement selectSalution;
	@FindBy(name="first_name")
	private WebElement firstName;
	@FindBy(name="last_name")
	private WebElement lastName;
	@FindBy(id="user_phone")
	private WebElement userPhone;
	@FindBy(id="user_email")
	private WebElement userEmail;
	@FindBy(id="gst")
	private WebElement clickGst;
	@FindBy(id="gst_registration")
	private WebElement gstRegistration;
	@FindBy(id="company_name")
	private WebElement companyName;
	@FindBy(id="company_address")
	private WebElement companyAddress;
	@FindBy(id="step1next")
	private WebElement clickStep1next;
	@FindBy(id="early")
	private WebElement clickEarly;
	@FindBy(id="other_request")
	private WebElement otherRequest;
	@FindBy(id="step2next")
	private WebElement clickstep2next;
	@FindBy(xpath="//div[@class='credit-card pm']")
	private WebElement clickCredit;
	@FindBy(id="payment_type")
	private WebElement paymentType;
	@FindBy(id="card_type")
	private WebElement cardType;
	@FindBy(id="card_no")
	private WebElement cardNo;
	@FindBy(id="card_name")
	private WebElement cardName;
	@FindBy(id="card_month")
	private WebElement cardMonth;
	@FindBy(id="card_year")
	private WebElement cardYear;
	@FindBy(id="cvv")
	private WebElement cvv;
	@FindBy(id="submitBtn")
	private WebElement clickSubmitBtn;
	
	public WebElement getSelectSalution() {
		return selectSalution;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getUserPhone() {
		return userPhone;
	}
	public WebElement getUserEmail() {
		return userEmail;
	}
	public WebElement getClickGst() {
		return clickGst;
	}
	public WebElement getGstRegistration() {
		return gstRegistration;
	}
	public WebElement getCompanyName() {
		return companyName;
	}
	public WebElement getCompanyAddress() {
		return companyAddress;
	}
	public WebElement getClickStep1next() {
		return clickStep1next;
	}
	public WebElement getClickEarly() {
		return clickEarly;
	}
	public WebElement getotherRequest() {
		return otherRequest;
	}
	public WebElement getClickstep2next() {
		return clickstep2next;
	}
	public WebElement getClickCredit() {
		return clickCredit;
	}
	public WebElement getPaymentType() {
		return paymentType;
	}
	public WebElement getCardType() {
		return cardType;
	}
	public WebElement getCardNo() {
		return cardNo;
	}
	public WebElement getCardName() {
		return cardName;
	}
	public WebElement getCardMonth() {
		return cardMonth;
	}
	public WebElement getCardYear() {
		return cardYear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getClickSubmitBtn() {
		return clickSubmitBtn;
	}
	public WebElement getSelectHotelSuccessMgs() {
		return selectHotelSuccessMgs;
	}
	public String getSelectHotelSuccessTextMgs() {
		String txtSelect = getWebText(getSelectHotelSuccessMgs());
		return txtSelect;
		
	}
	public void addGuestDetails(String s,String firtName,String lastName,String phoneNo,String email) {
		sByVisibleText(selectSalution, s);
		insertText(getFirstName(),firtName );
		insertText(getLastName(), lastName);
		insertText(getUserPhone(), phoneNo);
		insertText(getUserEmail(), email);
	}
	public void addGstDetails(String reg,String companyName,String companyAddress) {
		btnClick(getClickGst());
		insertText(getGstRegistration(), reg);
		insertText(getCompanyName(), companyName);
		insertText(getCompanyAddress(), companyAddress);
		btnClick(getClickStep1next());
	}
	public void addSpecialRequest(String string) {
		insertText(getotherRequest(), string);
		btnClick(getClickstep2next());
	}
	public void addPaymentDetails(String paymentType,String cardType, String cardNo,String cardName,String cardMonth,String cardYear,String cvv) {
		btnClick(getClickCredit());
		sByVisibleText(getPaymentType(), paymentType);
		sByVisibleText(getCardType(), cardType);
		insertText(getCardNo(), cardNo);
		insertText(getCardName(), cardName);
		sByVisibleText(getCardMonth(), cardMonth);
		sByVisibleText(getCardYear(), cardYear);
		insertText(getCvv(), cvv);
		btnClick(getClickSubmitBtn());
	}
	
	
	
	
	
	
}
