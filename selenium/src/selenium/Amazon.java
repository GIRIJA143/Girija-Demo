package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {
	public static void main (String[] args) throws IOException {
	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("---remote-allow-origins=*");
	ChromeDriver driver=new ChromeDriver(opt);
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement serch=driver.findElement(By.id("twotabsearchtextbox"));
	serch.sendKeys("mobile");
	serch.submit();
	//WebDriver driver=new ChromeDriver();
	//TakesScreenshot ts=(TakesScreenshot)driver;
	
	 TakesScreenshot ts=(TakesScreenshot)driver;
     File src=ts.getScreenshotAs(OutputType.FILE);
     File trg=new File("./screenshot/amazon4.png");
     FileUtils.copyFile(src, trg);
     
	
}
}