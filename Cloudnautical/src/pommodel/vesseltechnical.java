package pommodel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class vesseltechnical {
	public WebDriver driver;
	public vesseltechnical(WebDriver driver) {
		this.driver=driver;
	}
	By technical=By.xpath("//p[contains(@class,'w-max')][normalize-space()='Technical']");
	public void vessel() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(technical));
		driver.findElement(technical).click();
	}
	
}
