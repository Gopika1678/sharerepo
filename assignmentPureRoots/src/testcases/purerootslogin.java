package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import purerootsPom.entry;
import purerootsPom.login;
import purerootsPom.location;
import purerootsPom.startorder;
import purerootsPom.selectproduct;
import purerootsPom.checkoutpage;
public class purerootslogin {
	WebDriver driver;
	@Test
public void test() {
	driver=new ChromeDriver();
	
	//4a(correctly identifying age)
	entry entrypt=new entry(driver);
	driver.manage().window().maximize();
	driver.get("https://pureroots.thetunagroup.com");
	entrypt.entrypt();
	Assert.assertTrue(true);
	
	//location check
	location locn=new location(driver);
	locn.selectlocation();
	locn.closebtn();
	Assert.assertTrue(true);
	
	//4b(start your order,confirm recreational products are available)
	startorder start=new startorder(driver);
	start.orderstart();
	if(start.recreation()) {
		Assert.assertTrue(true);
	}
	
	//verify that reg process is successfull
	
	login logindata=new login(driver);
	logindata.purelogin();
	logindata.loginmonth();
	//logindata.pdtselect();
	
	// 4c verify that product can be searched and added to cart
	selectproduct selectpdt=new selectproduct(driver);
	selectpdt.product();
	
	//4d there is no curbside in the checkout webpage,bug no:1
	checkoutpage check=new checkoutpage(driver);
	//testcase will fail here as there is no curbside in the page
	if(check.checkout()) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
	//4e no car model and car color in the webpage, bug no 2
	if(check.checkout()) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
	
}
	
}
