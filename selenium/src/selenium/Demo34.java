package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo34 {
	public static void main(String[]args) throws AWTException, InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		Robot ab=new Robot();
		ab.keyPress(KeyEvent.VK_PAGE_DOWN);
		ab.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		ab.keyPress(KeyEvent.VK_PAGE_DOWN);
		ab.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		

}
}