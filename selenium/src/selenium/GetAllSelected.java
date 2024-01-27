package selenium;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class GetAllSelected {
	public static void main(String[] args) throws InterruptedException{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/girij/OneDrive/Desktop/dropdown.html");
		WebElement sm=driver.findElement(By.id("Movies")); 
		Select s=new Select(sm);
		s.selectByIndex(1);
		s.selectByIndex(2);
		List<WebElement> allopt=s.getAllSelectedOptions();
		for(WebElement alloption:allopt) {
			System.out.println(alloption.getText());

		}
}
}