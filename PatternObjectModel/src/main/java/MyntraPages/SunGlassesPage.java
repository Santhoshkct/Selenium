package MyntraPages;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.SeMethods;

public class SunGlassesPage extends SeMethods {

	public SunGlassesPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.CLASS_NAME,using ="product-brand")
	private List<WebElement> eleAllUniqueBrandName;
	@And("Get the List of Unique Brand Name")
	public SunGlassesPage GetAllUniqueBrandNames()  {
		Set<String> brandName = new HashSet<>();
		for (WebElement Name : eleAllUniqueBrandName) {
			brandName.add(Name.getText());			
		}
		System.out.println(brandName);
		return this;
	}

	@FindBy(how=How.XPATH,using="//h4[contains(text(),'Unisex')]/following::span[4][contains(text(),'40% OFF')]")
	private List<WebElement> ele40PercentDiscountUnisex;
	@And("Get the Count of sunglasses with unisex and 40% OFF")
	public SunGlassesPage GetCountof40PercentUnisex() {
		System.out.println("40% Discount item count : " + ele40PercentDiscountUnisex.size());
		return this;
	}


	@FindBy(how=How.XPATH,using="//label[@style='background-color: rgb(94, 177, 96);']")
	private WebElement eleColorCategory;
	@And("Select Green Catogory")
	public SunGlassesPage ClickGreenColorCatogory() {
		click(eleColorCategory);
		return this;
	}

	@FindBy(how=How.XPATH,using="//ul[@class='results-base']/li[2]")
	private WebElement eleSecondResult;
	@And("Select the Second Resultant sunglass")
	public ItemSummaryPage ClickSecondResultant() {
		click(eleSecondResult);
		return new ItemSummaryPage();
	}
}
