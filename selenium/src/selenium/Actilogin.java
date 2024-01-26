package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Actilogin {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FileInputStream fis=new FileInputStream("C:\\Users\\girij\\OneDrive\\Desktop\\acti.properties.");
		Properties pobj= new Properties();
		pobj.load(fis);
		String URL=pobj.getProperty("url");
		String UN=pobj.getProperty("username");
		String PWD=pobj.getProperty("pwd");
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys(UN);
		driver.findElement(By.name("pwd")).sendKeys(PWD);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}

}
