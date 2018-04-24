package week1.day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctcautomate {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );

		//1. Open the driver
		ChromeDriver driver = new ChromeDriver();
		//2. Maximize the chrome browser
		driver.manage().window().maximize();
		//3.Load the URL
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementById("userRegistrationForm:userName").sendKeys("Test");
		driver.findElementById("userRegistrationForm:password").sendKeys("Test1234");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Test1234");

		Select drop = new Select(driver.findElementById("userRegistrationForm:securityQ"));
		drop.selectByValue("1");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("LMMS");
		driver.findElementById("userRegistrationForm:prelan").sendKeys("English");

		driver.findElementById("userRegistrationForm:firstName").sendKeys("Test");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();

		driver.findElementById("userRegistrationForm:dobDay").sendKeys("26");
		driver.findElementById("userRegistrationForm:dobMonth").sendKeys("JUL");

		Select drop2 = new Select(driver.findElementById("userRegistrationForm:dateOfBirth"));
		drop2.selectByVisibleText("1996");

		Select drop3 = new Select(driver.findElementById("userRegistrationForm:occupation"));
		List<WebElement> optsOcc = drop3.getOptions();
		drop3.selectByIndex(optsOcc.size()-4);

		driver.findElementById("userRegistrationForm:countries").sendKeys("India");
		driver.findElementById("userRegistrationForm:email").sendKeys("Test@abc.com");
		//driver.findElementById("userRegistrationForm:isdCode").sendKeys("91");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9393939393");
		driver.findElementById("userRegistrationForm:nationalityId").sendKeys("India");

		driver.findElementById("userRegistrationForm:address").sendKeys("1/70");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600096",Keys.TAB);
		Thread.sleep(2000);
		
		System.out.println("Hello" + driver.findElementById("userRegistrationForm:statesName").getText());
		
		Select drop4 = new Select(driver.findElementById("userRegistrationForm:cityName"));
		drop4.selectByVisibleText("Kanchipuram");

		Thread.sleep(2000);
		Select drop5 = new Select(driver.findElementById("userRegistrationForm:postofficeName"));
		List<WebElement> optPost = drop5.getOptions();
		for(WebElement disPost:optPost)
			System.out.println(disPost.getText());
		
		drop5.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElementById("userRegistrationForm:landline").sendKeys("1234567");
	}

}
