package selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Demo31 {
	public static void main(String[] args) throws AWTException, InterruptedException{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("APjFqb"));
		Robot pb=new Robot();
	     pb.keyPress(KeyEvent.VK_SHIFT);
		
		pb.keyPress(KeyEvent.VK_S);
		pb.keyRelease(KeyEvent.VK_S);
		
		pb.keyPress(KeyEvent.VK_E);
		pb.keyRelease(KeyEvent.VK_E);
		
		pb.keyPress(KeyEvent.VK_L);
		pb.keyRelease(KeyEvent.VK_L);
		
		pb.keyPress(KeyEvent.VK_E);
		pb.keyRelease(KeyEvent.VK_E);
		
		pb.keyPress(KeyEvent.VK_N);
		pb.keyRelease(KeyEvent.VK_N);
		
		pb.keyPress(KeyEvent.VK_I);
		pb.keyRelease(KeyEvent.VK_I);
		
		pb.keyPress(KeyEvent.VK_U);
		pb.keyRelease(KeyEvent.VK_U);
		
		pb.keyPress(KeyEvent.VK_M);
		pb.keyRelease(KeyEvent.VK_M);
		Thread.sleep(2000);
		
		pb.keyRelease(KeyEvent.VK_SHIFT);
		
		pb.keyPress(KeyEvent.VK_S);
		pb.keyRelease(KeyEvent.VK_S);
		
		pb.keyPress(KeyEvent.VK_E);
		pb.keyRelease(KeyEvent.VK_E);
		
		pb.keyPress(KeyEvent.VK_L);
		pb.keyRelease(KeyEvent.VK_L);
		
		pb.keyPress(KeyEvent.VK_E);
		pb.keyRelease(KeyEvent.VK_E);
		
		pb.keyPress(KeyEvent.VK_N);
		pb.keyRelease(KeyEvent.VK_N);
		
		pb.keyPress(KeyEvent.VK_I);
		pb.keyRelease(KeyEvent.VK_I);
		
		pb.keyPress(KeyEvent.VK_U);
		pb.keyRelease(KeyEvent.VK_U);
		
		pb.keyPress(KeyEvent.VK_M);
		pb.keyRelease(KeyEvent.VK_M);
		Thread.sleep(2000);
		
		pb.keyPress(KeyEvent.VK_CONTROL);
		pb.keyPress(KeyEvent.VK_A);
		
		pb.keyRelease(KeyEvent.VK_CONTROL);
		pb.keyRelease(KeyEvent.VK_A);
		Thread.sleep(2000);
		
		pb.keyPress(KeyEvent.VK_CONTROL);
		pb.keyPress(KeyEvent.VK_DELETE);
		
		pb.keyRelease(KeyEvent.VK_CONTROL);
		pb.keyRelease(KeyEvent.VK_DELETE);
		
		   
	
	}
}