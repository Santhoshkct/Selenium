package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.SeMethods;

public class MergeLeadsPage extends SeMethods {

	public MergeLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using = "//input[@id='partyIdFrom']/following::a[1]")
	private WebElement eleFromLeadSearch;
	@And("Click From Lead Search Button")
	public FindLeadsWindow clickFromLeadSearchButton()   {
		click(eleFromLeadSearch);
		switchToWindow(1);
		return new FindLeadsWindow();
	}
	

	@FindBy(how=How.XPATH,using = "//input[@id='partyIdFrom']/following::a[2]")
	private WebElement eleToLeadSearch;
	@And("Click TO Lead Search Button")
	public FindLeadsWindow clickToLeadSearchButton()   {
		click(eleToLeadSearch);
		switchToWindow(1);
		return new FindLeadsWindow();
	}	
	
	
	@FindBy(how=How.XPATH,using = "//a[@class='buttonDangerous']")
	private WebElement eleMergeButton;
	@And("Click Merge Button")
	public ViewLeadsPage clickMergeButton()   {
		clickWithNoSnap(eleMergeButton);
		acceptAlert();
		return new ViewLeadsPage();
	}	

}
