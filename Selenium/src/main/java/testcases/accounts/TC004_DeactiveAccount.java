package testcases.accounts;

import org.testng.annotations.Test;
import testcases.leads.LeafTapsMethods;

public class TC004_DeactiveAccount extends LeafTapsMethods {
	
	@Test
	public void deactiveAccount() throws InterruptedException  {

		String acctname = "New Entry";
		String acctID = "10928";
		
		
		click(locateElement("xpath","//a[contains(text(),'CRM/SFA')]"));
		click(locateElement("xpath","//a[text()='Accounts']"));
		click(locateElement("xpath","//a[text()='Find Accounts']"));
		type(locateElement("xpath","//label[text()='Account ID:']/following::input[2]"),acctname);
		type(locateElement("xpath","//label[text()='Account ID:']/following::input[1]"),acctID);
		click(locateElement("xpath","//button[text()='Find Accounts']"));
		Thread.sleep(2000);
		acctID = getText(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		click(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		verifyTitle("Account Details | opentaps CRM");
		
		clickWithouttakeSnap(locateElement("xpath","//a[text()='Deactivate Account']"));
		getAlertText();
		acceptAlert();
		System.out.println(getText(locateElement("xpath","//span[@class='subSectionWarning']")));
		
		click(locateElement("xpath","//a[text()='Find Accounts']"));
		type(locateElement("xpath","//label[text()='Account ID:']/following::input[2]"),acctname);
		type(locateElement("xpath","//label[text()='Account ID:']/following::input[1]"),acctID);
		click(locateElement("xpath","//button[text()='Find Accounts']"));
		Thread.sleep(2000);
		System.out.println(getText(locateElement("xpath","//div[@class='x-paging-info']")));
		closeBrowser();
	
	}

}
