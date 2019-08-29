package demoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class facebook {
	WebDriver driver;
	
	@BeforeTest
	public void startbrowser() throws InterruptedException
	{
	
			System.setProperty("webdriver.chrome.driver","C://ChromeDriver.exe");
			 driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			driver.get("http://facebook.com");
			Thread.sleep(1000);
			
	}
	@Test(priority=0)
	public void testcases() throws InterruptedException
	{
		
			driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys("bhavya");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='u_0_n']")).sendKeys("hosamani");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='u_0_q']")).sendKeys("1234");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='u_0_x']")).sendKeys("abc");
			Thread.sleep(1000);
			
	}
	
	@AfterTest
	public void close()
	{
	
			
		driver.close();


		



	}

}
