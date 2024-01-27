package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class Demo40 {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("//span[text()='Documentation']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("m-documentationwebdriver")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("m-documentationwebdriveractions_api")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("m-documentationwebdriveractions_apipen")).click();
		Thread.sleep(2000);
		WebElement scrollbar=driver.findElement(By.id("tabs-3-content"));
		ScrollOrigin sc= ScrollOrigin.fromElement(scrollbar);
		Actions sct=new Actions(driver);
		sct.scrollFromOrigin(sc, 400, 0).perform();
		
	}
}