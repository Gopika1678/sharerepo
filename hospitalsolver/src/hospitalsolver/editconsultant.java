package hospitalsolver;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class editconsultant {
	public WebDriver driver;
	public editconsultant(WebDriver driver) {
		this.driver=driver;
	}
	By specialty=By.id("txtOPSpeciality");
	By consultant=By.id("txtConsultant");
	By specialtydoc=By.xpath("//td[normalize-space()='DENTIST']");
	By consultingdoc=By.xpath("//td[normalize-space()='29']");
	By savebtn=By.id("tbnToolBarSave");
	
	By modal=By.xpath("//div[@class='modal-body card-material']");
	By footermodal=By.xpath("//div[@class='modal-footer card-material']");
	By modaldoc=By.xpath("//div[@class='modal-dialog']");
	By okmodal=By.xpath("//div[@class='p-t-b']//button[@class='btn mdl-btn gr-btn ok-ico']");
	By bill=By.xpath("//label[@class='billColr']");
	By refdetails=By.xpath("//input[@formcontrolname='Ref_Details']");
	By printbtn=By.xpath("//button[@class='btn mdl-btn print-ico']");
	By otherbtn=By.xpath("//div[@class='sec-main wd-98 p-5']");
	public void consultant() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(specialty));
		WebElement special=driver.findElement(specialty);
		special.clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		special.click();
	//	WebElement consulting=driver.findElement(consultant);
	//	consulting.clear();
		wait.until(ExpectedConditions.visibilityOfElementLocated(specialtydoc));
		driver.findElement(specialtydoc).click();
		WebElement consulting=driver.findElement(consultant);
		consulting.click();

	//	special.clear();

		wait.until(ExpectedConditions.visibilityOfElementLocated(consultingdoc));
		driver.findElement(consultingdoc).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("backdrop")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(savebtn));
		driver.findElement(savebtn).click();
		driver.findElement(modal);
		driver.findElement(modaldoc);
		driver.findElement(footermodal);
		//WebElement modalok=wait.until(ExpectedConditions.elementToBeClickable(okmodal))	;	
		WebElement modalok=driver.findElement(okmodal);
		WebElement overlay=driver.findElement(refdetails);
		Point p=modalok.getLocation();
		Point d=overlay.getLocation();
		int q=p.getX();
		int s=p.getY();
		System.out.println(d.getX());
		System.out.println(d.getY());
		System.out.println(q);
		System.out.println(s);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scrollTo(1146,409)", "");
		modalok.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(printbtn));
		js.executeScript("scrollTo(1020,604)", "");
		WebElement print=driver.findElement(printbtn);
		print.click();
		WebElement other=driver.findElement(otherbtn);
		Point a=print.getLocation();
		System.out.println(a.getX());
		System.out.println(a.getY());
		Point b=other.getLocation();
		System.out.println(b.getX());
		System.out.println(b.getY());
		
		
		
	
	
	
		

		
			}

}
