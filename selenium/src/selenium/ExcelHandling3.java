package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExcelHandling3 {

	public static void main(String[] args) throws IOException {
		
				FileInputStream fis=new FileInputStream("C:\\Users\\girij\\Downloads\\Book12.xlsx");
			Workbook book=WorkbookFactory.create(fis);
			Sheet sh=book.getSheet("Sheet1");
			//Row row=sh.getRow(2);
			//Cell cel=row.getCell(0);
			String value=sh.getRow(2).getCell(1).getStringCellValue();
			System.out.println(value);
			//driver.findElement(By.name("pwd")).sendKeys("manager");


	}

}
