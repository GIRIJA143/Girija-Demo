package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ExcelHandel {
public static void main(String[]args) throws IOException  {
	FileInputStream fis=new FileInputStream("C:\\Users\\girij\\Downloads\\Book12.xlsx");
	Workbook book=WorkbookFactory.create(fis);
	 Sheet sh = book.getSheet("Sheet1");
	//double value =sh.getRow(1).getCell(2).getNumericCellValue();
	//System.out.println(value);
	 
 // String value1 =sh.getRow(1).getCell(2).getStringCellValue();
//	System.out.println(value1);
	
    DataFormatter format=new DataFormatter();
	String value11 =format.formatCellValue((sh.getRow(0).getCell(0)));
	System.out.println(value11);
	 int lastrow=sh.getLastRowNum();
	 System.out.println(lastrow);
	 Short lastcell=sh.getRow(0).getLastCellNum();
	 System.out.println(lastcell);
	}
}