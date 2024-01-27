package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropdownGetOptions {
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
		  s.selectByIndex(1);
		  s.selectByIndex(2);
		  
      // List<WebElement>allopt=s.getAllSelectedOptions();
      // for(WebElement options:allopt)
      // {
    	   //System.out.println(options.getText());
      // }
       WebElement firstoption=s.getFirstSelectedOption();
       System.out.println(firstoption.getText());
}
}