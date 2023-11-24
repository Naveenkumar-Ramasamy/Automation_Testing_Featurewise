package com.omrbranch.base;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	// BrowserLauch Method
		public static WebDriver driver;
		Actions a;
		Select s;

		public void getBrowserDriver(String browserType) {
			switch (browserType) {
			case "chrome":
				driver = new ChromeDriver();
				break;
			case "firefox":
				driver = new FirefoxDriver();
				break;
			case "edge":
				driver = new EdgeDriver();
				break;
			case "ie":
				driver = new InternetExplorerDriver();
				break;
			default:
				break;
			}
		}

		public static String getProjectPath() {
			String path = System.getProperty("user.dir");
			return path;
		}

		public static String getPropertyFileValue(String string) throws FileNotFoundException, IOException {
			Properties p = new Properties();
			p.load(new FileInputStream(getProjectPath()+"\\config\\config.properties"));
			Object o = p.get("url");
			String v = (String) o;
			System.out.println(v);
			return v;
		}

		public WebDriver lauchbrowser() {
			WebDriverManager.chromedriver().setup();
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(ops);
			return driver;
		}
		//implicitywait
		public void implicityWait() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}

		// Manage Method
		public void maximizeWindow() {
			driver.manage().window().maximize();
		}

		// GetUrl Method
		public void launchUrl(String url) {
			driver.get(url);
		}

		// Get CurrentUrl
		public String getPageUrl() {
			String url = driver.getCurrentUrl();
			return url;

		}

		// Get Title
		public String getPageTitle() {
			String title = driver.getTitle();
			return title;
		}

		// FindElementById
		public WebElement findElementsById(String id) {
			WebElement element = driver.findElement(By.id(id));
			return element;
		}

		// FindElementByName
		public WebElement findElementByName(String name) {
			WebElement element = driver.findElement(By.name(name));
			return element;
		}

		// FindElementByClassName
		public WebElement findElementByClassName(String classname) {
			WebElement element = driver.findElement(By.className(classname));
			return element;
		}

		// FindElementByTagName
		public WebElement findElementByTagName(String classname) {
			WebElement element = driver.findElement(By.className(classname));
			return element;
		}

		// FindElementByXpath
		public WebElement findElementsByXpath(String text) {
			WebElement xp = driver.findElement(By.xpath(text));
			return xp;
		}

		// FindElementByLinktext
		public WebElement findElementByLinkText(String text) {
			WebElement element = driver.findElement(By.linkText(text));
			return element;
		}

		// FindElementByPartiallyLinkText
		public WebElement findElementByPartiallyLinkText(String text) {
			WebElement element = driver.findElement(By.partialLinkText(text));
			return element;
		}

		// FindElementByCssSelector
		public WebElement findElementByCssSelector(String text) {
			WebElement element = driver.findElement(By.cssSelector(text));
			return element;
		}
		
		// SendKeys Method
		public  void insertText(WebElement element, String data) {
			element.sendKeys(data);
		}

		// Click Method
		public void btnClick(WebElement element) {
			element.click();
		}

		// Quit Method
		public void quitBrowser() {
			driver.quit();
		}

		// Close
		public void closeBrowser() {
			driver.close();
		}

		// GetText
		public String getWebText(WebElement element) {
			String text = element.getText();
			return text;
		}

		// GetAttribute
		public String getAttributeValue(WebElement element) {
			String attribute = element.getAttribute("value");
			return attribute;
		}

		// Actions Mouseover
		public void mouseOverActions(WebElement element) {
			a = new Actions(driver);
			a.moveToElement(element).click().perform();
		}

		// Actions DargAndDrop
		public void dragAndDropActions(WebElement e1, WebElement e2) {
			a = new Actions(driver);
			a.dragAndDrop(e1, e2);
		}

		// ContextClick
		public void contextClickActions() {
			a = new Actions(driver);
			a.contextClick();
		}

		// ContextClickWebElement
		public void contextClickWebElementActions(WebElement element) {
			a = new Actions(driver);
			a.contextClick(element);
		}

		// DoubleClick
		public void doubleClickActions() {
			a = new Actions(driver);
			a.doubleClick();
		}

		// DoubleClickWebElement
		public void doubleClickWebElementActions(WebElement element) {
			a = new Actions(driver);
			a.doubleClick(element);
		}

		// KeyPressEnter()
		public void keyPressActionsEnter() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		public void keyPressActionsTab() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		}
		
		
		
		// SwitchToElement
		public TargetLocator switchToElement() {
			TargetLocator switchTo = driver.switchTo();
			return switchTo;
		}

		// SwitchToAlert
		public void acceptAlert() {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}

		public void dismissAlert() {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}
		// getScreenShot()
		public File getScreenShot() {
			TakesScreenshot tk = (TakesScreenshot) driver;

			File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
			return screenshotAs;
		}

		// framesIdorName
		public void switchToFrameId(String data) {
			switchToElement().frame(data);
		}

		// frameswebElement
		public void switchToFrameWebElement(WebElement element) {
			switchToElement().frame(element);
		}

		// frameIndex
		public void switchToFrameIndex(int data) {
			switchToElement().frame(data);
		}

		// selectbyvalue
		public void sByValue(WebElement element, String data) {
			s = new Select(element);
			s.selectByValue(data);
		}

		// selectbyvisbletext
		public WebElement sByVisibleText(WebElement element, String visibleTxt) {
			Select s = new Select(element);
			String s1 = "" + visibleTxt + "";
			if (visibleTxt.contains("/")) {
				String[] split = s1.split("\\/");
				for (String sp : split) {
					s.selectByVisibleText(sp);
				}
			} else {
				s.selectByVisibleText(visibleTxt);
			}
			return element;
		}

		// selectByIndex
		public void sByIndex(WebElement element, int data) {
			s = new Select(element);
			s.selectByIndex(data);
		}

		// getoptions()
		public String getOptionsDropDown(WebElement element) {
			s = new Select(element);

			String text = null;
			List<WebElement> options = s.getOptions();
			for (int i = 0; i < options.size(); i++) {
				WebElement webElement = options.get(i);
				text = webElement.getText();
			}
			return text;

		}

		// IsMultiple
		public void iMultiple(WebElement element) {
			s = new Select(element);
			s.isMultiple();
		}

		// deSelectByIndex
		public void dSelectByIndex(WebElement element, int data) {
			s = new Select(element);
			s.deselectByIndex(data);
		}

		// deSelectByVisibleText
		public void dSelectByVisibleText(WebElement element, String data) {
			s = new Select(element);
			s.deselectByValue(data);
		}

		/// deSelectbyvalue
		public void dSelectByValue(WebElement element, String data) {
			s = new Select(element);
			s.deselectByValue(data);
		}

		// deselectall
		public void dSelectAll(WebElement element) {
			s = new Select(element);
			s.deselectAll();

		}

		// javaScriptExecutorSetValue
		public void javaScriptSetValue(String data, WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('value','" + data + "')", element);
		}

		// javaScriptExecutorGetValue
		public String javaScriptGetValue(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Object script = js.executeScript("return arguments[0].getAttribute('value')", element);
			String name = (String) script;
			return name;
		}

		// javaScriptScrollDown
		public void pageScrollDown(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].ScrollIntoView(true)", element);
		}

		// javaScriptScrollUp
		public void pageScrollUp(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].ScrollIntoView(false)", element);

		}
		
		public void javaScriptBtnClick(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", element);
			

		}

		// windowStringUrl
		public void switchToWindowUrl(String data) {
			switchToElement().window(data);
		}

		// getWindowHandle
		public String getWindowHandlepage() {
			String handle = driver.getWindowHandle();
			return handle;
		}

		// navigateTo
		public void navigateTo(String data) {
			driver.navigate().to(data);
		}

		// navigateBack
		public void navigateback() {
			driver.navigate().back();
		}

		// navigateForward
		public void navigateForward() {
			driver.navigate().forward();
		}

		// navigateRefresh
		public void navigateRefresh() {
			driver.navigate().refresh();
		}

		public String getDataFromExcel(String loc, String sName, int rNo, int cNo) throws IOException {

			String value = null;
			File excelloc = new File(loc);
			FileInputStream fin = new FileInputStream(excelloc);
			Workbook w = new XSSFWorkbook(fin);
			Sheet s = w.getSheet(sName);
			Row r = s.getRow(rNo);
			Cell c = r.getCell(cNo);
			int type = c.getCellType();
			if (type == 1) {
				value = c.getStringCellValue();
			} else if (type == 0) {
				if (DateUtil.isCellDateFormatted(c)) {
					Date date = c.getDateCellValue();
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
					value = sdf.format(date);
				} else {
					double d = c.getNumericCellValue();
					long l = (long) d;
					value = String.valueOf(l);
				}
			}
			return value;
		}
		public void switchToDefaultFrame() {
			driver.switchTo().defaultContent();
		}

		public void switchToParentFrame() {
			driver.switchTo().parentFrame();
		}

		public Object sendkeysViaJSExecutor(WebElement element, String value) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Object executeScript = js.executeScript("arguments[0].setAttribute('value','" + value + "')", element);
			return executeScript;
		}
		
		public String getDataFromDataTable(DataTable data, int index, String key) {
			List<Map<String, String>> column = data.asMaps();
			Map<String, String> row = column.get(index);
			String string = row.get(key);
			return string;
		}

		public WebDriverWait waitExplicitly(int seconds) {
			WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
			return eWait;
		}

		public Wait<WebDriver> waitFluent(int timeoutInSeconds, int pollingInSeconds, String exceptionTobeIgnored) {
			Wait<WebDriver> fWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeoutInSeconds))
					.pollingEvery(Duration.ofSeconds(pollingInSeconds))
					.ignoring(StaleElementReferenceException.class, NoSuchElementException.class);
			return fWait;
		}
		
		public WebDriverWait waitExplicitlyForVisibility(int seconds, List<WebElement> list) {
			WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
			eWait.until(ExpectedConditions.visibilityOfAllElements(list));
			return eWait;
		}

		public WebDriverWait waitExplicitlyForVisibility(int seconds, WebElement element) {
			WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
			eWait.until(ExpectedConditions.visibilityOf(element));
			return eWait;
		}

		public WebElement waitExplicitlyForElementTobeClickable(WebElement element, int seconds) {
			WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
			WebElement webElement = eWait.until(ExpectedConditions.elementToBeClickable(element));
			return webElement;
		}

		public Boolean waitExplicitlyForElementSelectionStateToBe(WebElement element, int seconds) {
			WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
			Boolean webElement = eWait.until(ExpectedConditions.elementSelectionStateToBe(element, true));
			return webElement;
		}


}
