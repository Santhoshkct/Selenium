package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class ViewLeadsPage extends ProjectMethods {

	public ViewLeadsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using ="viewLead_firstName_sp")
	private WebElement eleFirstNameVerify;
	public ViewLeadsPage verifyFirstName(String data)  {
		verifyExactText(eleFirstNameVerify, data);
		return this;
	}
	
	@FindBy(how=How.ID,using ="viewLead_companyName_sp")
	private WebElement eleCompanyNameVerify;
	@And("Verify the company name with (.*)")
	public ViewLeadsPage verifyCompanyName(String data)  {
		verifyPartialText(eleCompanyNameVerify, data);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using ="Edit")
	private WebElement eleEditButton;
	@And("Click on Edit Button")
	public ViewLeadsPage clickEditButton()  {
		click(eleEditButton);
		return this;
	}
	
	@FindBy(how=How.XPATH,using ="//input[@id='updateLeadForm_companyName']")
	private WebElement eleCompanyNameField;
	@And("Clear Company Name field")
	public ViewLeadsPage clearCompanyNameField()  {
		eleCompanyNameField.clear();
		return this;
	}
	
	@And("Enter the new Company name as (.*)")
	public ViewLeadsPage typeCompanyNameField(String data)  {
		type(eleCompanyNameField, data);
		return this;
	}
		
	@FindBy(how=How.XPATH,using ="//input[@name='submitButton'][1]")
	private WebElement eleUpdateButton;
	@And("Click Update Button")
	public ViewLeadsPage clickUpdateButton()  {
		click(eleUpdateButton);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using ="Delete")
	private WebElement eleDeleteButton;
	@And("Click on Delete Button")
	public MyLeadsPage clickDeleteButton()  {
		click(eleDeleteButton);
		return new MyLeadsPage();
	}
	
	@FindBy(how=How.LINK_TEXT, using ="Duplicate Lead")
	private WebElement eleDuplicateButton;
	public DuplicateLeadPage clickDuplicateButton()  {
		click(eleDuplicateButton);
		return new DuplicateLeadPage();
	}
	
	
	@FindBy(how=How.LINK_TEXT, using ="Find Leads")
	private WebElement eleFindLeadsLink;
	@And("Click Find Leads Link")
	public FindLeadsPage clickFindLeadsLink()  {
		click(eleFindLeadsLink);
		return new FindLeadsPage();
	}
	
	
	
}
