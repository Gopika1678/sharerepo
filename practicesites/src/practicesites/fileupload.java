package practicesites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fileupload {
	public WebDriver driver;
	@Test
public void upload() {
	driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/upload/");
}
	@Test
	public void uploadbtn() {
		WebElement fileupload=driver.findElement(By.id("uploadfile_0"));
		fileupload.sendKeys("C:\\Users\\Hp\\Downloads\\AUTOMATION TESTING TEST VIDEO (1).mp4");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
	}
}
