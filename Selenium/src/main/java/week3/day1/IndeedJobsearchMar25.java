package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IndeedJobsearchMar25 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.indeed.co.in/Fresher-jobs");
		List<WebElement> url = driver.findElementsByXPath("//div[contains(@class,'row result clickcard')]");
		System.out.println(url.size());
		int i = 1;
		Actions builder = new Actions(driver);
		for(WebElement clk:url)
		{
			WebElement sel = clk.findElement(By.tagName("a"));
			builder.contextClick(sel).build().perform();
			Thread.sleep(2000);
			builder.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
			builder.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
			builder.sendKeys(Keys.ENTER).perform();
			//builder.sendKeys(sel, Keys.CONTROL).click().perform();
			Thread.sleep(2000);
			Set<String> allwindows = driver.getWindowHandles();
			List<String> winlist = new ArrayList<String>();
			winlist.addAll(allwindows);
			System.out.println(winlist.size());
			driver.switchTo().window(winlist.get(winlist.size()-1));
			System.out.println("Tab :" + i++ + " " + driver.getTitle());
			driver.switchTo().window(winlist.get(0));	
		}	
		driver.close();
	}

}
