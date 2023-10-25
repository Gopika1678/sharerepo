package failedscreenshot;
import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class screenshotimage implements ITestListener {
	public WebDriver driver;
		@Test
	public void demoscrsht() {
		 driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabssearchtextbox"));
		
	}
		@AfterMethod()
		public void failscrsht(ITestResult result) {
			if(ITestResult.FAILURE==result.getStatus()) {
				try {
					TakesScreenshot scrsht=(TakesScreenshot)driver;
					File src=scrsht.getScreenshotAs(OutputType.FILE);
					File destfile=new File("C://Users//HP//Downloads/scrshotfailed.png");
					FileUtils.copyFile(src, destfile);
				}catch(Exception e) {
					System.out.println("Exception caused");
				}
			}
			driver.quit();
		}

}
