package centralfile;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import hospitalsolver.hospitalloginpg;
import hospitalsolver.frontoffice;
public class centralfiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
				System.out.println("enter the url");
				Scanner sc=new Scanner(System.in);
				String url=sc.nextLine();		
				WebDriver driver=new ChromeDriver();
				System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
				driver.manage().window().maximize();
				driver.get(url);
				hospitalloginpg login=new hospitalloginpg(driver);
				login.loginpage();
				frontoffice front=new frontoffice(driver);
				front.front();

		
		
	}

}
