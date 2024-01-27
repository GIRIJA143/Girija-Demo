package selenium;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Getoptions {
	public static void main(String[] args) throws InterruptedException{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/girij/OneDrive/Desktop/dropdown.html");
		Select s=new Select(driver.findElement(By.id("movie")));
		List<WebElement>op=s.getOptions();
		int size =op.size();
		for(int i=0;i<size;i++) {
			String t =op.get(i).getText();
			System.out.println(t);
		}
		
	driver.quit();
	
	}
}