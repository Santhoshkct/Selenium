package testcases.accounts;

import org.testng.annotations.Test;

import testcases.leads.LeafTapsMethods;

public class TC001_CreateAccount extends LeafTapsMethods {
	
	@Test
	public void createAccount() {
		
		String acctname = "SampleAccount-6";
		click(locateElement("xpath","//a[contains(text(),'CRM/SFA')]"));
		click(locateElement("xpath","//a[text()='Accounts']"));
		click(locateElement("xpath","//a[text()='Create Account']"));
		type(locateElement("id","accountName"),acctname);
		selectDropDownUsingText(locateElement("name","industryEnumId"),"Retail");
		selectDropDownUsingValue(locateElement("id","currencyUomId"),"USD");
		selectDropDownUsingIndex(locateElement("id","dataSourceId"),3);
		selectDropDownUsingText(locateElement("name","marketingCampaignId"),"Demo Marketing Campaign");
		type(locateElement("id","primaryPhoneNumber"),"8903423595");
		type(locateElement("id","generalCity"),"Chennai");
		type(locateElement("id","primaryEmail"),"sample@abc.com");
		selectDropDownUsingText(locateElement("id","generalCountryGeoId"),"India");
		selectDropDownUsingValue(locateElement("id","generalStateProvinceGeoId"),"IN-TN");
		click(locateElement("xpath","//input[@class='smallSubmit']"));
		String acctID = getText(locateElement("xpath","//span[text()='Account Name']/following::span[1]")).substring(getText(locateElement("xpath","//span[text()='Account Name']/following::span[1]")).indexOf("(")+1,getText(locateElement("xpath","//span[text()='Account Name']/following::span[1]")).indexOf(")"));
		click(locateElement("xpath","//a[text()='Find Accounts']"));
		type(locateElement("xpath","//label[text()='Account ID:']/following::input[2]"),acctname);
		type(locateElement("xpath","//label[text()='Account ID:']/following::input[1]"),acctID);
		click(locateElement("xpath","//button[text()='Find Accounts']"));
		closeBrowser();	
		
	}	

}
