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

public class TommorowDate {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://jqueryui.com/datepicker/");
	     driver.switchTo().frame(0);
	     Calendar cal=Calendar.getInstance();
	     cal.add(cal.DAY_OF_YEAR, 1);
	     Date currentdate=cal.getTime();
	     SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
	     String mdfdate=sdf.format(currentdate);
	     System.out.println(mdfdate);
	     driver.findElement(By.id("datepicker")).sendKeys(mdfdate,Keys.ESCAPE);

	}

}
