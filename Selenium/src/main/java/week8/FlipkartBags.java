package week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartBags {
	
	@Test
	public void price() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/search?q=bags&otracker=start&as-show=on&as=off");
		
		
		List<WebElement> priceElement = driver.findElementsByXPath("//div[@class='_1vC4OE']");
		
		List<Integer> price = new ArrayList<Integer>();
		
		for (WebElement a : priceElement) {
			String[] split = a.getText().substring(1).split(",");
			String result = "";	
			for (String string : split) {
				result = result.concat(string);
			}
			price.add(Integer.parseInt(result));
		}
		
		Collections.sort(price);
				
		System.out.println("Lowest Price is :" + price.get(0));
	}
	
	

}
