package selenium;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalendarByJava {

	public static void main(String[] args) throws InterruptedException{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://jqueryui.com/datepicker/");
	     driver.switchTo().frame(0);
	     Calendar cal=Calendar .getInstance();
	     Date currentDate=cal.getTime();
	     System.out.println(currentDate);
	     SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
	     String mdfDate=sdf.format(currentDate);
	     System.out.println(mdfDate);
	     driver.findElement(By.id("datepicker")).sendKeys(mdfDate,Keys.ESCAPE);
	     
	     
}
}