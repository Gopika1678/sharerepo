package alertdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentreports {
	public WebDriver driver;
	public static ExtentReports reports;
	public static  ExtentSparkReporter reporter;
	
	@Test
	public void reportsdemo() {
		reports.createTest("testreports");
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.get("https://www.amazon.com");
		String title=driver.getTitle();
		System.out.println(title);
		reports.flush();
	}
	@BeforeTest
	public static void extentreports1() {
		String path=System.getProperty("user.dir")+"//reports//index.html";
		reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("testdemo");
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("test", "demo");
		
	}
}
