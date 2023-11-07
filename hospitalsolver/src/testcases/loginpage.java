package testcases;
import hospitalsolver.hospitalloginpg;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginpage {
	@Test(priority=1)
public void login() throws IOException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("http://qdtestserver01.eastus2.cloudapp.azure.com:509/#/login/gamc");
		hospitalloginpg login=new hospitalloginpg(driver);
		login.loginpage();
}
}
