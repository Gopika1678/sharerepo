package dataprovider;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class partialscreen {
	public WebDriver driver;
	@Test
	public void demologin() {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test
	public void partial() throws IOException {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement element=driver.findElement(By.xpath("//h2[contains(text(),'Starting ₹349 | Bestselling headphones')]/parent::div/parent::div"));
		File src=element.getScreenshotAs(OutputType.FILE);
		File dest=new File("C://Users//Hp//Downloads/partial.png");
		FileUtils.copyFile(src, dest);
		
	}
}
