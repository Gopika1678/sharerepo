package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import purerootsPom.register;
import purerootsPom.startorder;
import purerootsPom.entry;
import purerootsPom.location;
public class registration {
	public WebDriver driver;
	@Test
public void register() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://pureroots.thetunagroup.com/register");

	entry entrypt=new entry(driver);
	entrypt.entrypt();
	
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
	
}
}
