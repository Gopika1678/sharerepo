package practicesites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class popups {
	public WebDriver driver;
	@Test(priority=1)
	public void frames() {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
	}
	@Test(priority=2)
	public void frameswitch() {
		WebElement frame=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame);
		WebElement heading=driver.findElement(By.id("sampleHeading"));
		String header=heading.getText();
		
		System.out.println(header);
		
	}
}
