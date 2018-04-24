package week3.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class SortablesMar24 {

	static int x;
	static int y;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/sortable/");
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		x = item1.getLocation().getX();
		y = item1.getLocation().getY();
		System.out.print("Item1 x: " + x + " y:" + y + "\n");
		WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
		int x1 = item3.getLocation().getX();
		int y1 = item3.getLocation().getY();
		System.out.print("Item3 x: " + x1 + " y:" + y1 + "\n");
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(item1, x1, y1).perform();
		x = item1.getLocation().getX();
		y = item1.getLocation().getY();
		System.out.print("Item1 -> Item3 x: " + x + " y:" + y + "\n");
		Thread.sleep(2000);
		builder.dragAndDropBy(item1, x, y).perform();
		x = item1.getLocation().getX();
		y = item1.getLocation().getY();
		System.out.print("Item1 in Item3 -> Item1 x: " + x + " y:" + y + "\n");

		builder.dragAndDropBy(item1, -(x1-x), -(y1-y)).perform();
		x = item1.getLocation().getX();
		y = item1.getLocation().getY();
		System.out.print("Item1 in Item3 -> Item1 -(x-x1): " + x + " -(y-y1):" + y + "\n");
		
	}

}
