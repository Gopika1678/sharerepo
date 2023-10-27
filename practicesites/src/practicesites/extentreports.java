package practicesites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.*;
public class extentreports {
	public ExtentReports reports;
	public ExtentSparkReporter reporter;
	public WebDriver driver;
	@BeforeMethod
	public void reports() {
	//	System.setProperty("user", null)
		String path=System.getProperty("user.dir")+"//reports/index.html";
		reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("testdemo");
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		
	}
	@Test
	public void landpage() {
		reports.createTest("new test");
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		reports.flush();
	}
}
