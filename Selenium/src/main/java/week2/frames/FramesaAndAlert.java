package week2.frames;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesaAndAlert {


	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		//snap shot
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/img1.png");
		FileUtils.copyFile(src, des);

		driver.findElementByXPath("//button[text()='Try it']").click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Santhosh");
		/*snap shot
		File src1 = driver.getScreenshotAs(OutputType.FILE);
		File des1 = new File("./snaps/img2.png");
		FileUtils.copyFile(src1, des1);
*/
		driver.switchTo().alert().accept();
		if(driver.findElementById("demo").getText().contains("Santhosh"));
		System.out.println("Found\n" + driver.findElementById("demo").getText());
		driver.switchTo().defaultContent();
		driver.close();

	}

}
