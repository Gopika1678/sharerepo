package dataprovider;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class lowestprice {
	public WebDriver driver;
	@Test
	public void pricelow() {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		String iphone14="iphone14";
		search.sendKeys(iphone14);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='iphone 14']")));
		WebElement phone=driver.findElement(By.xpath("//div[@aria-label='iphone 14']"));
		phone.click();
		
	}
	@Test
	public void select() {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=iphone+14&crid=1ZF11ZTT9T5B7&sprefix=iphone+14%2Caps%2C289&ref=nb_sb_ss_ts-doa-p_1_9");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> list=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for(int i=0;i<list.size();i++) {
			String text=list.get(i).getText();
			System.out.println(text);
		}
	}
	
}
