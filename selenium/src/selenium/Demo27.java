package selenium;


import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo27 {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		WebElement flipkart=driver.findElement(By.xpath("//button[text()='✕']"));
		File src=flipkart.getScreenshotAs(OutputType.FILE);
		File trg=new File("./screenshot/FlipkartItems.png");
		FileUtils.copyFile(src,trg);
}
}