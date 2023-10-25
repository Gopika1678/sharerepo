package failedscreenshot;
import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.apache.commons.io.*;
public class testngscreen implements ITestListener  {
	public WebDriver driver;
	@Test
	public void testscreen() {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.get("https://www.amazon.com");
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-0']")).click();
	}
	@AfterMethod
	public void teardown(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus()) {
			try {
				TakesScreenshot scrscht=(TakesScreenshot)driver;
				File srcfile=scrscht.getScreenshotAs(OutputType.FILE);
				File file=new File("C://Users//Hp//Downloads/scrshotfail.png");
				FileUtils.copyFile(srcfile, file);
				
			}catch(Exception e) {
				System.out.println("Exception caused" +e);
			}
		}
		driver.quit();
	}
		}
