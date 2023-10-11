package alertdemo;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class demoalert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']")).click();
	//	driver.findElement(By.id("demo1")).sendKeys("Gopika");
		driver.switchTo().alert().accept();
	
	}

}

