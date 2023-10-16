package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import purerootsPom.entry;
import purerootsPom.location;
import purerootsPom.register;
import purerootsPom.selectproduct;
import purerootsPom.startorder;
import purerootsPom.checkoutpage;
public class checkout {
	public WebDriver driver;
	public void checkout() {
		driver=new ChromeDriver();
		driver.get("https://pureroots.thetunagroup.com/order");		
		 entry entrypg=new entry(driver);
		 entrypg.entrypt();
		 
		 location locn=new location(driver);
			locn.selectlocation();
			locn.closebtn();
			
			startorder order=new startorder(driver);
			order.orderstart();
			order.recreation();
			
			register reg=new register(driver);
			reg.registerbtn();
			reg.recreationbtn();
			reg.nextbtn();
			reg.details();
			reg.btnupload();
			
			selectproduct select=new selectproduct(driver);
			if(select.product()) {
				Assert.assertTrue(true);		
				}
			
			checkoutpage check=new checkoutpage(driver);
			
			//test will fail as there is no curbside in the webpage
			check.checkout();
	}
	
}
