package org.cts;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("oppo",Keys.ENTER);
		WebElement oppo = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		oppo.click();
		Thread.sleep(6000);
	String parent = driver.getWindowHandle();
		System.out.println(parent);
	Thread.sleep(3000);
	Set<String> allWindow = driver.getWindowHandles();
	System.out.println(allWindow);
List<String>li=new ArrayList<String>();
li.addAll(allWindow);
String Childwindow=li.get(1);
driver.switchTo().window(Childwindow);



	}

}
