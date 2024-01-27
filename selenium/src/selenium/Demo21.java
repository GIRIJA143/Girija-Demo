package selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo21 {
	public static void main(String[]args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("https://www.flipkart.com/");
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		driver.manage().window().maximize();
		//point p=driver.manage().window().getPosition();
		//System.out.println(p);
		//driver.close();
		//driver.manage().window().setPositions(newPoint(100,200));
		//point p=driver.manage().window().getPosition();
		
		
	}
	

}
