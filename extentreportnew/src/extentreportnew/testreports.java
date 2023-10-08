package extentreportnew;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class testreports {
	
	public static ExtentReports extent;
	public static ExtentSparkReporter reports;
	public static ExtentTest test;
	
	@BeforeTest
	public static void testreport() {
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		//ExtentHtmlReporter htmlreporter=new ExtentHtmlReporter();
		reports= new ExtentSparkReporter(path);
		reports.config().setDocumentTitle("Google");
		reports.config().setTheme(Theme.DARK);
		extent=new ExtentReports();		
		extent.attachReporter(reports);
		extent.setSystemInfo("Rahul", "Academy");
		
	}
	@Test
	public void reportsdemo() {
		extent.createTest("initialdemo");
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		extent.flush();
		
	}
	@AfterTest
	public void report() {
		extent.createTest("demoinitial");
		System.out.println("success");
		
	}
}
