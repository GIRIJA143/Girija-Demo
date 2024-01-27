package selenium;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AllImagePath {
	public static void main (String[] args) {
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("---remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement>allimg=driver.findElements(By.xpath("//img"));
        for(WebElement img:allimg)
        {
        	System.out.println(img.getText());
        }
}
}