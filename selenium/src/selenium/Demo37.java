package selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.util.List;

public class Demo37 {
	public static void main(String[] args) throws InterruptedException{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement w=driver.findElement(By.name("q"));
		w.sendKeys("iphonex");
		Thread.sleep(2000);
		List<WebElement> total=driver.findElements(By.xpath("//ul[contains(@class,'col')]//li"));
		for(WebElement single:total)
		{
			System.out.println(single.getText());
		}
		
		
		System.out.println(total.size());
		
		

		}

}
