package testcases.leads;

import org.junit.Test;
import org.openqa.selenium.Keys;

import wdMethods.SeMethods;

public class TC006_IrctcSignup extends SeMethods {

	@Test
	public void IrctcSignup() throws InterruptedException {
		
		startApp("chrome", "https://www.irctc.co.in/eticketing/userSignUp.jsf");
		type(locateElement("userRegistrationForm:userName"),"Test");
		type(locateElement("userRegistrationForm:password"),"Test1234");
		type(locateElement("userRegistrationForm:confpasword"),"Test1234");
		selectDropDownUsingValue(locateElement("userRegistrationForm:securityQ"),"1");
		type(locateElement("userRegistrationForm:securityAnswer"),"LMMS");
		type(locateElement("userRegistrationForm:prelan"),"English");
		type(locateElement("userRegistrationForm:firstName"),"Test");
		click(locateElement("userRegistrationForm:gender:0"));
		click(locateElement("userRegistrationForm:maritalStatus:1"));
		type(locateElement("userRegistrationForm:dobDay"),"26");
		type(locateElement("userRegistrationForm:dobMonth"),"JUL");
		selectDropDownUsingText(locateElement("userRegistrationForm:dateOfBirth"),"1996");
		selectDropDownUsingIndex(locateElement("userRegistrationForm:occupation"), 5);
		type(locateElement("userRegistrationForm:countries"),"India");
		type(locateElement("userRegistrationForm:email"),"Test@abc.com");
		type(locateElement("userRegistrationForm:mobile"),"9393939393");
		type(locateElement("userRegistrationForm:nationalityId"),"India");
		type(locateElement("userRegistrationForm:address"),"1/70");
		type(locateElement("userRegistrationForm:pincode"),"600096");
		locateElement("userRegistrationForm:pincode").sendKeys(Keys.TAB);
		Thread.sleep(2000);
		System.out.println(getText(locateElement("userRegistrationForm:statesName")));
		selectDropDownUsingText(locateElement("userRegistrationForm:cityName"),"Kanchipuram");
		Thread.sleep(2000);
		selectDropDownUsingIndex(locateElement("userRegistrationForm:postofficeName"), 1);
		Thread.sleep(2000);
		type(locateElement("userRegistrationForm:landline"), "1234567");
		closeBrowser();
		
		
	}
	
}
