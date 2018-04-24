package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Leaftaps {

	@Test
	public void login() throws InterruptedException, MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver = new RemoteWebDriver(
				new URL("http://192.168.43.88:4444/wd/hub"), dc);
		
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps");
		
		// Set wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		//Maximize
		driver.manage().window().maximize();
						
		//Enter the UserName
		WebElement user = driver.findElementById("username");
		user.clear();
		user.sendKeys("DemoSalesManager");

		//Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Click on Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		
		// Find the title
		String title = driver.getTitle();
		if(title.equals("Opentaps Open Source ERP + CRM")) {
			System.out.println("Title correct");
		}else {
			System.out.println("Title not correct");
		}
		
		////Click on LogOut Button
		driver.findElementByClassName("decorativeSubmit").click();
		
		
	
		
	}
}