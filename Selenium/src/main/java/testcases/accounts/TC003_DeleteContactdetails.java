package testcases.accounts;

import org.testng.annotations.Test;
import testcases.leads.LeafTapsMethods;

public class TC003_DeleteContactdetails extends LeafTapsMethods{
	
	@Test
	
	public void deleteContact() throws InterruptedException  {
		
		
		click(locateElement("xpath","//a[contains(text(),'CRM/SFA')]"));
		click(locateElement("xpath","//a[text()='Accounts']"));
		click(locateElement("xpath","//a[text()='Find Accounts']"));
		click(locateElement("xpath","//span[text()='Phone']"));
		type(locateElement("xpath","//input[@name='phoneNumber']"),"8903423595");
		click(locateElement("xpath","//button[text()='Find Accounts']"));
		Thread.sleep(2000);
		String acctID = getText(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		click(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		click(locateElement("xpath","//img[@alt='Expire']"));
		click(locateElement("xpath","//a[text()='Find Accounts']"));
		type(locateElement("xpath","//label[text()='Account ID:']/following::input[1]"), acctID);
		click(locateElement("xpath","//button[text()='Find Accounts']"));
		Thread.sleep(2000);
		System.out.println(getText(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-formatedPrimaryPhone']")));
		closeBrowser();
	}
}
