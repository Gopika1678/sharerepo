package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class excelfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			File file=new File("C:\\Users\\Hp\\Downloads\\Booking_Testcase.xls");
			FileInputStream stream=new FileInputStream(file);
	        HSSFWorkbook wb=new HSSFWorkbook(stream);	        
	        //Creating a Sheet object using the sheet Name
	        HSSFSheet sheet=wb.getSheet("Login");	        
	        //Create a row object to retrieve row at index 1
	        HSSFRow row2=sheet.getRow(2);
	        String row=row2.toString();
	        System.out.println(row);
	        //Create a cell object to retreive cell at index 5
	        HSSFCell cell=row2.getCell(0);//	XSSFSheet sheet=hb.getSheet("Login");
	        String cell1= cell.getStringCellValue();
	        System.out.println(cell1);
	        
	        HSSFRow row3=sheet.getRow(2);
	        HSSFCell cell2=row3.getCell(1);
	        String cell3= cell2.getStringCellValue();

	        System.out.println(cell3);
	        
	        WebDriver driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com");
			driver.findElement(By.id("user-name")).sendKeys(cell1);
			driver.findElement(By.id("password")).sendKeys(cell3);
	}

}
