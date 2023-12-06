package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class demoexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\Hp\\Downloads\\Booking_Testcase.xls");
		FileInputStream reader=new FileInputStream(file);
		HSSFWorkbook hs=new HSSFWorkbook(reader);
		HSSFSheet ws=hs.getSheet("Login");
		HSSFRow row2=ws.getRow(2);
		HSSFCell cell2=row2.getCell(0);
		String col=cell2.getStringCellValue();
		System.out.println(col);
	}

}
