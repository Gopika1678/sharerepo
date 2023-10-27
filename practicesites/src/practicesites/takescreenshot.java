package practicesites;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class takescreenshot {
	public WebDriver driver;
	@Test
	public void screenshot() throws IOException {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		TakesScreenshot scrsht=(TakesScreenshot)driver;
		File src=scrsht.getScreenshotAs(OutputType.FILE);
		File dest=new File("C://Users//Hp//Downloads/scrshot.png");
		FileUtils.copyFile(src, dest);
		
	}
	
}
