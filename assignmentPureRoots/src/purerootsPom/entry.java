package purerootsPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class entry {
	public WebDriver driver;
	public entry(WebDriver driver) {
		this.driver=driver;
	}
	//clicking the button start(21+, medical and recreational  users)
	By medical=By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]");
	public void entrypt() {
		driver.findElement(medical).click();
	}
	
}
////body//section[contains(@class,'entry_BG')]//div[contains(@class,'row mr-0')]//div[contains(@class,'row mr-0')]//div[1]//div[1]//button[1]
////body/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]