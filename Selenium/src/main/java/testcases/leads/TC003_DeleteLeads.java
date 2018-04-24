package testcases.leads;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TC003_DeleteLeads extends LeafTapsMethods {
	
	//@Test(dependsOnMethods= {"testcases.TC001_CreateLead.loginLeaftaps"})
	@Test(groups="regression",dependsOnGroups="sanity")
	public void deleteLeads() throws InterruptedException {
		click(locateElement("linktext","CRM/SFA"));
		click(locateElement("linktext","Leads"));
		click(locateElement("linktext", "Find Leads"));
		click(locateElement("linktext", "Phone"));
		//type(locateElement("name","phoneAreaCode"),"91");
		type(locateElement("name","phoneNumber"),"8903423595");
		click(locateElement("xpath","//button[text()='Find Leads']"));
		Thread.sleep(2000);
		String leadID = getText(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateElement("linktext","Delete"));
		click(locateElement("linktext","Find Leads"));
		type(locateElement("xpath","//label[text()='Lead ID:']/following::input[1]"),leadID);
		click(locateElement("xpath","//button[text()='Find Leads']"));
		System.out.println(getText(locateElement("xpath","//div[@class='x-paging-info']")));
		System.out.println("Delete Lead");
	}

}
