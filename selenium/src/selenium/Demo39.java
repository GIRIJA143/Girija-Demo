package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class Demo39 {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		//Actions act=new Actions(driver);
		//act.scrollByAmount(0, 1000).perform();
		
		//Thread.sleep(3000);
		//WebElement wb=driver.findElement(By.xpath("//h2[text()='Selenium Level Sponsors']"));
		
		//act.scrollToElement(wb).perform();
		driver.findElement(By.xpath("//span[text()='Documentation']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("m-documentationwebdriver")).click();
		Thread.sleep(3000);
		WebElement scrollbar=driver.findElement(By.id("td-section-nav"));
		ScrollOrigin sc= ScrollOrigin.fromElement(scrollbar);
		Actions sct=new Actions(driver);
		sct.scrollFromOrigin(sc, 0, 400).perform();
}
}
