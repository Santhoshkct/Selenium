package dailyActivities;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcMar13 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );

		//1. Open the driver
		ChromeDriver driver = new ChromeDriver();
		//2. Maximize the chrome browser
		driver.manage().window().maximize();
		//3.Load the URL
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		//Select drop = new Select(driver.findElementById("driver.findElementById(\"userRegistrationForm:countries\")"));
		
		//List<WebElement> country = driver.findElementsByXPath("//select[@id='userRegistrationForm:countries']/option[text()[contains(.,'E')]]");
		
		List<WebElement> country = driver.findElementsByXPath("//select[@id='userRegistrationForm:countries']/option[starts-with(.,'E')]");
		country.get(1).click();
		
		System.out.println(country.size());
		for(WebElement a:country)
			System.out.println(a.getText());
		
		country.get(1).click();
		
		driver.close();
		
	}

}
