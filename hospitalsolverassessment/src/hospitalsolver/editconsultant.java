package hospitalsolver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class editconsultant {
	public WebDriver driver;
	public editconsultant(WebDriver driver) {
		this.driver=driver;
	}
	By masters=By.xpath("//span[@id='Masters']");
	By pricesetting=By.xpath("//div[@class='ng-tns-c633-3 PriceSettings']");
	By consultant=By.xpath("//div[@class='ng-tns-c633-5 consultantwisepricesetting']");
	By txtconsult=By.xpath("txtConsultant");
	By name=By.xpath("//td[normalize-space()='D002']");
	By consultservice=By.id("txtConsultationService");
	
	By modal=By.xpath("//div[@class='modal-body card-material']");
	By footermodal=By.xpath("//div[@class='modal-footer card-material']");
	By modaldoc=By.xpath("//div[@class='modal-dialog']");
	By okmodal=By.xpath("//div[@class='p-t-b']//button[@class='btn mdl-btn gr-btn ok-ico']");
	By bill=By.xpath("//label[@class='billColr']");
	By refdetails=By.xpath("//input[@formcontrolname='Ref_Details']");
	By printbtn=By.xpath("//button[@class='btn mdl-btn print-ico']");
	By donebtn=By.xpath("//button[@class='done']");
	By okbtn=By.xpath("//button[@class='btn bt-Grp gr-btn ok-ico']");
	By printid=By.id("btnPrint");
	
	public void mastertable() {
		WebElement master=driver.findElement(masters);
		master.click();
		WebElement price=driver.findElement(pricesetting);
		price.click();
		WebElement consultants=driver.findElement(consultant);
		consultants.click();
		WebElement textconsult=driver.findElement(txtconsult);
		textconsult.click();
		WebElement names=driver.findElement(name);
		names.click();
		WebElement service=driver.findElement(consultservice);
		service.click();
		Select select=new Select(service);
		select.selectByVisibleText("Plastic Surgeon");
	}
	public void select() {
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
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(printbtn));
		js.executeScript("scrollTo(1020,604)", "");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='backdrop']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(printbtn));
		WebElement print=driver.findElement(printbtn);
		print.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(donebtn));
		WebElement done=driver.findElement(donebtn);	
		done.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(okbtn));
		WebElement ok=driver.findElement(okbtn);
		ok.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(printid));
		driver.findElement(printid).click();
		//since print popup cannot be handled in selenium,rest of the things were done manually
		//delete also was done manually since testing coudn't proceed further automatically
	
	
	
		
	}
}
