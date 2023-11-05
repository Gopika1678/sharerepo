package hospitalsolver;
import hospitalsolver.hospitalloginpg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class registration {
	public WebDriver driver;
	public registration(WebDriver driver) {
		this.driver=driver;
	}
	By menu=By.xpath("//i[@id='btnappicon']");
	By frontoffice=By.xpath("//span[@id='Front Office']");
	By patient=By.xpath("//span[@id='Patient']");
	By patientnew=By.xpath("//span[@id='Patient Registration']");
	By patientname=By.id("txtFirst_Name");
	By patientdob=By.id("txtDOB");
	By patientage=By.id("txtAge");
	By patientgender= By.id("ddlGender");
	By patientcontact=By.id("ddlContact_No");
	By contactno=By.id("txtContact_No");
	By nationality=By.id("txtNationality");
	By selectnation=By.xpath("//td[normalize-space()='UNITED ARAB EMIRATES']");
	By idcardno=By.id("txtIDCardNo");
	By cardtype=By.id("ddlType");
	By specialty=By.id("txtOPSpeciality");
	By doctor=By.xpath("//td[normalize-space()='DENTIST']");
	By namedoc=By.id("txtConsultant");
	By doctorname=By.xpath("//td[normalize-space()='DR.ABHIRAM']");
	By savebtn=By.id("tbnToolBarSave");
	
	public void register() throws IOException {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='backdrop']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(menu));
		driver.findElement(menu).click();
		driver.findElement(frontoffice).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(patient));
		driver.findElement(patient).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientnew));
		driver.findElement(patientnew).click();
		
}
	public void registerpatient() throws IOException {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientname));
		driver.findElement(patientname).sendKeys("Smitha");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='backdrop']")));
		driver.findElement(patientdob).click();
		driver.findElement(patientage).sendKeys("28");
		WebElement dropdown=driver.findElement(patientgender);	
		dropdown.click();
		Select select=new Select(dropdown);
		select.selectByVisibleText("Female");
		WebElement pcontact=driver.findElement(patientcontact);
		pcontact.click();
		Select action=new Select(pcontact);
		action.selectByValue("+91");
		driver.findElement(contactno).sendKeys("9845674678");	
		driver.findElement(nationality).click();
		driver.findElement(selectnation).click();
		driver.findElement(idcardno).sendKeys("98");
		WebElement cardtypes=driver.findElement(cardtype);
		cardtypes.click();
		Select card=new Select(cardtypes);
		card.selectByVisibleText("Resident Card");
		driver.findElement(specialty).click();
	    driver.findElement(doctor).click();
		driver.findElement(namedoc).click();
	    driver.findElement(doctorname).click();
		WebElement save=driver.findElement(savebtn);
		save.click();	
		TakesScreenshot scrsht=(TakesScreenshot)driver;
		File src=scrsht.getScreenshotAs(OutputType.FILE);
		File dest=new File("C://Users//Hp//Downloads//scrshot.jpg");
		FileUtils.copyFile(src, dest);
		}
	}
	
	
	
