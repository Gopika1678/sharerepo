package alertdemo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class brokenlinks {
HttpURLConnection huc;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/links");
		List<WebElement> link=driver.findElements(By.tagName("a"));
		
		for(WebElement links:link) {
			String url=links.getAttribute("href");
			verifyLink(url);
			}
		
	
	}
	private static void verifyLink(String url) throws IOException {
		// TODO Auto-generated method stub
		URL urls=new URL(url);
		HttpURLConnection huc=(HttpURLConnection)urls.openConnection();
		huc.connect();
		
		//		HttpURLConnection http=(HttpURLConnection)link.openConnection();

	}
}
