package selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExcelHandleing2 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		WebElement error=driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']"));
	    //System.out.println(error.getText());
String colour=error.getCssValue("color");
System.out.println(colour);
FileInputStream fis=new FileInputStream("C:\\Users\\girij\\Downloads\\Book12.xlsx");
Workbook book=WorkbookFactory.create(fis);
Sheet sh=book.getSheet("Sheet1");
sh.createRow(3).createCell(4).setCellValue(colour);
FileOutputStream fos=new FileOutputStream("C:\\Users\\girij\\Downloads\\Book12.xlsx");
book.write(fos);
fos.flush();

	}

}
