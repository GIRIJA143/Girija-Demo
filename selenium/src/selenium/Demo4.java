package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo4 {
	public static void main(String[]args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphonex") ;
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		List<WebElement> allproductName=driver.findElements(By.xpath("//div[@class='MIXNux']/following-sibling::div/div[1]/div[1]"));
		for(WebElement productname:allproductName)
		{
			String name=productname.getText();
			String price=driver.findElement(By.xpath("//div[text()='"+name+"']/../../div[2]/div[1]/div[1]/div[1]")).getText();
			System.out.println(name+"-------------->"+price);
		}
		
		
	}

}
