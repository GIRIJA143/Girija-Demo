package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Slider {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("Iphone X");
	driver.findElement(By.cssSelector("[type='submit']")).click();
	WebElement Start=driver.findElement(By.xpath("(//div[contains(@class,'FdLqY')])[1]"));
	Actions act=new Actions(driver);
	act.dragAndDropBy(Start, 70, 0).perform();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)) ;
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Clear all']")));
	//Thread.sleep(2000);
	WebElement end= driver.findElement(By.xpath("(//div[contains(@class,'FdLqY')])[2]"));
	act.dragAndDropBy(end, -70, 0).perform();
	
}
}