package testcases.leads;

import org.junit.Test;

public class TC007_DeactivateAcct_P001 extends LeafTapsMethods{
	
	@Test
	public void deactivateAccount() throws InterruptedException {
		
		String acctName = "Hexa123";
		click(locateElement("xpath","//a[text()[contains(.,'CRM/SFA')]]"));
		click(locateElement("xpath","//a[text()='Accounts']"));
		click(locateElement("xpath","//a[text()='Find Accounts']"));
		type(locateElement("xpath","//label[text()='Account ID:']/following::input[2]"),acctName);
		type(locateElement("xpath","//label[text()='Account ID:']/following::input[1]"),"11455");
		click(locateElement("xpath","//button[text()='Find Accounts']"));
		String acctID = getText(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		verifyTitle("Account Details | opentaps CRM");
		clickWithouttakeSnap(locateElement("xpath","//a[@class='subMenuButtonDangerous']"));
		System.out.println(getAlertText());
		acceptAlert();
		System.out.println(getText(locateElement("xpath","//span[@class='subSectionWarning']")));
		click(locateElement("xpath","//a[text()='Find Accounts']"));
		type(locateElement("xpath","//label[text()='Account ID:']/following::input[2]"),acctName);
		type(locateElement("xpath","//label[text()='Account ID:']/following::input[1]"),acctID);
		click(locateElement("xpath","//button[text()='Find Accounts']"));
		System.out.println(getText(locateElement("xpath","//div[@class='x-paging-info']")));
		closeBrowser();
		
	}
}
