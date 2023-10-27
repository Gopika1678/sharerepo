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
By modalid=By.id("loaderModal");
By loginMonth=By.id("login_month");
By loginday=By.id("login_day");
By loginyr=By.id("login_year");
By loginphone=By.id("login_phone");
By loginBtn=By.xpath("//button[normalize-space()='Login']");

//By modal=By.xpath("//div[@id='loginModal']//div[@class='modal-body text-center']");
By search=By.id("search_product");
By searcbtn=By.xpath("//i[@class='fas fa-search']");
//By variant=By.xpath("//div[@id='search_products']//div[1]//div[2]//ul[1]//li[1]//a[1]//div[1]//span[1]//i[1]");
By cartopen=By.xpath("//a[@class='cartBtn_div openbtn']");
By checkout=By.xpath("//a[normalize-space()='Proceed to Checkout']");

	public void purelogin() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(modalid));

		driver.findElement(loginbtn).click();
		loginmonth();
	}
	public void loginmonth() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(loginMonth));
		driver.findElement(loginMonth).sendKeys("01");
		driver.findElement(loginday).sendKeys("04");
		driver.findElement(loginyr).sendKeys("1980");
		driver.findElement(loginphone).sendKeys("5648339038");
		driver.findElement(loginBtn).click();
		pdtselect();
	}
	public void pdtselect() {
		System.out.println("welcome");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(120));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(modal));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(modalid));
		System.out.println("welcomehello");

		wait.until(ExpectedConditions.visibilityOfElementLocated(search));
		System.out.println("hello");

		driver.findElement(search).sendKeys("Flower");
		driver.findElement(searcbtn).click();
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(variant));
		//driver.findElement(variant).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(modalid));
		wait.until(ExpectedConditions.visibilityOfElementLocated(cartopen));
		driver.findElement(cartopen).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(checkout));
		driver.findElement(checkout).click();
		//	driver.get("https://pureroots.thetunagroup.com");
		//div[@id='search_products']//div[1]//div[2]//ul[1]//li[1]//a[1]//div[1]//span[1]//i[1]

			}
}
