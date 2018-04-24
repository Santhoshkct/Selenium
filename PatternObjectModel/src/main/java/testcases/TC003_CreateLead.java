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

public class TC003_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Create a New Lead";
		testNodes="CreateLead";
		category="Sanity";
		authors="Santhosh";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void CreateaNewLead(String comName,String firstName,String lastName,String email,String phoneNumber) throws MalformedURLException {
		
		/*
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver = new RemoteWebDriver(
				new URL("http://192.168.43.32:4444/wd/hub"), dc);*/
		
		new LoginPage()
		.enterUserName("DemoSalesManager").enterPassword("crmsfa").clickLogIn();
		
		new HomePage()
		.clickCRMSFA()
		.clickLeads().
		clickCreateLead().typeCompanyName(comName).typeFirstName(firstName).typeLastName(lastName).typeEmail(email).typePhoneNoName(phoneNumber).ClickCreateLeadButton()
		.verifyFirstName(firstName);
	}

}
