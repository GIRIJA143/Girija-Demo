package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Demo18 {
		ChromeDriver driver;
		public static void main(String[] args) throws InterruptedException {
		Demo18 rr=new Demo18();
			rr.lauchBrowser();
			rr.searchMoblie();
			rr.clickPrice();
			String result=rr.fetchRating();
			System.out.println(result);
			rr.close();
		}
	public void lauchBrowser( )
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
	}
	public void searchMoblie() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("mobile") ;
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
	}
	public void clickPrice() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
		Thread.sleep(4000);
	}
	public String fetchRating()
	{
		String rating=driver.findElement(By.xpath("//a[contains(@class,'fQZEK')][1]//span[2]")).getText();
		return rating ;
	
	}
	public void close() throws InterruptedException   {
		Thread.sleep(4000);
		driver.quit();
	}	
}
