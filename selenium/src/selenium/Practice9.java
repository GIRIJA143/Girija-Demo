package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Practice9 {
	public static void main(String[] args) throws InterruptedException{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("admin");
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("A").perform();
		act.keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("C").perform();
		act.keyUp(Keys.CONTROL).perform();
		WebElement password=driver.findElement(By.name("pwd"));
		act.keyDown(password,Keys.CONTROL).sendKeys("v").perform();
		act.keyUp(Keys.CONTROL).perform();
		
		

}
}