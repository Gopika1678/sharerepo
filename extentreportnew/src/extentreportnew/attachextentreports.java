package extentreportnew;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class attachextentreports {
	@Test
	public void extent() throws IOException {
		ExtentReports reports=new ExtentReports();
		ExtentSparkReporter reporter=new ExtentSparkReporter("index.html");
		ExtentSparkReporter failedreporter=new ExtentSparkReporter("failed_index.html");
		failedreporter.config().setDocumentTitle("failed test");
		failedreporter.config().setReportName("reports");
		reporter.config().setDocumentTitle("passed test");
		reporter.config().setDocumentTitle("reportspassed");
		reports.attachReporter(reporter,failedreporter);
		
		ExtentTest test=reports.createTest("testdemo");
		test.pass("testpassed");
		ExtentTest test1=reports.createTest("failedtestdemo");
		test1.fail("test failed");

		
		reports.flush();
		
		Desktop.getDesktop().browse(new File("index.html").toURI());
		Desktop.getDesktop().browse(new File("failed_index.html").toURI());
		}
}
