package selenium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropdownAssendingPractice {
	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		  driver.manage().window().maximize();
		  driver.get("file:///C:/Users/girij/OneDrive/Desktop/dropdown.html");
		  WebElement dropdown=driver.findElement(By.id("movie"));
		  dropdown .click();
		  ArrayList al=new ArrayList();
		  Select s=new Select(dropdown);
		
		  List<WebElement>allopt=s.getOptions();
		  for(WebElement option:allopt)
		  {
			al.add(option.getText());
			
		  }
		  Collections.sort(al);
		  System.out.println(al);
}
}