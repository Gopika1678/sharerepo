package newlink;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyInput;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class newlinkdemo {
	public WebDriver driver;
	ExtentReports reports;
	ExtentSparkReporter reporter;
	@BeforeTest
	public void extentreports() {
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("extent reports");
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("testdemo", "reports");
		
	}
	@Test
	public void newlink() {
		reports.createTest("testdemo");
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		////li[@class='hl-cat-nav__js-tab hl-cat-nav__js-show']//a[contains(text(),'Electronics')]
		driver.get("https://www.ebay.com");
		String getTitles=driver.getTitle();
		System.out.println(getTitles);
		
				reports.flush();
	}
	@Test
	public void searchbox() {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com");
		driver.findElement(By.id("gh-ac")).sendKeys("nail polish");

	}
}
