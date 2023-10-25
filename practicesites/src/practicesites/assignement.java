package practicesites;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assignement {
	public WebDriver driver;
	@Test(priority=1)
	public void techhub() {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("http://qatechhub.com");
		String handle=driver.getWindowHandle();
		System.out.println(handle);
		String actualTitle=driver.getTitle();
		String expectedTitle="QA Automation Tools Trainings and Tutorials | QA Tech Hub";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test(priority=2)
	public void facebook() {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String handle=driver.getWindowHandle();
		System.out.println(handle);
		Set<String> handles=driver.getWindowHandles();
		System.out.println(handles);
		Iterator<String> it=handles.iterator();
		while(it.hasNext()) {
			String child_window=it.next();
			if(!handle.equals(child_window)) {
				driver.switchTo().window(child_window);
			}
		}
		driver.switchTo().window(handle);
	}
}
