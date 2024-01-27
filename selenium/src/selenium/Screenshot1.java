package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Screenshot1 {
	public static void main(String[] arg) throws InterruptedException, IOException
	{

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		  driver.manage().window().maximize();
		  driver.get("https://www.flipkart.com/");
		  ///driver.findElement(By.className("_2KpZ6l _2doB4z")).click();
         TakesScreenshot ts=(TakesScreenshot)driver;
         File src=ts.getScreenshotAs(OutputType.FILE);
         File trg=new File("./screenshot/flipkart4.png");
         FileUtils.copyFile(src, trg);
         
       
}
}