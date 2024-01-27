package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		  driver.manage().window().maximize();
		  driver.get("file:///C:/Users/girij/OneDrive/Desktop/dropdown.html");
		  WebElement dropdown=driver.findElement(By.id("movie"));
		  dropdown .click();
		  //driver.findElement(By.xpath("//option[text()='KGF']")).click();
		  Select s=new Select(dropdown);
		 if(s.isMultiple())
		 {
			 System.out.println("it is multiselected");
		 }
		 else
		 {
			 System.out.println("it is not multiselected");
		 }

	}

}
//WebElement dropdown=
