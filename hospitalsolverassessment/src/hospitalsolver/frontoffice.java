package hospitalsolver;
import hospitalsolver.editconsultant;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class frontoffice {
	public WebDriver driver;

	public frontoffice(WebDriver driver) {
		this.driver=driver;
	}
	//By patientid=By.id("txtPat_ID");
	By patientname=By.id("txtFirst_Name");
	By patientdob=By.id("txtDOB");
	By patientage=By.id("txtAge");
	By patientgender= By.id("ddlGender");
	By patientcontact=By.id("ddlContact_No");
	By contactno=By.id("txtContact_No");
	//By nationality=By.id("txtNationality");
	//By selectnation=By.xpath("//td[normalize-space()='UNITED A']");
	By idcardno=By.id("txtIDCardNo");
	By cardtype=By.id("ddlType");
//	By specialty=By.id("txtOPSpeciality");
	//By doctor=By.xpath("//td[normalize-space()='DENTIST']");
	//By namedoc=By.id("txtConsultant");
	//By doctorname=By.xpath("//td[normalize-space()='DR.ABHIRAM']");
	By savebtn=By.id("tbnToolBarSave");
	
	
	public void front() {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("backdrop")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnFront Office")));
		WebElement frntofce=driver.findElement(By.id("btnFront Office"));
		frntofce.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='PatientRegistration btnSet']")));
		WebElement btnset=driver.findElement(By.xpath("//div[@class='PatientRegistration btnSet']"));
		btnset.click();
		
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(120));
		//pasting id retrieved from database
		//wait.until(ExpectedConditions.visibilityOfElementLocated(patientid));
	//	driver.findElement(patientid).sendKeys("13030096");
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientname));
		driver.findElement(patientname).sendKeys("Praveena");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='backdrop']")));
		driver.findElement(patientdob).click();
		driver.findElement(patientage).sendKeys("32");
		WebElement dropdown=driver.findElement(patientgender);	
		dropdown.click();
		Select select=new Select(dropdown);
		select.selectByVisibleText("Female");
		WebElement pcontact=driver.findElement(patientcontact);
		pcontact.click();
		Select action=new Select(pcontact);
		action.selectByValue("+91");
		driver.findElement(contactno).sendKeys("8734256789");
		//driver.findElement(nationality).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='backdrop']")));

		//driver.findElement(selectnation).click();
		driver.findElement(idcardno).sendKeys("8979");
		WebElement cardtypes=driver.findElement(cardtype);
		cardtypes.click();
		Select card=new Select(cardtypes);
		card.selectByVisibleText("Resident Card");
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='backdrop']")));
		editconsultant edit=new editconsultant(driver);
		edit.mastertable();
		//driver.findElement(specialty).click();
	 //   driver.findElement(doctor).click();
	//	driver.findElement(namedoc).click();
	   // driver.findElement(doctorname).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='backdrop']")));

		WebElement save=driver.findElement(savebtn);
		save.click();	
		
	}
}
