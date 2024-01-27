package selenium;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSug {

	
		public static void main (String[] args) throws IOException {
			ChromeOptions opt= new ChromeOptions();
			opt.addArguments("---remote-allow-origins=*");
			ChromeDriver driver=new ChromeDriver(opt);
			driver.get("https://www.google.co.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.id("APjFqb")).sendKeys("india");
			List<WebElement> allsug=driver.findElements(By.className("mkHrUc"));
			for(WebElement sug:allsug) {
				System.out.println(sug.getText());
				
			}
			
	}

}
