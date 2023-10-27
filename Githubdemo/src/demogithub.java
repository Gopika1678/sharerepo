//import java.awt.Point;
import java.time.Duration;
import org.openqa.selenium.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class demogithub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
driver.manage().window().maximize();
driver.get("https://www.github.com");
driver.findElement(By.xpath("//a[@class='HeaderMenu-link HeaderMenu-link--sign-in flex-shrink-0 no-underline d-block d-lg-inline-block border border-lg-0 rounded rounded-lg-0 p-2 p-lg-0']")).click();

//wait 20s for the login page to load

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.findElement(By.id("login_field")).sendKeys("gopikam00@gmail.com");
driver.findElement(By.id("password")).sendKeys("Unnikuttan123@");
//input[@data-signin-label='Sign in']
driver.findElement(By.xpath("//input[@data-signin-label='Sign in']")).click();

driver.findElement(By.xpath("//button[@id='global-create-menu-button']//span[@class='Button-content']")).click();
////div[@data-target='loading-context.details']//span[@class='Button-label'][normalize-space()='New']
//click on the new repository
driver.findElement(By.xpath("//div[@data-target='loading-context.details']//span[@class='Button-label'][normalize-space()='New']")).click();

//create repository page
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Repository']")));

driver.findElement(By.xpath("//input[@aria-label='Repository']")).sendKeys("Repository87");
driver.findElement(By.xpath("//input[@data-testid='description']")).sendKeys("This is a new repository");

//next is radio button,since public is selected on default,private is selected by me

driver.findElement(By.xpath("//input[@value='private']")).click();
//driver.findElement(By.xpath("//input[@id='react-aria5709443595-:r8:']")).click();

//selecting checkbox
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Box-sc-g0xbh4-0 hnmzXm']//div[@class='Box-sc-g0xbh4-0 jTavlD']//input[@id='react-aria5709443595-:r8:']")));
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='Box-sc-g0xbh4-0 hnmzXm']//div[@class='Box-sc-g0xbh4-0 jTavlD']")));

//driver.findElement(By.cssSelector("label[for='react-aria5709443595-:r8']")).click();

//WebElement chkbox=driver.findElement(By.xpath("//div[@class='Box-sc-g0xbh4-0 hnmzXm']//div[@class='Box-sc-g0xbh4-0 jTavlD']"));
WebElement chkbox=driver.findElement(By.xpath("//div[@class='Box-sc-g0xbh4-0 jTavlD']//input[@type='checkbox']"));
boolean isSelected=chkbox.isSelected();

boolean isDisplayed=chkbox.isDisplayed();

if(isDisplayed==true) {
	System.out.println("element is visible");
	chkbox.click();
}
//if checkbox is not selected,click on it
if(chkbox!=null) {
	System.out.println("element present");
	chkbox.click();
}
if(isSelected==false) {
	chkbox.click();
	System.out.println("element will be checked");
}

//click on create repository
//div[@class='Box-sc-g0xbh4-0 aBKvw']//button[@type='su
WebDriverWait waiting=new WebDriverWait(driver,Duration.ofSeconds(30));
waiting.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Create repository')]")));
WebElement btnClick=driver.findElement(By.xpath("//span[contains(text(),'Create repository')]"));
if(btnClick!=null) {
	System.out.println("button is present");
}
//driver.findElement(By.xpath("//div[@class='Box-sc-g0xbh4-0 aBKvw']//button[@class='types__StyledButton-sc-ws60qy-0 dWuCGR']")).click();
btnClick.click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

}
	////button[@class='types__StyledButton-sc-ws60qy-0 dWuCGR']
}
//name attribute is not available for this element
//span[contains(text(),'Create repository')]
	


