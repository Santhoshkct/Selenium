package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {
	
	public CreateLeadPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using ="createLeadForm_companyName")
	private WebElement eleComName;
	@And("Enter Company name as (.*)")
	public CreateLeadPage typeCompanyName(String data)  {
		type(eleComName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using ="createLeadForm_firstName")
	private WebElement eleFirstName;
	@And("Enter First Name as (.*)")
	public CreateLeadPage typeFirstName(String data)  {
		type(eleFirstName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using ="createLeadForm_lastName")
	private WebElement eleLastName;
	@And("Enter Last Name as (.*)")
	public CreateLeadPage typeLastName(String data)  {
		type(eleLastName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using ="createLeadForm_primaryPhoneNumber")
	private WebElement elePhoneNo;
	@And("Enter PhoneNumber as (.*)")
	public CreateLeadPage typePhoneNoName(String data)  {
		type(elePhoneNo, data);
		return this;
	}
	
	@FindBy(how=How.ID,using ="createLeadForm_primaryEmail")
	private WebElement eleEmail;
	@And("Enter Email as (.*)")
	public CreateLeadPage typeEmail(String data)  {
		type(eleEmail, data);
		return this;
	}
	
	
	@FindBy(how=How.NAME,using = "submitButton")
	private WebElement eleClickCreateLead;
	@When("click on create Lead Button")
	public ViewLeadsPage ClickCreateLeadButton()  {
		click(eleClickCreateLead);
		return new ViewLeadsPage();
	}
	
}
