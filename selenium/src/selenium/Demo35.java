package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo35 {
	public static void main(String[] arg) throws InterruptedException
	{

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		  driver.manage().window().maximize();
		  driver.get("https://www.flipkart.com/");
		  driver.findElement(By.xpath("//button[text()='✕']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphonex");

}
}