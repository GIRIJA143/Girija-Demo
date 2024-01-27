package selenium;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class HiddenDivisionPopup {
	public static void main(String[] args) throws InterruptedException{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//div[@class='checkbox inactive'][1]")).click();
	    WebElement ab= driver.findElement(By.cssSelector("[class='delete button']"));
	    ab.click();
	  //  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='operationConfirmDialogInnerContainer'])[3]")));
		//WebElement popupmsg=driver.findElement(By.xpath("//div[text()='You are about to delete 63 tasks']"));
		//String msg=popupmsg.getText();
		//System.out.println(msg);
		
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='operationConfirmDialogInnerContainer'])[3]/div[2]")));
		//Thread.sleep(2000);
		WebElement msg1=driver.findElement(By.xpath("(//div[@class='operationConfirmDialogInnerContainer'])[3]/div[2]"));
		String msg=msg1.getText();
		System.out.println(msg);
		driver.quit();

		
		
		
}
}