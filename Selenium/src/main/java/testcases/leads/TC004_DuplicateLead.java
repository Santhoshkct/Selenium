package testcases.leads;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TC004_DuplicateLead extends LeafTapsMethods{

	@Test(groups="smoke")
	public void duplicateLead() throws InterruptedException {
		click(locateElement("linktext","CRM/SFA"));
		click(locateElement("linktext","Leads"));
		click(locateElement("linktext", "Find Leads"));
		click(locateElement("linktext","Email"));
		type(locateElement("name","emailAddress"),"santhosh1@gmail.com");
		click(locateElement("xpath","//button[text()='Find Leads']"));
		Thread.sleep(2000);
		String name = getText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		click(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateElement("linktext", "Duplicate Lead"));
		verifyExactText(locateElement("sectionHeaderTitle_leads"),"Duplicate Lead");
		click(locateElement("name","submitButton"));
		verifyExactText(locateElement("viewLead_firstName_sp"), name);
		System.out.println("Duplicate Lead");
	}
}
