package pommodel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class dashboard {
	public static WebDriver driver;
	public dashboard(WebDriver driver) {
		this.driver=driver;
	}
	By explorer=By.xpath("//span[@data-testid='explorer']");
	@Test
	public void dashexplorer() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(explorer));
		driver.findElement(explorer).click();
	}
}
