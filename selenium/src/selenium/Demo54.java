package selenium;


import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo54 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://online.actitime.com/gsankar/login.do");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.SPACE,Keys.ENTER);
		driver.findElement(By.cssSelector("[class='content tasks']")).click();
		driver.findElement(By.xpath("(//div[@class='img'])[1]")).click();
		//Thread.sleep(2000);
		WebElement delete=driver.findElement(By.cssSelector("[class='delete button']"));
		delete.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='You are about to delete 63 tasks']")));
		//Thread.sleep(2000);
		WebElement popupmsg=driver.findElement(By.xpath("(//div[@class='operationConfirmDialogInnerContainer'])[3]/div[2]"));
		String msg=popupmsg.getText();
		System.out.println(msg);
		
		
		
		
		
}
}