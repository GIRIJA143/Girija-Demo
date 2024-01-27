package selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataInputToExcel {

	public static void main(String[] args) throws Exception, IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\girij\\Downloads\\Book13.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		 Sheet sh = book.getSheet("Sheet1");
		 sh.createRow(1).createCell(0).setCellValue("munu");
		sh.createRow(2).createCell(1).setCellValue("pinky");
		 sh.createRow(3).createCell(2).setCellValue("sonali barik");
		 FileOutputStream fos=new FileOutputStream("C:\\Users\\girij\\Downloads\\Book13.xlsx");
		 book.write(fos);
		 fos.flush();
	}

}
