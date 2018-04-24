package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{

	RemoteWebDriver driver = null;
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				//	driver = new FirefoxDriver();
			}
			//Maximize the browser
			driver.manage().window().maximize();
			//Load the URL
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("The "+browser+" browser launched successfully");
		} catch (IllegalStateException e) {
			System.err.println("Startapp - Illegal State Exception");
		}catch (NoSuchWindowException e){
			System.err.println("Startapp - Nosuch Window Exception");
		}catch (WebDriverException e)	{
			System.err.println("Startapp - WebDriver Exception");
		}catch (RuntimeException e) {
			e.printStackTrace();
		}
		finally	{
			takeSnap();
		}
	}

	public WebElement locateElement(String locator, String locValue) {
		WebElement ele = null;
		try {
			switch (locator) {
			case "id":
				ele = driver.findElementById(locValue);
				break;
			case "class":
				ele = driver.findElementByClassName(locValue);
				break;
			case "linktext":
				ele = driver.findElementByLinkText(locValue);
				break;
			case "name":
				ele = driver.findElementByName(locValue);
				break;
			case "xpath":
				ele = driver.findElementByXPath(locValue);
				break;
			}
		}catch (NoSuchWindowException e) {
			System.err.println("locate Element Function - NosuchWindow Exception");
		}catch (NoSuchElementException e) {
			System.err.println("locate Element Function - No Such Element Exception");
		}catch (RuntimeException e) {
			e.printStackTrace();
		}
		return ele;

	}

	public WebElement locateElement(String locValue) {

		WebElement ele = null;
		ele = driver.findElementById(locValue);
		return ele;
	}

	public void type(WebElement ele, String data) {
		ele.sendKeys(data);
		System.out.println("The given value is entered "+ data);
		takeSnap();
	}

	public void click(WebElement ele) {
		try {
			ele.click();
			System.out.println("The element is clicked successfully");
		} finally {
			takeSnap();
		}
	}

	public void clickWithouttakeSnap(WebElement ele) {
		ele.click();
		System.out.println("The element is clicked successfully");

	}
	public String getText(WebElement ele) {
		return ele.getText();

	}


	public void selectDropDownUsingValue(WebElement ele, String value) {
		Select drop = new Select(ele);
		drop.selectByValue(value);
		System.out.println("The DropDown is Selected by Value Successfully");
		takeSnap();

	}

	public void selectDropDownUsingText(WebElement ele, String visibleText) {
		Select drop = new Select(ele);
		drop.selectByVisibleText(visibleText);
		System.out.println("The DropDown is Selected by VisibleText Successfully");
		takeSnap();
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		Select drop = new Select(ele);
		drop.selectByIndex(index);
		System.out.println("The DropDown is Selected by index Successfully");
		takeSnap();
	}

	public boolean verifyTitle(String expectedTitle) {
		if(driver.getTitle().equals(expectedTitle))
			return true;
		else
			return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		if(ele.getText().equals(expectedText))
			System.out.println("Exact Match found : " + expectedText);
		takeSnap();
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		if(ele.getText().contains(expectedText))
			System.out.println("Partial Match found : " + expectedText);
		takeSnap();
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		if(ele.getAttribute(value).equals(attribute))
			System.out.println("Exact Attribute match found : " + attribute);
		takeSnap();
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		if(ele.getAttribute(value).contains(attribute))
			System.out.println("Partial Attribute match found : " + attribute);
		takeSnap();
	}

	public void verifySelected(WebElement ele) {
		System.out.println("isSelected? " + ele.isSelected());
		takeSnap();
	}

	public void verifyDisplayed(WebElement ele) {
		System.out.println("isDisplayed? " + ele.isDisplayed());
		takeSnap();
	}

	public void switchToWindow(int index) {
		try {
			Set<String> allwindows = driver.getWindowHandles();
			List<String> winList = new ArrayList<String>();
			winList.addAll(allwindows);
			driver.switchTo().window(winList.get(index));
		} catch (NullPointerException e) {
			System.err.println("SwitchToWindow Method - Null Pointer Exception");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("SwitchToWindow Method - Array Index Out of Bound Exception");
		}catch (NoSuchWindowException e) {
			System.err.println("SwitchToWindow Method - No Such Window Exception");		
		}catch (RuntimeException e) {
			e.printStackTrace();
		}finally {
			takeSnap();
		}
	}	

	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);		
		takeSnap();
	}

	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
		}catch (NoAlertPresentException e) {
			System.err.println("Accept Alert Method - NoAlert Present Exception");
		}catch (UnhandledAlertException e) {
			System.err.println("Accept Alert Method - Unhandled Alert Exception");
		}catch (RuntimeException e) {
			e.printStackTrace();
		}
		//takeSnap();
	}

	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
		} catch (NoAlertPresentException e) {
			System.err.println("Dismiss Alert Method - NoAlert Present Exception");
		}catch (UnhandledAlertException e) {
			System.err.println("Dismiss Alert Method - Unhandled Alert Exception");
		}catch (RuntimeException e) {
			e.printStackTrace();
		}
		//takeSnap();
	}

	public String getAlertText() {
	try {
			driver.switchTo().alert().getText();
		} catch (NoAlertPresentException e) {
			System.err.println("getAlertText Method - NoAlert Present Exception");
		} catch (UnhandledAlertException e) {
			System.err.println("getAlertText Method - Unhandled Alert Exception");
		}catch (RuntimeException e) {
			e.printStackTrace();
		}
		return driver.switchTo().alert().getText();

	}

	int i =1;
	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		driver.close();
	}

	public void closeAllBrowsers() {
		driver.quit();			
	}


}
