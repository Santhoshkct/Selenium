package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class FindLeadsWindow extends ProjectMethods{

	public FindLeadsWindow() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using = "//label[text()='Lead ID:']/following::input[1]")
	private WebElement eleLeadID;
	@And("Enter the LeadID as (.*)")
	public FindLeadsWindow typeLeadID(String data) {
		type(eleLeadID,data);
		return this;
	}	

	@FindBy(how=How.XPATH,using = "//button[text()='Find Leads']")
	private WebElement eleFindLeadsButton;
	@And("Click on Find Leads Button")
	public FindLeadsWindow clickFindLeadsButton() {
		click(eleFindLeadsButton);
		return this;
	}


	@FindBy(how=How.XPATH,using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a")
	private WebElement eleFirstResultantLeadID;
	@And("Click First Resultant Lead result")
	public MergeLeadsPage clickFirstResultantLeadID() {
		clickWithNoSnap(eleFirstResultantLeadID);
		switchToWindow(0);
		return new MergeLeadsPage();
	}	

}
