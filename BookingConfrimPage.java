package com.omr.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrhotel.base.BaseClass;

public class BookingConfrimPage extends BaseClass {
public void BookingConfrimPage() {
	PageFactory.initElements(driver, this);
}


@FindBy(name="booking-code")
private WebElement bookingSuccessMgs;

@FindBy(xpath="//div[@class='room-code']")
private WebElement orderIdText;



public WebElement getBookingSuccessMgs() {
	return bookingSuccessMgs;
}

public WebElement getOrderIdText() {
	return orderIdText;
}

public static WebElement orderId;

public String getBookingSuccessTextMgs() {
	String txtBookingsuccess = getWebText(getBookingSuccessMgs());
	return txtBookingsuccess;	
}

public void getOrderIdMgs() {
	orderId=getOrderIdText();	

}
}
