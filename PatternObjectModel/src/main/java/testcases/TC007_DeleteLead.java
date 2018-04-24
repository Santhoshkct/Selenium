package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.HomePage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_DeleteLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC007_DeleteLead";
		testDescription="Delete an Existing Lead";
		testNodes="Leads";
		category="Sanity";
		authors="Santhosh";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test(dataProvider="fetchData")
	public void CreateaNewLead(String email) {
		
		new LoginPage()
		.enterUserName("DemoSalesManager").enterPassword("crmsfa").clickLogIn();
		
		String LeadID = new HomePage()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads().clickEmailField().typeEmailAddress(email).clickFindLeadsButton().getFirstResultantLeadID();
		
		String err = new FindLeadsPage()
		.clickFirstResultantLead().clickDeleteButton().clickFindLeads().typeLeadID(LeadID).clickFindLeadsButton().getErrorInfo();
		
		System.out.println(err);
}
}
