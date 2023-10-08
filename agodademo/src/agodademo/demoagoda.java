package agodademo;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class demoagoda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.agoda.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.className("ab-close-button")).click();
		driver.findElement(By.xpath("//span[@class='Box-sc-kv6pi1-0 bTkTcE']")).click();
		
	//	driver.findElement(By.id("email")).sendKeys("gopikam00@gmail.com");
	//	driver.findElement(By.id("password")).sendKeys("Unnikuttan123@");
		//driver.findElement(By.xpath("button[type='submit'] span[class='sc-fznZeY dAxUxB']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys("gopikam00@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Unnikuttan123@");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.className("ab-close-button")).click();
		driver.findElement(By.id("textInput")).clear();
		driver.findElement(By.id("textInput")).sendKeys("Bangalore");
		driver.findElement(By.xpath("(//li[@class='Suggestion__categoryName_container Suggestion__showHotelImageWrapper'])[1]")).click();
		//driver.findElement(By.xpath("//div[@id='check-in-box']//div[@class='IconBox__child']")).click();
		
		//driver.findElement(By.xpath("//button[type='submit'] //span[class='sc-fznZeY dAxUxB']")).click();
		driver.findElement(By.xpath("(//span[@class='PriceSurgePicker-Day__label PriceSurgePicker-Day__label--wide'][normalize-space()='4'])[1]")).click();
		driver.findElement(By.xpath("//div[normalize-space()='October 2023']"));
		driver.findElement(By.xpath("(//span[@class='PriceSurgePicker-Day__label PriceSurgePicker-Day__label--wide'][normalize-space()='3'])[2]")).click();
		//driver.findElement(By.xpath("(//span[@class='PriceSurgePicker-Day__label PriceSurgePicker-Day__label--wide'][normalize-space()='3'])[2]")).click();
		driver.findElement(By.xpath("//div[@data-selenium='plus'] [@data-element-value='2']")).click();
		driver.findElement(By.xpath("//span[@class='Spanstyled__SpanStyled-sc-16tp9kb-0 bXsPY kite-js-Span ']")).click();
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//driver.findElement(By.xpath("//h3[normalize-space()='Melange Astris']")).click();
//driver.switchTo().newWindow(WindowType.TAB);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

////button[@class='Buttonstyled__ButtonStyled-sc-5gjk6l-0 iCZpGI Box-sc-kv6pi1-0 fDMIuA']//div[@class='Box-sc-kv6pi1-0 hRUYUu']
		//class="Spanstyled__SpanStyled-sc-16tp9kb-0 bXsPY kite-js-Span "
		
	}
		

}

