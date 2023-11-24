package com.omrbranch.pages;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.base.BaseClass;

public class SelectHotelPage extends BaseClass {
	public  SelectHotelPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath ="//label[text()='Name Ascending']")
	private WebElement btnNameAscending;


	@FindBy(xpath = "//div[@class='fliter_box_inner mb-4']//h5")
	private List<WebElement> hotelNames;

	@FindBy(xpath = "(//div[@class='fliter_box_inner mb-4']//h5)[1]")
	private WebElement firstHotelName;
	
	@FindBy(xpath = "(//strong[@class='total-prize'])[1]")
	private WebElement firstHotelPrice;
	
	@FindBy(xpath = "(//a[text()='Continue'])[1]")
	private WebElement btnContinueFirstHotel;

	@FindBy(xpath = "//div[@class='row explore-hotels']//h2")
	private WebElement bookHotelVerify;

	@FindBy(xpath = "//div[@class='row explore-hotels']//h5")
	private WebElement selectHotelVerify;

	@FindBy(xpath = "//div[@class='checkbox_comman']//label[text()='Deluxe']")
	private WebElement roomTypeDeluxe;

	public WebElement getBtnNameAscending() {
		return btnNameAscending;
	}

	public WebElement getRoomTypeDeluxe() {
		return roomTypeDeluxe;
	}

	

	public List<WebElement> getHotelNames() {
		return hotelNames;
	}

	public WebElement getFirstHotelName() {
		return firstHotelName;
	}
	
	
	public WebElement getFirstHotelPrice() {
		return firstHotelPrice;
	}

	public WebElement getBtnContinueFirstHotel() {
		return btnContinueFirstHotel;
	}

	public WebElement getBookHotelVerify() {
		return bookHotelVerify;
	}

	public WebElement getSelectHotelVerify() {
		return selectHotelVerify;
	}

	// Verifying Select hotel and navigate to book hotel upon accepting the alerts
	public void selectHotelWithAccept() {
		btnClick(getBtnContinueFirstHotel());
		acceptAlert(); 
	}

	// Save Hotel Name
	public static String hotelName = "";
	public String saveHotelName() {
		WebElement hName = getFirstHotelName();
		String text = hName.getText();
		String htlName = "" + text + "";
		hotelName = text;
		return htlName;
	}
	
	//Save Price
	public static String hotelPrice = "";
	public String saveHotelPrice() {
		WebElement hName = getFirstHotelPrice();
		String text = hName.getText();
		String htlName = "" + text + "";
		hotelPrice = text;
		return htlName;
	}
	
	
	// Verifying Select hotel and navigate to book hotel upon dismissing the alert
	public void selectHotelWithDismiss() {
		btnClick(getBtnContinueFirstHotel());
		dismissAlert();
	}

	// User should verify success message after Select hotel "Book Hotel"
	public boolean verifySuccessMsgAfterAccept(String verifyTxt) throws InterruptedException {
		boolean isEqual = false;
		String text = getWebText(getBookHotelVerify());
		if (text.contains(verifyTxt)&&text.contains(hotelName)) {
			isEqual=true;
			
			}
		return isEqual;
	}

	// User should remain in same page and verify a success message after dismissing
	// the alert "Select hotel"
	public boolean verifySuccessMsgAfterDismiss(String verifyTxt) throws InterruptedException {
		String text = getWebText(getSelectHotelVerify());
		boolean equals = text.equals(verifyTxt);
		return equals;
	}

	// Verifying Sort-by-name In Ascending Order
	public void sortNameAscending() {
		btnClick(getBtnNameAscending());
	}

	// User should verify hotel name in ascending order
	public boolean verifyNameAscending() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> hotelNames = getHotelNames();
		List<String> li = new ArrayList<String>();

		for (WebElement hNames : hotelNames) {
			String text = hNames.getText();
			li.add(text);
		}
		List<String> l2 = new ArrayList<String>(li);
		Collections.sort(l2);
		boolean equals = li.equals(l2);
		return equals;
	}

	// Verifying unselect room type and listing all hotels
	public void unSelectRoomType() {
		btnClick(getRoomTypeDeluxe());
	}

	// User should verify whether all hotel names are displayed
	public boolean verifyHotelNamesAfterUnselect() throws InterruptedException {
		boolean isRoomTypeCount = false;
		Thread.sleep(2000);
		List<WebElement> afterUnSelect = getHotelNames();
		int size = afterUnSelect.size();
		btnClick(getRoomTypeDeluxe());
		Thread.sleep(2000);
		List<WebElement> beforeUnSelect = getHotelNames();
		int size2 = beforeUnSelect.size();
		if (size != size2) {
			isRoomTypeCount = true;
		}
		return isRoomTypeCount;
	}

}
