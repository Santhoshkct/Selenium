package MyntraTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import MyntraPages.MyntraHomePage;
import wdMethods.ProjectMethods;

public class MyntraTestCase extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC001_Order A SunGlass";
		testDescription="Order a Green Color Sunglass and Get all Brand Names";
		testNodes="Myntra";
		category="Smoke";
		authors="Santhosh";
		browserName="chrome";
		dataSheetName="TC001";
	}
	
	//@Test(dataProvider="fetchData")
	@Test
	public void MyntraTestCase_001() { 
		
		new MyntraHomePage()
		.enterSearchString("Sunglasses").ClickSearchButton()
		.GetAllUniqueBrandNames()
		.GetCountof40PercentUnisex()
		.ClickGreenColorCatogory().ClickSecondResultant()
		.GetProductName().ClickAddtoBag().ClickGotoBag()
		.VerifyProductTitle()
		.PrintProductName().PrintProductPrice();

	}







}

