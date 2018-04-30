package MyntraPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.SeMethods;

public class ItemSummaryPage extends SeMethods {

	static String productName;
	public ItemSummaryPage() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(how=How.XPATH,using="//h1[@class='pdp-title']")
	private WebElement eleProductName;
	@And("Store the Product Name")
	public ItemSummaryPage GetProductName()  {
		productName = getText(eleProductName);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[@class='pdp-add-to-bag pdp-button']")
	private WebElement eleAddtoBag;
	@And("Click on Add to Bags Button")
	public ItemSummaryPage ClickAddtoBag()  {
		click(eleAddtoBag);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//a[@class='pdp-goToCart pdp-add-to-bag pdp-button']")
	private WebElement eleGotoBag;
	@And("Click on Go to Bags Button")
	public ShoppingBagPage ClickGotoBag()  {
		click(eleGotoBag);
		return new ShoppingBagPage();
	}
	
	
	
	
	
	
	
	
	
	
	
}
