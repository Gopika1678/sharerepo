package practicesites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class framesdemo {
	public WebDriver driver;
	@Test
	public void frames() {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		}
	@Test
	public void switchframe() {
		WebElement frame1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		WebElement heading=driver.findElement(By.id("sampleHeading"));
		System.out.println(heading.getText());
		
	}
}
