package selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("iphonex",Keys.ENTER);
	driver.findElement(By.xpath("//div[text()='APPLE iPhone X (Silver, 64 GB)']")).click();
	String mainId=driver.getWindowHandle();
	//System.out.println(mainId);
	Set<String> allId=driver.getWindowHandles();
	//System.out.println(allId);
	for(String id:allId)
	{
		if(!(mainId.equals(id)))
		{
			driver.switchTo().window(id);
		}
	}
	String price=driver.findElement(By.className("CEmiEU")).getText();
	System.out.println(price);
}
}
