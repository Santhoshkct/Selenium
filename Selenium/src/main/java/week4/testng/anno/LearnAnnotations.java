package week4.testng.anno;

import org.testng.annotations.*;

import wdMethods.SeMethods;

public class LearnAnnotations extends SeMethods {

	@Test
	public void test2() {
		System.out.println("Test2-A");	}
	
	@BeforeSuite	
	public void beforeSuite() {
		System.out.println("beforeSuite");	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");	}
	
	@Test
	public void test1() {
		System.out.println("test1");	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");	}
}
