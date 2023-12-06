package dataprovider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class saucedemo {
	public WebDriver driver;
	@DataProvider(name="data-set")
	public static Object[][] login() {
		Object[][] obj= {{"valid","standard_user","secret_sauce"},{"invalid","jfekj","hfjdwkjw"}};
		return obj;
	}
	@Test(dataProvider="data-set")
	public void sampletest(String type,String username,String password) {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        
        List<WebElement> list=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        Map<WebElement,Double> map=new HashMap<WebElement,Double>();
        
		for(int i=0;i<list.size();i++) {
			map.put(list.get(i), Double.parseDouble(list.get(i).getText().replaceAll("[^0-9.]","")));
			//String pdt=list.get(i).getText();
			//System.out.println(pdt);
		}
		List<Entry<WebElement,Double>> le=new ArrayList<Entry<WebElement,Double>>(map.entrySet());
		le.sort(Entry.comparingByValue());
		for(Entry e:le) {
			System.out.println(e.getValue());
		}
	}
	}
