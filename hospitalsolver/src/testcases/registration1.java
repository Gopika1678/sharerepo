package testcases;

import java.io.IOException;
import hospitalsolver.hospitalloginpg;
import hospitalsolver.registration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class registration1 {
	public WebDriver driver;
	public registration1(WebDriver driver) {
		this.driver=driver;
	}
	@Test
public void register() throws IOException {
		
	loginpage login=new loginpage();
	login.login();
	registration reg=new registration(driver);
	reg.register();
	reg.registerpatient();
}
}
