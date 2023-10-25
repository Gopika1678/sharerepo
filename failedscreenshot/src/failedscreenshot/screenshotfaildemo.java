package failedscreenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class screenshotfaildemo {
	WebDriver driver;
	@Test
	public void failscreen() {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		driver.findElement(By.id("screen")).click();
		
	}
	@AfterMethod
public void scrshot(ITestResult result) {
	try {
		if(ITestResult.FAILURE==result.getStatus()) {
			TakesScreenshot shrsct=(TakesScreenshot)driver;
			File src=shrsct.getScreenshotAs(OutputType.FILE);
			File dest=new File("C://Users//Hp//Downloads/scrshot.png");
			FileUtils.copyFile(src, dest);
		}
		
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
