package selenium;

import java.io.FileInputStream;
//import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PropertiesFileHandeling {

	public static void main(String[] args) throws IOException{
		FileInputStream fis=new FileInputStream("C:\\Users\\girij\\OneDrive\\Desktop\\acti.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String Url=pobj.getProperty("url");
		System.out.println(Url);
		String un=pobj.getProperty("username");
		System.out.println(un);
		String pw=pobj.getProperty("password");
		System.out.println(pw);

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}

}
