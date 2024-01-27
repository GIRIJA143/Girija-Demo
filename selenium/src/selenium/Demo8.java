package selenium;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Demo8{
public static void main(String[] args) {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("file:///C:/Users/girij/OneDrive/Desktop/dropdown.html");
	WebElement dropdown=driver.findElement(By.id("movie"));
	Select s=new Select(dropdown);
	s.selectByIndex(1);
	s.selectByIndex(2);
	List<WebElement>alloptions=s.getOptions();
	for(WebElement options:alloptions)
	{
		if(!(options.isSelected()))
		{
			System.out.println(options.getText());
		}
	}
}
}