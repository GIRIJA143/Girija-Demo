package selenium;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {
	public static void main(String[]args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphonex") ;
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		//WebElement slider=driver.findElement(By.className("_2IN3-t"));
		WebElement slider=driver.findElement(By.xpath("(//div[contains(@class,'FdLqY')])[1]"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(slider, 60, 0).perform();
		Thread.sleep(3000);
		//act.dragAndDropBy(slider, 0, 40).perform();
		act.dragAndDropBy(slider, -40, 0).perform();
		Thread.sleep(3000);
		//driver.quit();
		
}
}