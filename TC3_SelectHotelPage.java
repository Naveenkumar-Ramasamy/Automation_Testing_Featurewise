package com.omr.Pages;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrhotel.base.BaseClass;

public class TC3_SelectHotelPage extends BaseClass {
	
	
	private void selectHotel() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//h5[text()='Select Hotel' ]")
	private WebElement selectHotelSuccessMgs;	
	@FindBy(xpath="//h5[text()='Evoma Deluxe']")
	private WebElement hotelName;
	@FindBy(xpath="//strong[@class='total-prize']")
	private WebElement hotelPrice;
	@FindBy(id="value_nasc")
	private WebElement clickSortName;
	
	@FindBy(xpath="//a[text()='Continue']")
	private WebElement btnContinue;
	
	public  WebElement getSelectHotelSuccessMgs() {
	return selectHotelSuccessMgs;
	}
	public WebElement getHotelName() {
		return hotelName;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}
	public WebElement gethotelPrice() {
		return hotelPrice;
	}
	
	public WebElement getClickSortName() {
		return clickSortName;
	}
	public String selectHotelName() {
		String txtHotelName = getWebText(hotelName);
		return txtHotelName;
	}
	public String selectHotelPrice() {
		String txtHotelPrice = getWebText(hotelPrice);
		return txtHotelPrice;
	}
	public void acceptAlertMgs() {
		acceptAlert();
	}
	public void dismissAlertMgs() {
		dismissAlert();
	}
	public void clickSortHotelNameByAscending() {
		btnClick(clickSortName);
	}
	public void SortHotelNameByAscending() {

	}
	
	public void verifyUnselectRoomTypeHotelCount() {
		
	}
	
	
	
















}



