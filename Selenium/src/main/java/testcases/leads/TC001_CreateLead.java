package testcases.leads;



import org.testng.annotations.Test;
import week5.Apache.ExcelOpening;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TC001_CreateLead extends LeafTapsMethods{
	
	//@Test(invocationCount=2)
	//@Test(groups= {"smoke"})
	@Test(dataProvider ="userdetails")
	public void loginLeaftaps(String cName,String fName,String lName,String phNo,String eMail) {
		click(locateElement("linktext","CRM/SFA"));
		click(locateElement("linktext","Leads"));
		click(locateElement("linktext","Create Lead"));
		System.out.println("Create Lead");
		type(locateElement("id", "createLeadForm_companyName"), cName);
		type(locateElement("id","createLeadForm_firstName"),fName);
		type(locateElement("id","createLeadForm_lastName"),lName);
		type(locateElement("id","createLeadForm_primaryPhoneNumber"),phNo);
		type(locateElement("id","createLeadForm_primaryEmail"),eMail);
		
		click(locateElement("name","submitButton"));
	}
	
	@DataProvider(name="userdetails")
	public Object[][] getData() throws IOException{
		ExcelOpening eopen = new ExcelOpening();
		return eopen.data();

	}
		
		
		
		
	/*
	 public Object[][] getData(){ 	
		Object[][] data = new Object [2][3];
		
		data[0][0] = "Hexa";
		data[0][1] = "User1";
		data[0][2] = "Last1";
		
		data[1][0] = "Hexa";
		data[1][1] = "User2";
		data[1][2] = "Last2";
		return data;
		
	}*/
}
