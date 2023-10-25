package failedscreenshot;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class brokenlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/broken");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++) {
			WebElement attr=links.get(i);
			System.out.println(links.size());

			String attribute=attr.getAttribute("href");
			verifyLink(attribute);
		}

	}
	public static void verifyLink(String linkurl)  {
		try {
			URL url=new URL(linkurl);
			HttpURLConnection huc=(HttpURLConnection)url.openConnection();
			huc.connect();
			if(huc.getResponseCode()>=400) {
				System.out.println("broken link" +huc.getResponseMessage());
			}
		}catch(Exception e) {
			
		}
	}

}
