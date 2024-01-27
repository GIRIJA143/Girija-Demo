package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseActionHandling {
	public static void main(String[]args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.flipkart.com/");
	    
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
	    Thread.sleep(3000);
WebElement mobile=driver.findElement(By.xpath("//div[text()='Mobiles']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(mobile).perform();
}
}