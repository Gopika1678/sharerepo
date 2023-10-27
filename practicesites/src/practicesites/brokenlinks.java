package practicesites;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class brokenlinks {
	public WebDriver driver;
	@Test
	public void links() throws IOException {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/links");
		List<WebElement> lists=driver.findElements(By.tagName("a"));
		for(int i=0;i<lists.size();i++) {
			System.out.println(lists.get(i).getText());
			String url=lists.get(i).getAttribute("href");
			verifyLink(url);
		}
		
		//verifyLinks(url);
	}
	public static void verifyLink(String linkurl) {
		// TODO Auto-generated method stub
		URL url;
		try {
			url = new URL(linkurl);
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
			conn.connect();
			if(conn.getResponseCode()==200) {
				System.out.println("links ok");
			}
			else {
				System.out.println("links broken");

			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}
	
}
