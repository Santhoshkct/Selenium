package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{
	
	public MyLeadsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.LINK_TEXT,using ="Create Lead")
	private WebElement eleCreateLead;
	@And("Click on Create Lead link")
	public CreateLeadPage clickCreateLead()  {
		click(eleCreateLead);
		return new CreateLeadPage();
	}
	
	@FindBy(how=How.LINK_TEXT,using ="Find Leads")
	private WebElement eleFindLeads;
	//@And("Click Find Leads Link")
	public FindLeadsPage clickFindLeads()  {
		click(eleFindLeads);
		return new FindLeadsPage();
	}
	
	@FindBy(how=How.LINK_TEXT,using ="Merge Leads")
	private WebElement eleMergeLeads;
	@And("Click on Merge Leads link")
	public MergeLeadsPage clickMergeLeads()  {
		click(eleMergeLeads);
		return new MergeLeadsPage();
		
	}
	
	
}
