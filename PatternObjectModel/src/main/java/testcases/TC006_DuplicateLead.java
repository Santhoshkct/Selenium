package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DuplicateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC006_DuplicateLead";
		testDescription="Duplicate an Existing Lead";
		testNodes="Leads";
		category="Sanity";
		authors="Santhosh";
		browserName="chrome";
		dataSheetName="TC006";
	}
	@Test(dataProvider="fetchData")
	public void CreateaNewLead(String email,String HeaderTitle,String firstName) {
		
		new LoginPage()
		.enterUserName("DemoSalesManager").enterPassword("crmsfa").clickLogIn();
		
		new HomePage()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads().clickEmailField().typeEmailAddress(email).clickFindLeadsButton()
		.clickFirstResultantLead().clickDuplicateButton().verifyHeaderTitle(HeaderTitle).clickSubmitButton().verifyFirstName(firstName);

}
}
