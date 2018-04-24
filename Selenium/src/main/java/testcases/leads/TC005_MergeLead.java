package testcases.leads;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TC005_MergeLead extends LeafTapsMethods{

	//@Test(enabled=true,priority=2)
	@Test(groups="sanity",dependsOnGroups="smoke")
	public void mergeLeads() throws InterruptedException {
		
		click(locateElement("linktext","CRM/SFA"));
		click(locateElement("linktext","Leads"));
		click(locateElement("linktext","Merge Leads"));
		
		String[] leadID = {"11729","11954"};
		for(int i=0;i<2;i++) {
		click(locateElement("xpath","//input[@id='partyIdFrom']/following::a["+ (i+1) +"]"));
		switchToWindow(1);
		type(locateElement("xpath","//label[text()='Lead ID:']/following::input[1]"),leadID[i]);
		click(locateElement("xpath","//button[text()='Find Leads']"));
		Thread.sleep(2000);
		clickWithouttakeSnap(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a"));
		switchToWindow(0);
		}
		clickWithouttakeSnap(locateElement("xpath","//a[@class='buttonDangerous']"));
		System.out.println(getAlertText());
		acceptAlert();
		click(locateElement("linktext","Find Leads"));
		type(locateElement("xpath","//label[text()='Lead ID:']/following::input[1]"),leadID[0]);
		click(locateElement("xpath","//button[text()='Find Leads']"));
		Thread.sleep(2000);
		System.out.println("Error Message : " + getText(locateElement("xpath","//div[@class='x-paging-info']")));
		System.out.println("Merge Lead");
	}
	
}
