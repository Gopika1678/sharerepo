package purerootsPom;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class selectproduct {
	public WebDriver driver;
	public selectproduct(WebDriver driver) {
		this.driver=driver;
	}
	By modal=By.xpath("//div[@id='loginModal']//div[@class='modal-body text-center']");
	By search=By.id("search_product");
	By searcbtn=By.xpath("//i[@class='fas fa-search']");
	By variant=By.id("variant_name_4014");
	By cartopen=By.xpath("//a[@class='cartBtn_div openbtn']");
	By checkout=By.xpath("//a[normalize-space()='Proceed to Checkout']");
;
	public boolean product() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(modal));
	//	wait.until(ExpectedConditions.elementToBeClickable(search));
		driver.findElement(search).sendKeys("Vape Cart");
		driver.findElement(searcbtn).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(variant));
		driver.findElement(variant).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(cartopen));
		driver.findElement(cartopen).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(checkout));
		driver.findElement(checkout).click();
		//	driver.get("https://pureroots.thetunagroup.com");
		//div[@id='search_products']//div[1]//div[2]//ul[1]//li[1]//a[1]//div[1]//span[1]//i[1]
		return true;
	}
}
