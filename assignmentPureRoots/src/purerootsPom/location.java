package purerootsPom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class location {
	public WebDriver driver;
	public location(WebDriver driver) {
		this.driver=driver;
	}
	By selectbox=By.id("set_location_list");
	By btnclick=By.xpath("//button[contains(text(),'Set Location')]");
	By close=By.xpath("//body/div[@id='disountModal']/div[1]/div[1]/div[1]/button[1]/img[1]");
	public void selectlocation() {
	WebElement locn=driver.findElement(selectbox);
	locn.click();
	Select select=new Select(locn);
	select.selectByIndex(2);
	driver.findElement(btnclick).click();
	}
	public void closebtn() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(close));
		driver.findElement(close).click();
	}
}
