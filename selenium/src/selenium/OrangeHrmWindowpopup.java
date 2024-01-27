package selenium;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OrangeHrmWindowpopup {
	public static void main(String[] args) throws InterruptedException{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[1]")).click();
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[2]")).click();
		//driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[3]")).click();
		String mainId=driver.getWindowHandle();
		Set<String> id=driver.getWindowHandles();
		for(String allid:id) {
				driver.switchTo().window(allid);
				String title=driver.getTitle();
			if(title.contains("OrangeHRM")){
				System.out.println(title);
			}
			else { 
				driver.switchTo().window(mainId);
				
			driver.close();
			
			
			}
		}
	}
}