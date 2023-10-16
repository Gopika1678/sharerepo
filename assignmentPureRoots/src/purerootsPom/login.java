package purerootsPom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {
public WebDriver driver;
public login(WebDriver driver) {
	this.driver=driver;
}
By loginbtn=By.xpath("//a[@class='loginBtn']");
By modal=By.xpath("//div[@id='loginModal']//div[@class='modal-body text-center']");
By loginMonth=By.id("login_month");
By loginday=By.id("login_day");
By loginyr=By.id("login_year");
By loginphone=By.id("login_phone");
By loginBtn=By.xpath("//button[normalize-space()='Login']");
	public void purelogin() {
		driver.findElement(loginbtn).click();
	}
	public void loginmonth() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(loginMonth));
		driver.findElement(loginMonth).sendKeys("01");
		driver.findElement(loginday).sendKeys("04");
		driver.findElement(loginyr).sendKeys("1980");
		driver.findElement(loginphone).sendKeys("5648339038");
		driver.findElement(loginBtn).click();
	}
}
