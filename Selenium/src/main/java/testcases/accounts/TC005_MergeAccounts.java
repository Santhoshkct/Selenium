package testcases.accounts;

import org.testng.annotations.Test;
import testcases.leads.LeafTapsMethods;

public class TC005_MergeAccounts extends LeafTapsMethods{

	@Test

	public void mergeAccounts() throws InterruptedException  {


		click(locateElement("xpath","//a[contains(text(),'CRM/SFA')]"));
		click(locateElement("xpath","//a[text()='Accounts']"));
		click(locateElement("xpath","//a[text()='Merge Accounts']"));

		String[]  acctID = {"10927","10877"};
		for(int i=0;i<2;i++)
		{
			click(locateElement("xpath","//input[@id='partyIdFrom']/following::a["+ (i+1) +"]"));
			switchToWindow(1);
			type(locateElement("xpath","//label[text()='Account ID:']/following::input[1]"), acctID[i]);
			click(locateElement("xpath","//button[text()='Find Accounts']"));
			Thread.sleep(2000);
			clickWithouttakeSnap(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a"));
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
