import java.awt.Desktop;
import java.net.URI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentreports {
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentSparkReporter reporter;
	@Test(priority=1)
	public void reports() {
		String path=System.getProperty("user.dir")+"//reports//index.html";
		reporter=new ExtentSparkReporter(path);		
		ExtentSparkReporter reporter_failed=new ExtentSparkReporter("Failed tests");
		reporter_failed.filter().statusFilter().as(new Status[] {Status.FAIL}).apply();
		reporter.config().setDocumentTitle("testdemo");
		reports=new ExtentReports();
		reports.attachReporter(reporter,reporter_failed);
		reports.setSystemInfo("test", "demo");
		
	}
		
	@Test(priority=2)
public void extent() {
		reports.createTest("test");
		reports.createTest("failed_test");
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.id("p"));
		reports.flush();
		reports.flush();
	
}
	

	
}
