

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class gmail {
	WebDriver driver;
	
	@BeforeTest
	
	
	public void startbrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	    driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("http://gmail.com");
		Thread.sleep(1000);
		
	}
	
	@Test(priority=0)
	public void testcases() throws InterruptedException
	
	{
		
		driver.findElement(By.xpath("//span[@class='NlWrkb snByac']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'For myself')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("bhavya");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("hosamani");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("abc");
		Thread.sleep(1000);
		
	}
	
	@AfterTest
	public void close()
	{
		
		driver.close();
	}
}

