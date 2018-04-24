package week2.frames;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MergeLeadsMar17 {

	static RemoteWebDriver driver = null;
	public static final void launcher() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public static void loginTestLeaf() {
		driver.get("http://www.leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
	}
	public static void mergeLeads(int opt,int window) {
		driver.findElementByXPath("//input[@id='partyIdFrom']/following::a[" + opt + "]").click();
		Set<String> mergeWindows = driver.getWindowHandles();
		List<String> winList = new ArrayList<String>();
		winList.addAll(mergeWindows);
		driver.switchTo().window(winList.get(window));
	}

	public static void chooseLead(String iD1) throws InterruptedException {
		driver.findElementByXPath(" //label[text()='Lead ID:']/following::input[1]").sendKeys(iD1);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		//webWait("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a");
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a").click();
	}

	public static void webWait(String path)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path)));
	}

	public static void swaptoParent() {
		Set<String> mergeWindows = driver.getWindowHandles();
		List<String> winList = new ArrayList<String>();
		winList.addAll(mergeWindows);
		driver.switchTo().window(winList.get(0));
	}
	public static void findLeads(String iD)
	{//Find Lead Again
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath(" //label[text()='Lead ID:']/following::input[1]").sendKeys(iD);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		webWait("//div[@class='x-paging-info']");
		System.out.println(driver.findElementByXPath("//div[@class='x-paging-info']").getText());
	}


	public static void main(String[] args) throws InterruptedException {
		launcher();
		loginTestLeaf();
		driver.findElementByLinkText("Merge Leads").click();
		mergeLeads(1,1);
		chooseLead("13134");
		swaptoParent();
		mergeLeads(2,1);
		chooseLead("11649");
		swaptoParent();
		driver.findElementByXPath("//a[@class='buttonDangerous']").click();
		//Alerts
		driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		findLeads("13134");
		driver.close();

	}

}
