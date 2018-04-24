package week3.day1;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartMar24Mouseover {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement tv = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		WebElement samsung = driver.findElementByXPath("(//span[text()='Samsung'])[2]");
		//WebElement samsung = driver.findElementByXPath("//span[text()='LG']");
		
		Actions builder = new Actions(driver);
		builder.moveToElement(tv).perform();
	//	Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(samsung));
		builder.click(samsung).perform();

	}

}
