import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
		// to know no of rows in table
		  List<WebElement> TableRows = driver.findElements(By.tagName("tr"));
		System.out.println(TableRows.size());
		// to know no of column in table
		List<WebElement> TableColumn = driver.findElements(By.tagName("th"));
		System.out.println(TableColumn.size());
		// to know no of data in table
		List<WebElement> TableData = driver.findElements(By.tagName("td"));
		System.out.println(TableData.size());
		//  to get a row data
		WebElement rowData = TableRows.get(2);
		System.out.println(rowData.getText());
		// to get a all row data
		List<WebElement> rowdata1 = rowData.findElements(By.tagName("td"));
		System.out.println(rowdata1);
		// print a row one by one
		for (int i = 0; i < rowdata1.size(); i++) {
			String text = rowdata1.get(i).getText();
			System.out.println(text);
			
		}
		// print all row data
		for (int i = 0; i < TableRows.size(); i++) {
			String allrows = TableRows.get(i).getText();
			System.out.println(allrows);
			
		}
			// to print all row data one by one
		for (int i = 0; i < TableRows.size(); i++) {
			List<WebElement> rowdatafinal = TableRows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < rowdatafinal.size(); j++) {
				WebElement finaldata = rowdatafinal.get(j);
				System.out.println(finaldata.getText());
				
			}
			
		}
		}
	
		
	}

