package week2.frames;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElementByLinkText("Contact Us").click();
		Set<String> allwindows = driver.getWindowHandles();
		for(String a:allwindows)
			System.out.println("Set :" + a);
		List<String> winlist = new ArrayList<String>();
		winlist.addAll(allwindows);
		for(String b:winlist)
			System.out.println("List :" + b);
		driver.switchTo().window(winlist.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.findElementByXPath("//div[@class='content-ele']/p[2]").getText());
		driver.switchTo().window(winlist.get(1)).close();
		
		driver.switchTo().window(winlist.get(0));
		driver.findElementById("usernameId").sendKeys("ABCD");
		
		
	}

}
