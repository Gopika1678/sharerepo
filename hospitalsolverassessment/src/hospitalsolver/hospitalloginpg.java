package hospitalsolver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hospitalloginpg {
	public WebDriver driver;
	
	public hospitalloginpg(WebDriver driver) {
		this.driver=driver;
	}
	public void loginpage() throws IOException {
		//FileInputStream file=new FileInputStream("C:\\Users\\Hp\\Downloads\\Booking_Testcase.xls");	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUsrId")));
		WebElement userid=driver.findElement(By.id("txtUsrId"));
		userid.sendKeys("rpa");
		WebElement passwd=driver.findElement(By.id("txtUsrpwd"));
		passwd.sendKeys("rpatest");
		driver.findElement(By.id("txtLogin")).click();
	}
}
