import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class search_tour {
	
WebDriver driver;
	
	@BeforeTest
	public void startbrowser() throws InterruptedException, IOException {
		
		//start browser
	
	System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("https://www.phptravels.net/admin/");
	driver.manage().window().maximize();
	
	
	//Screenshot and title
	 
	 TakesScreenshot ts=(TakesScreenshot)driver;
	 File file=ts.getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(file, new File("D:\\Screenshot\\fb"));
	 
	 
	  String actualtitle=driver.getTitle();
	  Thread.sleep(1000);
	
	
	}
	
	@Test(priority=0) 
	public void testcases() throws InterruptedException { 
	
		//Login
    driver.findElement(By.xpath("//form[@class='form-signin form-horizontal wow fadeIn animated animated']//input[@placeholder='Email']")).sendKeys("admin@phptravels.com");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("demoadmin");
	driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block ladda-button fadeIn animated']")).click();
	Thread.sleep(5000);
	}
	
	@Test(priority=1)
	public void search() throws InterruptedException
	{
		//Tours
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[3]/ul[1]/li[9]/a[1]")).click();
		//tours(in)
		driver.findElement(By.xpath("//ul[@id='Tours']//a[contains(text(),'Tours')]")).click();
		
		   JavascriptExecutor js1=(JavascriptExecutor)driver;
		   js1.executeScript("window.scrollBy(0,800)");
		   System.out.println("scrolled Down");
		   Thread.sleep(1000);
		   
		   //search
		   driver.findElement(By.xpath("//a[@class='xcrud-search-toggle btn btn-default']")).click();
		   //search by name
		   driver.findElement(By.xpath("//select[@name='column']/option[2]")).click();
		   //enter tour name
		   driver.findElement(By.xpath("//input[@name='phrase']")).sendKeys("Big Bus Tour of Dubai");
		   //click on GO button
		   driver.findElement(By.xpath("//a[contains(@class,'xcrud-action btn btn-primary')]")).click();
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
	}
	
	

}
