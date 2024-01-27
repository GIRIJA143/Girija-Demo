package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ActTime {
	public static void main(String[] args) throws InterruptedException{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/gsankar/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("girijas981@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("@bmGp@7j");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[2]")).click();
		driver.findElement(By.xpath("//div[text()='Manage system settings & configure actiTIME']")).click();
		WebElement dropdown =driver.findElement(By.id("firstHierarchyLevelCodeSelect"));
		Select s= new Select(dropdown);
		s.selectByValue("3");
}
}