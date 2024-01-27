package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelHandling4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\girij\\Downloads\\Book12.xlsx");
	Workbook book=WorkbookFactory.create(fis);
    Sheet sh=book.getSheet("Sheet1");
   // Row row=sh.getRow(3);
   // Cell cel=row.getCell(0);
   // String value=cel.getStringCellValue();
   // System.out.println(value);
    DataFormatter format=new DataFormatter();
    String value=format.formatCellValue(sh.getRow(3).getCell(0));
    System.out.println(value);
	}

}
