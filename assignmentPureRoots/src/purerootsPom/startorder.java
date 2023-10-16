package purerootsPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class startorder {
	public WebDriver driver;
	public startorder(WebDriver driver) {
		this.driver=driver;
	}
	By order=By.xpath("//a[@class='nav-link'][contains(text(),'Start your')]");
	By recreation=By.xpath("//label[normalize-space()='Recreational']");
	public void orderstart() {
		driver.findElement(order).click();
	}
	public boolean recreation() {
		driver.findElement(recreation).click();
		return true;
	}
	
}
