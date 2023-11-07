package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import hospitalsolver.editconsultant;
public class editconsultant1 {
	public WebDriver driver;
	public editconsultant1(WebDriver driver) {
		this.driver=driver;
	}
	@Test
public void edit() {
	editconsultant edit=new editconsultant(driver);
	edit.consultant();
	
}
}
