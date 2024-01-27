package selenium;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalenderPopup {
	public static void main(String[] args) throws InterruptedException{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://jqueryui.com/datepicker/");
	     driver.switchTo().frame(0);
    driver.findElement(By.id("datepicker")).click();
   driver.findElement(By.className("ui-state-highlight")).click();
}
}