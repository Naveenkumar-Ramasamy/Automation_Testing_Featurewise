package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver"," C:\\Users\\HP\\eclipse-workspace\\Swiggy\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.swiggy.com/");
		driver.manage().window().maximize();
		
		
	WebElement pass = driver.findElement(By.name("location"));
	pass.sendKeys("tiruchengode");
	
		


		
		
	}

}
