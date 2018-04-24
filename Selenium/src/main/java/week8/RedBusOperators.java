package week8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusOperators {



	@Test
	public void redbus()  {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in");
		driver.findElementById("src").sendKeys("Coi",Keys.ENTER);
		driver.findElementById("dest").sendKeys("Ban",Keys.ENTER);		
			
			
		WebElement table = driver.findElementByXPath("//table[@class='rb-monthTable first last']");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		List<WebElement> columns = rows.get(5).findElements(By.tagName("td"));
		System.out.println(columns.get(6).getText());
		columns.get(6).click();
		
		
		
		driver.findElementById("search_btn").click();
		


		List<WebElement> operatorEle = driver.findElementsByXPath("//div[@class='service-name']");

		List<String> operator = new ArrayList<String>();
		
		for (WebElement ele : operatorEle) {
			operator.add(ele.getText());
		}
		
		for (String string : operator) {
			System.out.println(string);
		}
		
		
		//driver.close();
	}
}
