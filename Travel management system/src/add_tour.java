import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class add_tour {
	
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
	public void add_tours() throws InterruptedException {
		
	
	//Tours
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[3]/ul[1]/li[9]/a[1]")).click();
    Thread.sleep(1000);
	
 
	//Add tours
	
	driver.findElement(By.xpath("//a[contains(text(),'Add New')]")).click();
	Thread.sleep(1000);
	
	//General
	
	
	driver.findElement(By.xpath("//select[@name='tourstatus']")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[@id='GENERAL']//input[@placeholder='Tour Name']")).sendKeys("Hawa Mahal");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@name='maxadult']")).sendKeys("2");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@name='adultprice']")).sendKeys("2500");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//span[@id='childbtn']")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@name='maxchild']")).sendKeys("1");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@name='childprice']")).sendKeys("2500");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//span[@id='infantbtn']")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@name='maxinfant']")).sendKeys("1");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@name='infantprice']")).sendKeys("1500");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//span[@id='adultbtn']")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//span[@id='childbtn']")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//span[@id='infant']")).click();
	Thread.sleep(1000);

	driver.findElement(By.xpath("//select[@name='tourstars']")).sendKeys("3");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@name='tourdays']")).sendKeys("3");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@name='tournights']")).sendKeys("2");
	Thread.sleep(1000);
	 
	//Select tour type
	driver.findElement(By.xpath("//span[@class='select2-chosen'][contains(text(),'Select')]")).click();
	Thread.sleep(1000);
	
	//private tour type
	driver.findElement(By.xpath("//div[contains(text(),'Private')]")).click();
	Thread.sleep(1000);
	
	//Featured
	driver.findElement(By.xpath("//select[@id='isfeatured']/option[2]")).click();
	Thread.sleep(1000);
	
	
	
	
	
	//scroll down


	JavascriptExecutor js1=(JavascriptExecutor)driver;
    js1.executeScript("window.scrollBy(0,800)");
	System.out.println("scrolled Down");
    Thread.sleep(1000);	
    
	driver.findElement(By.xpath("//select[@name='deposittype']/option[01]")).click();
	Thread.sleep(1000);

    driver.findElement(By.xpath("//input[@name='depositvalue']")).sendKeys("345.54");
	
	driver.findElement(By.xpath("//select[@name='taxtype']/option[02]")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@name='taxvalue']")).sendKeys("2345");
	Thread.sleep(1000);
	 
	driver.findElement(By.xpath("//input[@id='mapaddress']")).sendKeys("Hawa Mahal Rd, Badi Choupad, J.D.A. Market, Pink City, Jaipur, Rajasthan 302002");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@id='latitude']")).sendKeys("26.9239� N");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@id='longitude']")).sendKeys("75.8267� E");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//button[@id='add']")).click();
	Thread.sleep(1000);
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
	}
	
	
	
	    
	

		
	
	
	
	
}		
	
	
	
	
	

	
	
	
	
	








