package practicesites;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

public class excelfileapache {
	@Test
public void excelfile() throws IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\Hp\\Downloads\\Booking_Testcase.xls");
	
	HSSFWorkbook wb=new HSSFWorkbook(file);
	HSSFSheet sheet=wb.getSheet("Login");
	HSSFRow row=sheet.getRow(2);
	HSSFCell cell=row.getCell(0);
	String cells=cell.getStringCellValue();
	System.out.println(cells);
	
}
}
