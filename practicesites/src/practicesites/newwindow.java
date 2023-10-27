package practicesites;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class newwindow {
	public WebDriver driver;
	@Test(priority=1)
	public void windowhandles() {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
	}
	@Test(priority=2)
	public void window() {
		driver.findElement(By.id("windowButton")).click();
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		while(it.hasNext()) {
			String child_window=it.next();
			if(!parentwindow.equals(child_window)) {
				driver.switchTo().window(child_window);
			}
		}
		driver.switchTo().window(parentwindow);
	}
}
