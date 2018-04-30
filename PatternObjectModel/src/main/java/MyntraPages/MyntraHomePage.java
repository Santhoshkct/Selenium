package MyntraPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.SeMethods;

public class MyntraHomePage extends SeMethods{

	public MyntraHomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.CLASS_NAME,using ="desktop-searchBar")
	private WebElement eleMyntraSearchWindow;
	@And("Enter the search String (.*) in search option")
	public MyntraHomePage enterSearchString(String data)  {
		type(eleMyntraSearchWindow, data);
		return this;
	}

	@FindBy(how=How.XPATH,using="//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")
	private WebElement eleSearchButton;
	@And("Click the Myntra Search Button")
	public SunGlassesPage ClickSearchButton() {
		click(eleSearchButton);
		return new SunGlassesPage();
	}

}
