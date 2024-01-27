package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Demo6 {
	public static void main(String[] args) throws InterruptedException{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/girij/OneDrive/Desktop/dropdown.html");
	   WebElement multidropdown=driver.findElement(By.id("movie"));
	  Select s=new Select(multidropdown);
	 if(s.isMultiple())
	 {
		 System.out.println("it is multi select");
	 }
	 else
	 {
		 System.out.println("it is single select"); 
	 }
}
}