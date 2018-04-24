package week2.frames;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://erail.in/");		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MS", Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC", Keys.TAB);
		
		if(driver.findElementById("chkSelectDateOnly").isSelected())
			driver.findElementById("chkSelectDateOnly").click();
			
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		//Row count
		System.out.println(rows.size());	
		for(int i=0;i<rows.size();i++)
		{
		List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
		/*Column Count
		System.out.println(columns.size());
		*/System.out.println((i+1) +") " + columns.get(1).getText());
		}
		driver.close();
	}

}


