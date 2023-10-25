package democart;

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
import org.testng.annotations.Test;

public class amazon {
	public WebDriver driver;
	@Test
public void highest() {
	driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("iphone");
	driver.findElement(By.xpath("//div[@aria-label='iphone']")).click();
	
	List<WebElement> list=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	Map<WebElement,Integer> map=new HashMap<WebElement,Integer>();
	
	for(int i=0;i<list.size();i++) {
		if(list.get(i).getText()!=null) {
		map.put(list.get(i),Integer.parseInt(list.get(i).getText())); 
		}
		//System.out.println(Integer.parseInt(list.get(i).getText()));
	}
	List<Entry<WebElement,Integer>> le=new ArrayList<Entry<WebElement,Integer>>();
	le.sort(Entry.comparingByValue());
}
}
