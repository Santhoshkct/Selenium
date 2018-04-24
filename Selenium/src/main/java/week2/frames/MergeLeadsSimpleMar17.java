package week2.frames;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MergeLeadsSimpleMar17 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		//mergeLeads(1,1);
		driver.findElementByXPath("//input[@id='partyIdFrom']/following::a[1]").click();
		Set<String> mergeWindows = driver.getWindowHandles();
		List<String> winList = new ArrayList<String>();
		winList.addAll(mergeWindows);
		driver.switchTo().window(winList.get(1));
		//chooseLead("11195");
		driver.findElementByXPath(" //label[text()='Lead ID:']/following::input[1]").sendKeys("13137");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a")));
		//Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a").click();
		//swaptoParent();
		driver.switchTo().window(winList.get(0));
		//mergeLeads(2,1);
		driver.findElementByXPath("//input[@id='partyIdFrom']/following::a[2]").click();
		Set<String> mergeWindows3 = driver.getWindowHandles();
		List<String> winList3 = new ArrayList<String>();
		winList3.addAll(mergeWindows3);
		driver.switchTo().window(winList3.get(1));
		//chooseLead("11178");
		driver.findElementByXPath(" //label[text()='Lead ID:']/following::input[1]").sendKeys("13138");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		WebDriverWait wait1 = new WebDriverWait(driver, 5);
			wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(" //div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a")));
		//Thread.sleep(2000);
		driver.findElementByXPath(" //div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a").click();
		//swaptoParent();
		driver.switchTo().window(winList3.get(0));
		driver.findElementByXPath("//a[@class='buttonDangerous']").click();
		//Alerts
		driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		//findLeads("11195");
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath(" //label[text()='Lead ID:']/following::input[1]").sendKeys("13138");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		//Thread.sleep(2000);
		WebDriverWait wait2 = new WebDriverWait(driver, 5);
			wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x-paging-info']")));
		System.out.println(driver.findElementByXPath("//div[@class='x-paging-info']").getText());

		//driver.close();

	}

}
