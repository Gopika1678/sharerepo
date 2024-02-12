package pommodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class login {
	public static WebDriver driver;
	public login(WebDriver driver) {
		this.driver=driver;
	}
	By username=By.id("username");
	By password=By.id("password");
	By loginbtn=By.xpath("//button[@type='submit']");
	public void loginpg() throws IOException {
		System.out.println("success");
		driver.findElement(username).sendKeys("08022024");
		//user.sendKeys("08022024");	
		File file=new File("C:\\Users\\Hp\\Downloads\\Booking_Testcase.xls");
		FileInputStream inputstream=new FileInputStream(file);
		HSSFWorkbook wb=new HSSFWorkbook(inputstream);
		HSSFSheet sheet=wb.getSheet("Login");
		HSSFRow row1=sheet.getRow(1);
		HSSFCell cell1=row1.getCell(0);
		//String cell2=cell1.getStringCellValue();
		System.out.println(cell2);
		driver.findElement(password).sendKeys(cell2);
		driver.findElement(loginbtn).click();
		
		
		
	}
}
