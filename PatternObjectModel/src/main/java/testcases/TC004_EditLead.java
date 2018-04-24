package testcases;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Edit an Existing Lead";
		testNodes="Leads";
		category="Sanity";
		authors="Santhosh";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void CreateaNewLead(String comName,String newComName) throws MalformedURLException {
		
		/*DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver = new RemoteWebDriver(
				new URL("http://192.168.43.32:4444/wd/hub"), dc);
	*/
		
		new LoginPage()
		.enterUserName("DemoSalesManager").enterPassword("crmsfa").clickLogIn();
		
		new HomePage()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads().typeCompanyName(comName).clickFindLeadsButton().clickFirstResultantLead()
		.verifyCompanyName(comName).clickEditButton().clearCompanyNameField()
		.typeCompanyNameField(newComName).clickUpdateButton();
	}

}
