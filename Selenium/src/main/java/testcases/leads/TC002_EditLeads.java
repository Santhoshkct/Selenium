package testcases.leads;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TC002_EditLeads extends LeafTapsMethods {

	//@Test(dependsOnMethods= {"testcases.TC001_CreateLead.loginLeaftaps"})
	@Test//(groups="sanity",dependsOnGroups="smoke")
	public void editLeads() throws InterruptedException {
		String name = "SampleCom-2";
		click(locateElement("linktext","CRM/SFA"));
		click(locateElement("linktext","Leads"));
		click(locateElement("linktext", "Find Leads"));
		System.out.println("Edit Lead");
		type(locateElement("xpath","//label[text()='Lead ID:']/following::input[4]"),name);
		click(locateElement("xpath","//button[text()='Find Leads']"));
		Thread.sleep(2000);
		click(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		verifyPartialText(locateElement("viewLead_companyName_sp"), name);
		click(locateElement("linktext", "Edit"));
		locateElement("xpath","//input[@id='updateLeadForm_companyName']").clear();
		type(locateElement("xpath","//input[@id='updateLeadForm_companyName']"),"FreshEntry-3");
		Thread.sleep(2000);
		click(locateElement("xpath","//input[@name='submitButton'][1]"));
	}
	
}
