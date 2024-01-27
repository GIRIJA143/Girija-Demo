package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipkartPriceLowToHigh {

	public static void main(String[] args) {
	 	ChromeOptions opt= new ChromeOptions();
		opt.addArguments("---remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement SearchBox=driver.findElement(By.xpath("//input[@name='q']"));
		SearchBox.sendKeys("mobile");
		SearchBox.submit();
		
	}

}
