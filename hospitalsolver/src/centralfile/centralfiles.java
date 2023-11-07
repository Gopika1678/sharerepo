package centralfile;
import hospitalsolver.hospitalloginpg;
import hospitalsolver.editconsultant;
import hospitalsolver.registration;

import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class centralfiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("http://qdtestserver01.eastus2.cloudapp.azure.com:509/#/login/gamc");
		hospitalloginpg login=new hospitalloginpg(driver);
		login.loginpage();
	//	login.invalid();
		registration reg=new registration(driver);
		reg.register();
		reg.registerpatient();
		editconsultant consult=new editconsultant(driver);
		consult.consultant();
		
	}
	

}
