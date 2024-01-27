package selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Demo33{
	public static void main(String[] arg) throws InterruptedException
	{

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		  driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("india");
			Thread.sleep(2000);
			
			List<WebElement>allsugg=driver.findElements(By.xpath("//div[@class='OBMEnb']//li[9]"));
			for(WebElement sug:allsugg)
			{
				System.out.println(sug.getText());
			}

	}
}
    
	
// not right way