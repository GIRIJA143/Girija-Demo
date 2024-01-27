package selenium;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Practice11 {
	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		  driver.manage().window().maximize();
		  driver.get("file:///C:/Users/girij/OneDrive/Desktop/dropdown.html");
		  WebElement dropdown=driver.findElement(By.id("movie"));
		  dropdown .click();
		  TreeSet ts=new TreeSet();
		  Select s=new Select(dropdown);
		  List<WebElement>alloption=s.getOptions();
		  for(WebElement option:alloption)
		  {
			  ts.add(option.getText());
		  }
		  System.out.println(ts);
}
}