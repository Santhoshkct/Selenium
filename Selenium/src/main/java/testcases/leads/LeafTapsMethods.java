package testcases.leads;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import wdMethods.SeMethods;

public class LeafTapsMethods extends SeMethods{
	
	@Parameters({"url","username","pwd"})
	//@BeforeMethod(groups= {"All"})
	@BeforeMethod
	public void loginFunctionLeaftaps(String url,String username,String pwd) {
		
		startApp("chrome", url);
		type(locateElement("id", "username"),username);
		type(locateElement("id", "password"),pwd);
		click(locateElement("class", "decorativeSubmit"));	
		System.out.println("before Method");
	}
	
	//@AfterMethod(groups={"smoke","sanity","regression"},alwaysRun=true)
	@AfterMethod
	public void closeBrowser1() {
		System.out.println("After Method");
		closeBrowser();
	}
	
}
