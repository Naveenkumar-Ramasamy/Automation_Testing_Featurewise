package com.omr.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.omrhotel.base.BaseClass;

public class MyBookingPage extends BaseClass  {
	
	public void myBookingPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='icoTwitter mr-2 dropdown-toggle']")
	private WebElement navigateBooking;
	@FindBy(xpath="//a[text()='My Account']") 
	private WebElement myAccount; 
	@FindBy(xpath="//div[@id='bookinglist']//a")
	private WebElement hotelName;
	@FindBy(xpath="//div[@class='room-code']//span")
	private WebElement orderId;		
	@FindBy(xpath="//div[@id='bookinglist']//strong")
	private WebElement price;
	@FindBys({@FindBy(name="check_in"),@FindBy(xpath="//a[text()='28']"),@FindBy(xpath="//button[text()='Confirm']")})
	private WebElement checkIn;
	@FindBy(xpath="//li[text()='Booking updated successfully']")
	private WebElement updateSuccess;
	@FindBy(xpath="//a[text()='Cancel']")
	private WebElement cancel;
	@FindBy(xpath="//li[text()='Your booking cancelled successfully']")
	private WebElement cancelSuccess;
	public WebElement getNavigateBooking() {
		return navigateBooking;
	}
	public WebElement getMyAccount() {
		return myAccount;
	}
	public WebElement getHotelName() {
		return hotelName;
	}
	public WebElement getOrderId() {
		return orderId;
	}
	public WebElement getPrice() {
		return price;
	}
	public WebElement getCheckIn() {
		return checkIn;
	}
	public WebElement getUpdateSuccess() {
		return updateSuccess;
	}
	public WebElement getCancel() {
		return cancel;
	}
	public WebElement getCancelSuccess() {
		return cancelSuccess;
	}
	public static String textOrder;
	public void navigateMyBookingPage() {
		btnClick(getNavigateBooking());
		btnClick(getMyAccount());
		getWebText(getHotelName());
		String textOrder = getWebText(getOrderId());
		getWebText(getPrice());
	}
	public void changeCheckInDate(String textOrder) {
		btnClick(getCheckIn());
	}
	public void getChangeBookingUpadteSuccessTextMgs() {
		getWebText(getUpdateSuccess());
	}
	public void changeFirstOrderIdCheckInDate() {
		btnClick(getCheckIn());
	}
	public void cancelOrderId(String textOrder) {
		btnClick(getCancel());
	}
	public void getCancelOrderIdSuccessTextMgs() {
		getWebText(getCancelSuccess());
	}
	public void cancelFirstOrderId() {
		btnClick(getCancel());
	}
}
