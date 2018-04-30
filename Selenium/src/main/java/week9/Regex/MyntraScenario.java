package week9.Regex;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class MyntraScenario extends SeMethods{

	@Test
	public void myntraSunGlasses() throws InterruptedException {
		/*		startApp("chrome","https://www.myntra.com/");
		type(locateElement("class", "desktop-searchBar"),"sunglasses");
		click(locateElement("xpath","//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']"));
		 */		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.findElementByClassName("desktop-searchBar").sendKeys("sunglasses",Keys.ENTER);


		//Unique brand Names
		List<WebElement> brandNamesEle = driver.findElementsByClassName("product-brand");
		Set<String> brandName = new HashSet<>();

		for (WebElement Name : brandNamesEle) {
			brandName.add(Name.getText());
		}

		System.out.println(brandName);

		//Sunglasses with 40% discount and Unisex count
		List<WebElement> discountEle = driver.findElementsByXPath("//h4[contains(text(),'Unisex')]/following::span[4][contains(text(),'40% OFF')]");
		
		System.out.println("40% Discount count : "+ discountEle.size());


		//Click Green Color and purchase the second resultant sunglass


		driver.findElementByXPath("//label[@style='background-color: rgb(94, 177, 96);']").click();

		driver.findElementByXPath("//ul[@class='results-base']/li[2]").click();

		String selectedProduct = driver.findElementByXPath("//h1[@class='pdp-title']").getText();

		driver.findElementByXPath("//button[@class='pdp-add-to-bag pdp-button']").click();

		Thread.sleep(2000);
		driver.findElementByXPath("//a[@class='pdp-goToCart pdp-add-to-bag pdp-button']").click();

		if(driver.findElementByXPath("//a[@class='c-gray']").getText().equalsIgnoreCase(selectedProduct))
			System.out.println(selectedProduct + "  Verified");

		String price = driver.findElementByXPath("//div[@class='c-dblue total-rupees']").getText();

		System.out.printf("Product name : %s \nPrice : %s " ,selectedProduct, price);

		driver.close();

	}
}