package pommodel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class technical {
	public WebDriver driver;
	public technical(WebDriver driver) {
		this.driver=driver;
	}
	By technical=By.xpath("//body/div/div/div/div/div/section/div/div/div/div/div/div[2]/div[1]/span[1]//*[name()='svg']");
	By vessel=By.xpath("//span[@class=' truncate group-hover/item:w-[140px]']");
	public void tech() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(technical));
		driver.findElement(technical).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(vessel));
		driver.findElement(vessel).click();
		
	}
}
