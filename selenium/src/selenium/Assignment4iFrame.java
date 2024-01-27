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

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

 

public class Assignment4iFrame {

 

         public static void main(String[] args) throws IOException, InterruptedException  {

                                 ChromeOptions opt=new ChromeOptions();
                        		opt.addArguments("--remote-allow-origins=*");
                        		opt.addArguments("--disable-notifications");
                        		WebDriver driver=new ChromeDriver(opt);
                        		driver.manage().window().maximize();
                                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

                                driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");

                                WebElement frame=driver.findElement(By.name("iframe_a"));

                                driver.switchTo().frame(frame);

                                driver.findElement(By.xpath("(//a[text()='Free Mock Tests'])[2]")).click();

                               

                                WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

                                wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cs-topbar")));

                               // Thread.sleep(4000);

                                String mainid=driver.getWindowHandle();

                                Set<String> allid=driver.getWindowHandles();

                                for(String id:allid)

                                {

                                                if(!(mainid.equals(id)))

                                                {

                                                                driver.switchTo().window(id);

                                                }

                                }

                               

                                WebElement allExams=driver.findElement(By.id("all-exams-id"));

                                WebElement sc=driver.findElement(By.xpath("//ul[@class='dropdown-content']/li[@id='entrance-exams-240']"));

                                Actions act=new Actions(driver);

                                act.moveToElement(allExams).perform();

                                act.scrollToElement(sc).perform();

                                sc.click();

                                driver.findElement(By.xpath("//a[text()='2']")).click();

                                driver.findElement(By.xpath("//a[text()='CAT']")).click();

                                WebElement ss=driver.findElement(By.xpath("//h1[text()='CAT Mock Tests 2023 | Free Online Test Series']"));

                                File store= ss.getScreenshotAs(OutputType.FILE);

                                File target=new File("./screenshot/frame2.png");

                                FileUtils.copyFile(store,target);
}
}
