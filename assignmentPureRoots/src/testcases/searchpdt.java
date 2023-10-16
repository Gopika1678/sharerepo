package testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import purerootsPom.selectproduct;
import purerootsPom.startorder;
import purerootsPom.entry;
import purerootsPom.location;
import purerootsPom.register;
public class searchpdt {
	WebDriver driver;
	@Test
	public void search() {
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
				Assert.assertTrue(true);		}
	}

	
}
