package selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelHandling5 {

	public static void main(String[] args) throws Exception, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\girij\\Downloads\\Book12.xlsx");
		Workbook book =WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		sh.createRow(0).createCell(6).setCellValue("i hate you");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\girij\\Downloads\\Book12.xlsx");
		book.write(fos);
		fos.flush();
		Thread.sleep(3000);
		DataFormatter f=new DataFormatter();
		
		String value=f.formatCellValue(sh.getRow(0).getCell(6));
		System.out.println(value);
		
	}

}
