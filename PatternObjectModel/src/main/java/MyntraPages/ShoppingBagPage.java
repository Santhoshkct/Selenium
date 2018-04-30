package MyntraPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.SeMethods;

public class ShoppingBagPage extends SeMethods {

	public ShoppingBagPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="//a[@class='c-gray']")
	private WebElement eleProductTitle;
	@And("Verify Product name with Stored Name")
	public ShoppingBagPage VerifyProductTitle()  {
		verifyExactText(eleProductTitle, ItemSummaryPage.productName);
		return this;
	}

	@And("Print Product Name")
	public ShoppingBagPage PrintProductName() {
		System.out.println("Product Name : " + getText(eleProductTitle));
		return this;
	}

	@FindBy(how=How.XPATH,using="//div[@class='c-dblue total-rupees']")
	private WebElement eleProductPrice;
	@And("Print Product Price")
	public ShoppingBagPage PrintProductPrice() {
		System.out.println("Product Price : " + getText(eleProductPrice));
		return this;
	}


}
