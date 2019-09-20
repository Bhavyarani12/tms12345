import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {

	
		
		WebDriver driver;
			
			@BeforeTest
			public void startbrowser() throws InterruptedException, IOException {
				
				//start browser
			
			System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.get("https://www.phptravels.net/admin/");
			driver.manage().window().maximize();
			
			
			//Screenshot and title
			 
//			 TakesScreenshot ts=(TakesScreenshot)driver;
//			 File file=ts.getScreenshotAs(OutputType.FILE);
//			 FileUtils.copyFile(file, new File("D:\\Screenshot\\fb"));
//			 
//			 
//			  String actualtitle=driver.getTitle();
	  Thread.sleep(5000);
			
			
			}
			
			@Test(priority=0) 
			public void login() throws InterruptedException { 
			
				//Login
			
			driver.findElement(By.name("email")).sendKeys("dfdg");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("demoadmin");
			driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block ladda-button fadeIn animated']")).click();
			Thread.sleep(1000);
			
			}
			
	}


