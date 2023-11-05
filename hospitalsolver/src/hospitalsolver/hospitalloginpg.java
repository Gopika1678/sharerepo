package hospitalsolver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class hospitalloginpg {
	public WebDriver driver;
	
	public hospitalloginpg(WebDriver driver) {
		this.driver=driver;
	}
	/*@Test
public void landingpage() {
	driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
	driver.manage().window().maximize();
	driver.get("http://qdtestserver01.eastus2.cloudapp.azure.com:509/#/login/gamc");
}*/

	public void loginpage() throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Hp\\Downloads\\Booking_Testcase.xls");	
		HSSFWorkbook wb=new HSSFWorkbook(file);
		HSSFSheet sheet=wb.getSheet("Login");	
		HSSFRow row=sheet.getRow(2);
		HSSFCell cell=row.getCell(0);
		String cells=cell.getStringCellValue();
		WebElement userid=driver.findElement(By.id("txtUsrId"));
		userid.sendKeys(cells);
		HSSFRow row1=sheet.getRow(2);
		HSSFCell cell1=row.getCell(1);
		int cell3=(int)cell1.getNumericCellValue();
		String cell2=String.valueOf(cell3);
		System.out.println(row1);
		WebElement pwd=driver.findElement(By.id("txtUsrpwd"));
		pwd.sendKeys(cell2);
		driver.findElement(By.id("txtLogin")).click();

		
		
		
		}
}
