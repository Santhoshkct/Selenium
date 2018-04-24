package week1.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionofLocators {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		driver.findElementByXPath("//input[@id='lst-ib']").sendKeys("Santhosh");
		driver.findElementByName("btnK").click();
		List<WebElement> name = driver.findElementsByXPath("//a[text()[contains(.,'Santhosh')]] ");
		//List<WebElement> name = driver.findElementsByXPath("//a[contains(text(),'Abhishek')]] ");		
		System.out.println(name.size());
		
		for(WebElement print:name)
			System.out.println(print.getText());
		name.get(2).click();
		System.out.println(driver.getCurrentUrl());
	}

}
