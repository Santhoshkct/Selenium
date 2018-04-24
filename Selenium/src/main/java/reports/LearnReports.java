package reports;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnReports {

	public static void main(String[] args) throws IOException {
	
		
		//BeforeSuite
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/TestResult.html");
		html.setAppendExisting(false);
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		
		//BeforeMethod
		ExtentTest test = extent.createTest("TC001_Create Lead","Create a New Lead");

		
		
		test.assignCategory("UAT");
		test.assignAuthor("Santhosh");
		//AfterMethod
		test.pass("Data Username is entered",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
		test.pass("Data Pwd is entered",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img2.png").build());
		test.pass("Login button is Clicked",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img3.png").build());
		test.fatal("NullPointerExcepection");
		
		
		test = extent.createTest("TC002_Create Account","Create a New Account");

		test.assignCategory("UAT");
		test.assignAuthor("Abhishek");
		test.pass("Data Username1 is entered",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
		test.pass("Data Pwd1 is entered",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img2.png").build());
		test.pass("Login button1 is Clicked",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img3.png").build());
		test.skip("Not Applicatble step");
		
		//AfterSuite
		extent.flush();

	}

}
