package selenium;
import java.io.File;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

 public class MockInterview {
	public static void main(String[] args) throws InterruptedException, IOException{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='td-header-sp-recs']/div/div/center/b[1]/a[1]")).click();
		driver.switchTo().defaultContent();
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	//wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Thread.sleep(3000);
		String mainid=driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		for(String id:allid)
		{
			if(!(mainid.equals(id)))
			{
				driver.switchTo().window(id); 
			}
		}
		WebElement allexam=driver.findElement(By.id("all-exams-id"));
		Actions act=new Actions(driver);
		act.moveToElement(allexam).perform();
		WebElement Scrollbar=driver.findElement(By.className("dropdown-content"));
		ScrollOrigin so=ScrollOrigin.fromElement(Scrollbar);
		act.scrollFromOrigin(so, 0, 200).perform();
		driver.findElement(By.id("entrance-exams-240")).click();
		act.scrollByAmount(0, 300).perform();
		driver.findElement(By.xpath("//ul[@class='pagination']/li[3]/a")).click();
		driver.findElement(By.linkText("CAT")).click();
		WebElement msg=driver.findElement(By.xpath("//h1[contains(text(),'CAT Mock Tests')]"));
		File src=msg.getScreenshotAs(OutputType.FILE);
		File trg=new File("./screenshot/catmsg3.png");
		FileUtils.copyFile(src, trg);
		driver.quit();
	}
}