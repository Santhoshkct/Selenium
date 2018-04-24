package dailyActivities;

import org.openqa.selenium.chrome.ChromeDriver;

public class uncheckMar15 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		//System.out.println(driver.findElementByXPath("//div[@id=\"contentblock\"]/section/div[1]/input[1]").isSelected());
		//System.out.println(driver.findElementByXPath("//section[@class='innerblock']/div[2]/input[1]").isSelected());
		System.out.println(driver.findElementByXPath("//div[@id='contentblock']/section/div[3]/input[2]").isSelected());
		driver.findElementByXPath("//div[@id='contentblock']/section/div[3]/input[2]").click();
		System.out.println(driver.findElementByXPath("//div[@id='contentblock']/section/div[3]/input[2]").isSelected());


	}

}
