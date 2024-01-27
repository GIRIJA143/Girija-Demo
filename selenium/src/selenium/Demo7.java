package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Demo7 {
	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.SPACE,Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='menuTable']/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//div[text()='Manage system settings & configure actiTIME']")).click();
		WebElement usergroupdropdown=driver.findElement(By.id("userGroupNamingCodeSelect"));
		Select s=new Select(usergroupdropdown);
		List<WebElement>alloptions=s.getOptions();
		ArrayList<String> al=new ArrayList<String>();
		for(WebElement options:alloptions)
		{
			al.add(options.getText());
		}
       Collections.sort(al);
       System.out.println(al);
		
		
	}

}
