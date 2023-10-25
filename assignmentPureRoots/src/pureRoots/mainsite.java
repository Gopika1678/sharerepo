package pureRoots;
import purerootsPom.entry;
import purerootsPom.location;
import purerootsPom.startorder;
import purerootsPom.register;
import purerootsPom.selectproduct;
import purerootsPom.checkoutpage;
import java.awt.AWTException;
import java.time.Duration;
import purerootsPom.login;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class mainsite {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		//navigate to the site
	
		driver.get("https://pureroots.thetunagroup.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//creating obj.of entry and calling the method
		entry entrypoint=new entry(driver);
		entrypoint.entrypt();
		
		//selecting location as centerline
		location loc=new location(driver);
		loc.selectlocation();
		loc.closebtn();
		
		startorder start=new startorder(driver);
		start.orderstart();
		start.recreation();
		
		login loginpg=new login(driver);
		loginpg.purelogin();
		loginpg.loginmonth();
		loginpg.pdtselect();
		/*register reg=new register(driver);
		reg.registerbtn();
		reg.recreationbtn();
		reg.nextbtn();
		reg.btnupload();
		reg.details();  */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		selectproduct pdt=new selectproduct(driver);
		pdt.product();
				
		checkoutpage page=new checkoutpage(driver);
		page.checkout(); 
		
		
		}

}