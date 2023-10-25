package amazonselectdemo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class selecthighest {
	public WebDriver driver;
	@Test(priority=1)
	public boolean landpage() {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		searchpdt();
		return true;
	}
	@Test(priority=2)
	public void searchpdt() {
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='iphone']")));
		driver.findElement(By.xpath("//div[@aria-label='iphone']")).click();
		selectpdt();
	}
	@Test(priority=3)
	public void selectpdt() {
		List<WebElement> lists=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		Map<WebElement,Integer> map=new HashMap<WebElement,Integer>();
		for(int i=0;i<lists.size();i++) {
			map.put(lists.get(i), Integer.parseInt(lists.get(i).getText().replaceAll(",", "")));
		}
		List<Entry<WebElement,Integer>> le=new ArrayList<Entry<WebElement,Integer>>(map.entrySet());
		le.sort(Entry.comparingByValue());
		for(Entry e:le) {
			System.out.println(e.getValue());
		}
		le.get(17).getKey().click();
	}
		
	}
	
