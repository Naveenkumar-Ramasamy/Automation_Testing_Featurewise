package com.omrbranch.pages;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.base.BaseClass;

public class LoginPage extends BaseClass {
	public   LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement txtUser;
	@FindBy(id="pass")
	private WebElement txtPass;
	@FindBy(xpath="//button[@value='login']")
	private WebElement btnLogin;
	@FindBy(xpath = "//b[text()='Invalid Login details or Your Password might have expired. ']")
	private WebElement invalidText; 
	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement verifyUserName;
	
	
	public WebElement getInvalidText() {
		return invalidText;
	}
	public WebElement getTxtUser() {
		return txtUser;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public WebElement getVerifyUserName() {
		return verifyUserName;
	}

	
	public void login(String userName, String password) {
		insertText(getTxtUser(), userName);
		insertText(getTxtPass(), password);
		btnClick(getBtnLogin());
		
	}
	public boolean verifyLoginSuccessMessage(String name) {
		String text = getVerifyUserName().getText();
		boolean loginSuccess = text.equalsIgnoreCase(name);
		return loginSuccess;
	}
	public void loginWithEnter(String userName, String password) throws AWTException {
		insertText(getTxtUser(), userName);
		insertText(getTxtPass(), password);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public boolean getLoginTextErrorMgs(String loginError) {
		String webText = getWebText(getInvalidText());
		boolean error = webText.contains(loginError);
		return error;
		

	}
		

}
