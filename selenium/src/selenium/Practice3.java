package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice3 {

	public static void main(String[] args) throws InterruptedException   {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement checkbox=driver.findElement(By.id("keepLoggedInCheckBox"));
		checkbox.click();
		Thread.sleep(3000);
		if(checkbox.isSelected())
		{
			System.out.print("is selected");
			checkbox.click();
		}

	}

}
