//package featuresImplementation;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
//
//import cucumber.api.Scenario;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.*;
//
//public class FeatureImplementation {
//
//	public static RemoteWebDriver driver;
//
//	@Before
//	public void beforeTask(Scenario sc)  {
//		System.out.println(sc.getName());
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );
//		driver = new ChromeDriver();
//		driver.get("http://www.leaftaps.com/opentaps/");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//	
//	
//	@And("Enter the username as (.*)")
//	public void enterUname(String uName)  {
//		driver.findElementById("username").sendKeys(uName);
//
//	}
//
//	@And("Enter the Password as (.*)")
//	public void enterPWD(String pwd)  {
//		driver.findElementById("password").sendKeys(pwd);
//	}
//
//	@When("Click on Login Button")
//	public void clickLoginButton()  {
//		driver.findElementByClassName("decorativeSubmit").click();
//	}
//
//	@Then("Login Successful")
//	public void  verifyLogin() {
//		System.out.println("Login is Successful");
//
//	}
//
//	@And("Click on crmsfa")
//	public void  clickCRMSFA() {
//		driver.findElementByLinkText("CRM/SFA").click();
//		}
//
//	@And("Click on Leads link")
//	public void  clickLeads() {
//		driver.findElementByLinkText("Leads").click();
//	}
//
//	@And("Click on Create Lead link")
//	public void  clickCreateLead() {
//		driver.findElementByLinkText("Create Lead").click();
//	}
//
//	@And("Enter Company name as (.*)")
//	public void  enterCname(String cName) {
//		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
//	}
//
//	@And("Enter First Name as (.*)")
//	public void  enterFname(String fName) {
//		driver.findElementById("createLeadForm_firstName").sendKeys(fName);}
//
//	@And("Enter Last Name as (.*)")
//	public void  enterLname(String lName) {
//		driver.findElementById("createLeadForm_lastName").sendKeys(lName);}
//
//
//	@And("Enter PhoneNumber as (.*)")
//	public void  enterpNum(String pNum) {
//		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(pNum);}
//
//	@And("Enter Email as (.*)")
//	public void  entereMail(String eMail) {
//		driver.findElementById("createLeadForm_primaryEmail").sendKeys(eMail);}
//
//	@When("click on create Lead Button")
//	public void  ClickCreateLead() {
//		driver.findElementByXPath("//input[@name='submitButton']").click();}
//
//	@Then("New Lead is created")
//	public void verifyNewLead()  {
//		System.out.println("New Lead Created");
//	}
//	
//	@After
//	public void closeBrowser(Scenario sc)  {
//		driver.close();
//		System.out.println(sc.getStatus());
//	}
//}
