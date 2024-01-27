package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DareOfBirth {
     
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
	     String cureentmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
	     String cureentyear=driver.findElement(By.className("ui-datepicker-year")).getText();
        while(!(cureentmonth.equals(month)&&cureentyear.equals(year)))
        {
        driver.findElement(By.xpath("//span[text()='Prev']")).click();
        cureentmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
        cureentyear=driver.findElement(By.className("ui-datepicker-year")).getText();
        }
        driver.findElement(By.linkText("18")).click();
	}

}
