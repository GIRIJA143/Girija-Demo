package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement searchbox=driver.findElement(By.id("APjFqb"));
		searchbox.sendKeys("virat");
		Thread.sleep(3000);
		searchbox.clear();
	String tagname=	searchbox.getTagName();
	System.out.println(tagname);
	}

}
