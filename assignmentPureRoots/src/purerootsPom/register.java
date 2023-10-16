package purerootsPom;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class register {
	public WebDriver driver;
	public register(WebDriver driver) {
		this.driver=driver;
	}
	By register=By.id("registerBtnDiv");
	By recreation=By.id("recreationalBtn");
	By next=By.xpath("//a[@onclick='verifyCartItems()']");
	By file=By.id("driving_license_front");
	By backlicense=By.id("driving_license_back");
	By nextbtn=By.xpath("//div[@id='register_tab_2']//a[@class='nextBtn nextTab'][normalize-space()='Next']");
	By number=By.xpath("//input[@name='driving_license']");
	By month=By.xpath("//input[@id='registration_month']");
	By day=By.id("registration_day");
	By year=By.id("registration_year");
	By first_name=By.id("registration_first_name");
	By last_name=By.xpath("//input[@name='last_name']");
	By submit=By.xpath("//a[@class='nextBtn nextTab nextTab_3 userInf']");
	By phone=By.id("register_phone");
	By submitbtn=By.xpath("//button[normalize-space()='Submit']");
	////a[@class='nextBtn nextTab nextTab_3 userInf']
	public void registerbtn() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loaderModal")));
		driver.findElement(register).click();
	}
	public void recreationbtn() {
		driver.findElement(recreation).click();
	}
	public void nextbtn() {
		driver.findElement(next).click();
	}
	public void btnupload() {
		System.out.println("success");
		WebElement files=driver.findElement(file);
		files.sendKeys("C:\\Users\\Hp\\Downloads\\pexels-pixabay-15239.jpg");
		WebElement filesback=driver.findElement(backlicense);
		filesback.sendKeys("C:\\Users\\Hp\\Downloads\\pexels-pixabay-60597.jpg");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scrollTo(350,300)", "");
		driver.findElement(nextbtn).click();		
	}
	public boolean details() {
		driver.findElement(number).sendKeys("34574859960");
		driver.findElement(month).sendKeys("01");
		driver.findElement(day).sendKeys("04");
		driver.findElement(year).sendKeys("1980");
		driver.findElement(first_name).sendKeys("Abraxus");
		driver.findElement(last_name).sendKeys("Hudson");
		driver.findElement(submit).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(submit).click();
		driver.findElement(phone).sendKeys("5648339038");
		driver.findElement(submitbtn).click();
		return true;
	}
	//login not working properly even after giving correct credentials
	
}
