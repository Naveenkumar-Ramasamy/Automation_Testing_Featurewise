package com.omrbranch.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.base.BaseClass;


public class MyBookingPage extends BaseClass {
	public  MyBookingPage() {
		PageFactory.initElements(driver, this);
		}
		
		
		
		@FindBy(xpath="//a[text()='Cancel']")
		private WebElement cancel;
		
		@FindBy(xpath="//li[text()='Your booking cancelled successfully']")
		private WebElement cancelSuccess;
		
		

		public WebElement getCancel() {
			return cancel;
		}

		public WebElement getCancelSuccess() {
			return cancelSuccess;
		}
		
		public void clickCancelBtn() {
			btnClick(getCancel());
			acceptAlert();
		}
		public boolean verifyCancelSucessMgs(String cancelledMsg ) {
			String text = getWebText(getCancelSuccess());
			boolean equals = text.equals(cancelledMsg);
			System.out.println(text);
			System.out.println(equals);
			return equals;

		}
		

		}
		
		


