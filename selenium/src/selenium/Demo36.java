package selenium;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo36 {
	public static void main(String[] args) throws InterruptedException{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement wb=driver.findElement(By.id("APjFqb"));
		wb.sendKeys("INDIA");
		Thread.sleep(3000);
		List<WebElement> all=driver.findElements(By.xpath("//div[@class='erkvQe']//li"));
		Thread.sleep(2000);
		for(int i=0;i<=2;i++)
		{
			System.out.println(all.get(i).getText());
		}
		for(int j=all.size()-1;j>=3;j--)
		{
			System.out.println(all.get(j).getText());
		}
	
		}
	

	}