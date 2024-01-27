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

public class Screenshot2 {
	public static void main(String[]args) throws IOException {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(opt);
	  driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	WebElement googlelogo=driver.findElement(By.className("lnXdpd"));
	//TakesScreenshot ts=(TakesScreenshot)driver;
	File src=googlelogo.getScreenshotAs(OutputType.FILE);
	File trg=new File("./screenshot/logo2.png");
			FileUtils.copyFile(src, trg);

}
}