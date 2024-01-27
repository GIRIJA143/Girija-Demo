package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.*;

public class Demo32 {
	public static void main(String[] args) throws AWTException, InterruptedException{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement wb=driver.findElement(By.id("APjFqb"));
		wb.sendKeys("SELENIUMselenium");
		Thread.sleep(3000);
		 Actions act=new Actions(driver);
		 
		 act.keyDown(Keys.CONTROL).sendKeys("a").perform();
		 act.keyUp(Keys.CONTROL).perform();
		 Thread.sleep(3000);
		 
		 act.sendKeys(Keys.DELETE).perform();
		 Thread.sleep(3000);
		 driver.quit();
}
}