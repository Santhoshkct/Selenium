package testcases.accounts;

import org.testng.annotations.Test;
import testcases.leads.LeafTapsMethods;

public class TC002_EditandSave extends LeafTapsMethods{

	@Test
	public void EditandSave() throws InterruptedException  {
		
		String acctname = "SampleAccount-4";
		String acctID = "10928";
		
		
		click(locateElement("xpath","//a[contains(text(),'CRM/SFA')]"));
		click(locateElement("xpath","//a[text()='Accounts']"));
		click(locateElement("xpath","//a[text()='Find Accounts']"));
		type(locateElement("xpath","//label[text()='Account ID:']/following::input[2]"),acctname);
		type(locateElement("xpath","//label[text()='Account ID:']/following::input[1]"),acctID);
		click(locateElement("xpath","//button[text()='Find Accounts']"));
		Thread.sleep(2000);
		click(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		verifyTitle("Account Details | opentaps CRM");
		click(locateElement("xpath","//a[text()='Edit']"));
		locateElement("id","accountName").clear();
		type(locateElement("id","accountName"),"New Entry");
		click(locateElement("xpath","(//input[@class='smallSubmit'])[1]"));
		verifyPartialText(locateElement("xpath","//span[text()='Account Name']/following::span[1]"),"New Entry");
		closeBrowser();		
	}	
}
