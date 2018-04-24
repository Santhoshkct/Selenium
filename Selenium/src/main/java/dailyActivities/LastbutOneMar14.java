package dailyActivities;
import org.openqa.selenium.chrome.ChromeDriver;
public class LastbutOneMar14 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		for(int i=1;i<=6;i++)
		{	
			driver.findElementByXPath("//div[@class='example']["+ i +"]//option[@value='3']").click();
			Thread.sleep(2000);
		}
		System.out.println("End");

		/*Select droplist = new Select(driver.findElementByXPath("//div[@class='example']"));
			List<WebElement> count = droplist.getOptions();
			System.out.println(count.size());*/



	}

}
