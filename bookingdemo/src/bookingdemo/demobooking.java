package bookingdemo;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class demobooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.booking.com");
	//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(70));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='e4adce92df']//span[@class='fcd9eec8fb d24fc26e73']")));
		////span[@class='e4adce92df']//span[@class='fcd9eec8fb d24fc26e73']		
driver.findElement(By.xpath("//span[@class='eedba9e88a']")).click();
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-et-click=' customGoal:YTBUIHOdBOcaGPaVHXT:2 goal:web_shell_ux_header_profile_login_click goal:web_shell_ux_header_profile_login_click_www ']")));
WebElement ele=driver.findElement(By.xpath("//a[@data-et-click=' customGoal:YTBUIHOdBOcaGPaVHXT:2 goal:web_shell_ux_header_profile_login_click goal:web_shell_ux_header_profile_login_click_www ']"));
if(ele!=null) {
	System.out.println("element is present");
}
ele.click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.id("username")).sendKeys("gopikam00@gmail.com");
//yfCvx60qsR50VNBG15jF
//yfCvx60qsR50VNBG15jF
driver.findElement(By.xpath("//button[contains(.,'Continue with email')]")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.findElement(By.id("password")).sendKeys("Unnikuttan123@");
driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
////span[normalize-space()='Sign in with a verification link']
}

}
