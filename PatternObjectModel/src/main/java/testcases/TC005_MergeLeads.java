package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pages.HomePage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_MergeLeads extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC005_MergeLeads";
		testDescription="Merge two Existing Leads";
		testNodes="MergeLeads";
		category="Sanity";
		authors="Santhosh";
		browserName="chrome";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public void CreateaNewLead(String firstLeadID,String secondLeadID) {
		
		new LoginPage()
		.enterUserName("DemoSalesManager").enterPassword("crmsfa").clickLogIn();
		
		String err = new HomePage()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLeads().clickFromLeadSearchButton().typeLeadID(firstLeadID).clickFindLeadsButton().clickFirstResultantLeadID()
		.clickToLeadSearchButton().typeLeadID(secondLeadID).clickFindLeadsButton().clickFirstResultantLeadID()
		.clickMergeButton().clickFindLeadsLink().typeLeadID(firstLeadID).clickFindLeadsButton()
		.getErrorInfo();
	    
		System.out.println(err);
		
	}

}
