package selenium;
//interview question
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalendarDateofbirthClick {
public static void main(String[] args) {
	String month="March";
	String year="2001";
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://jqueryui.com/datepicker/");
	driver.switchTo().frame(0);
	driver.findElement(By.id("datepicker")).click();
	String currentmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
System.out.println(currentmonth);
	String currentyear=driver.findElement(By.className("ui-datepicker-year")).getText();
	System.out.println(currentyear);
	while(!(currentmonth.equals(month)&&currentyear.equals(year)))
	{
		driver.findElement(By.xpath("//span[text()='Prev']")).click();
		currentmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
	    currentyear=driver.findElement(By.className("ui-datepicker-year")).getText();
	    
	}
     driver.findElement(By.linkText("18")).click();

}
} 