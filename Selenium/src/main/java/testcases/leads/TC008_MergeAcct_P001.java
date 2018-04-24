package testcases.leads;

import org.junit.Test;

public class TC008_MergeAcct_P001 extends LeafTapsMethods{
	
	@Test
	public void mergeAcct() throws InterruptedException {
		
		click(locateElement("xpath","//a[text()[contains(.,'CRM/SFA')]]"));
		click(locateElement("xpath","//a[text()='Accounts']"));
		click(locateElement("xpath","//a[text()='Merge Accounts']"));
		
		String[] acctID = {"11527","11529"};
		for(int i=0; i<2;i++)
		{
		click(locateElement("xpath","//input[@id='partyIdFrom']/following::a[" + (i+1) + "]"));
		switchToWindow(1);
		type(locateElement("xpath","//label[text()='Account ID:']/following::input[1]"),acctID[i]);
		click(locateElement("xpath","//button[text()='Find Accounts']"));
		Thread.sleep(2000);
		clickWithouttakeSnap(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		switchToWindow(0);
		}
		
		clickWithouttakeSnap(locateElement("xpath","//a[@class='buttonDangerous']"));
		acceptAlert();
		click(locateElement("xpath","//a[text()='Find Accounts']"));
		type(locateElement("xpath","//label[text()='Account ID:']/following::input[1]"),acctID[0]);
		click(locateElement("xpath","//button[text()='Find Accounts']"));
		Thread.sleep(2000);
		System.out.println(getText(locateElement("xpath","//div[@class='x-paging-info']")));
		closeBrowser();
		
		
		
		
		
		
	}

}
