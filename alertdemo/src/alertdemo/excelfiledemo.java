package alertdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.*;
import org.testng.annotations.Test;

public class excelfiledemo {
	@Test
	public void uploadexcel() throws IOException {
		File file=new File("C:\\Users\\Hp\\Downloads\\Booking_Testcase.xls");
		FileInputStream stream=new FileInputStream(file);
		HSSFWorkbook wb=new HSSFWorkbook(stream);
		HSSFSheet sheet=wb.getSheet("login");
		HSSFRow row=sheet.getRow(2);
		HSSFCell cell=row.getCell(0);
		String cell2=cell.getStringCellValue();
		System.out.println(cell2);
	}
}
