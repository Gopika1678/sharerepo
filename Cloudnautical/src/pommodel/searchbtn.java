package pommodel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class searchbtn {
	public WebDriver driver;
	public searchbtn(WebDriver driver) {
	this.driver=driver;
}
	By search=By.xpath("//span[@data-testid='search']");
	By vesselname=By.xpath("//a[contains(text(),'ALPHA ')]");
	public void searchvessel() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(search));
		driver.findElement(search).click();
	}
	public void selectvessel() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(vesselname));
		driver.findElement(vesselname).click();
	}

}
