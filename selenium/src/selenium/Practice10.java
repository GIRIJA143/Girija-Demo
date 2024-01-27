package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice10 {

	public static void main(String[] args) throws InterruptedException  {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		  driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.findElement(By.id("APjFqb")).sendKeys("India");
          Thread.sleep(2000);
          List<WebElement>allsug=driver.findElements(By.xpath("//div[@class='erkvQe']//li"));
          for (WebElement sug:allsug)
          {
        	  String suggname=sug.getText();
        	  if(suggname.contains("map"))
        	  {
        		  sug.click();
        		  break;
        	  }
          }
	}
}
