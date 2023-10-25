package democart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class democartbuy {
	public WebDriver driver;
	@Test
	public void account() {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='dropdown-item'][normalize-space()='Register']")));
		driver.findElement(By.xpath("//a[@class='dropdown-item'][normalize-space()='Register']")).click();
	//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-firstname")));
		
		WebElement firstName=driver.findElement(By.id("input-firstname"));
		firstName.sendKeys("Tony");
		
		WebElement lastName=driver.findElement(By.id("input-lastname"));
		lastName.sendKeys("Issac");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scrollTo(350,250)", "");
		
		WebElement email=driver.findElement(By.id("input-email"));
		email.sendKeys("tonyissac@gmail.com");
		
		WebElement pwd=driver.findElement(By.id("input-password"));
		pwd.sendKeys("tonyissac345@");
		
		WebElement check=driver.findElement(By.xpath("//input[@name='agree']"));
		check.click();
		
		WebElement btn=driver.findElement(By.xpath("//button[normalize-space()='Continue']"));
		btn.click();
	}
	
}
