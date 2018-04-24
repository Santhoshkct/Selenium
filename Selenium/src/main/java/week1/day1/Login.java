package week1.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );
		
		//1. Open the driver
		ChromeDriver driver = new ChromeDriver();
		
		//2. Maximize the chrome browser
		driver.manage().window().maximize();
		
		//3.Load the URL
		driver.get("http://www.leaftaps.com/opentaps/");
		
		//3.Enter the username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//4.Enter the password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//5.Click login button
		driver.findElementByClassName("decorativeSubmit").click();
		
		//6. Enter CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
		
		//7.Enter leads
		driver.findElementByLinkText("Leads").click();
		
		//8.Create Lead
		driver.findElementByLinkText("Create Lead").click();
		
		//Enter the Company details
		driver.findElementById("createLeadForm_companyName").sendKeys("March2018NeonHexa");
		
		driver.findElementById("createLeadForm_firstName").sendKeys("Santhoshi");
		
		driver.findElementById("createLeadForm_lastName").sendKeys("Kumari");
		
		//Drop down Select list
		Select dropDown = new Select(driver.findElementById("createLeadForm_dataSourceId"));
		
		dropDown.selectByVisibleText("Employee");
		
		Thread.sleep(2000);
		
		Select dropDown1 = new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		
		java.util.List<WebElement> allOptions = dropDown1.getOptions();
		
		System.out.println(allOptions.size());
		
		dropDown1.selectByIndex(allOptions.size()-2);
		
		Thread.sleep(2000);
		
		dropDown1.selectByValue("9002");
		
		Thread.sleep(2000);
		driver.findElementById("createLeadForm_marketingCampaignId").sendKeys("Demo Marketing Campaign");
		
		//driver.findElementByName("submitButton").click();
		
		for(WebElement drop:allOptions)
		{
			System.out.println(drop.getText());			
		}
		
		
		//6.Click logout button
		//driver.findElementByClassName("decorativeSubmit").click();
		
	}

}
