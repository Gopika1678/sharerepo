package dataprovider;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class findlowest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		String text="iphone";
		search.sendKeys(text);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='iphone 14']")));
		driver.findElement(By.xpath("//div[@aria-label='iphone 14']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scrollTo(700,1000)","");
		
		List<WebElement> list=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		Map<WebElement,Integer> map=new HashMap<WebElement,Integer>();
		for(int i=1;i<list.size();i++) {
			
			if(list.get(i).getText()!=null) {
			map.put(list.get(i), Integer.parseInt(list.get(i).getText().replaceAll(",", "")));

			//System.out.println(list.size());
		//	System.out.println(Integer.parseInt(list.get(i).getText().replaceAll(",", "")));
		}
		}
		List<Entry<WebElement,Integer>> le=new ArrayList<Map.Entry<WebElement,Integer>>(map.entrySet());
		le.sort(Entry.comparingByValue());
		 for(Entry e:le) {
			 System.out.println(e.getValue());
		 }
		le.get(0).getKey().click();
	}

}
