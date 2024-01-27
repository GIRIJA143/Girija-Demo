package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.Format;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PropertiesHandling {

	public static void main(String[] args) throws IOException, Exception {
		FileInputStream fis=new FileInputStream("C:\\Users\\girij\\OneDrive\\Desktop\\details.Properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String ab=pobj.getProperty("girlfriend");
		System.out.println(ab);
		Thread.sleep(3000);
		FileInputStream fiis=new FileInputStream("C:\\Users\\girij\\Downloads\\Book12.xlsx");
		Workbook book=WorkbookFactory.create(fiis);
		Sheet sh=book.getSheet("Sheet1");
		sh.createRow(7).createCell(0).setCellValue("pinky");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\girij\\Downloads\\Book12.xlsx");
		book.write(fos);
		fos.flush();
		Thread.sleep(3000);
		
		DataFormatter mt= new DataFormatter();
	String value= mt.formatCellValue(sh.getRow(7).getCell(0));
		
System.out.println(value);
	}

}
