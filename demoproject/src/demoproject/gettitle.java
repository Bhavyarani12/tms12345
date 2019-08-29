package demoproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class gettitle {
	WebDriver driver;
	
	@BeforeTest
	
	public void startbrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C://ChromeDriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("http://amazon.com");
		Thread.sleep(1000);
	}
	
	@Test
	public void testcases()
	{
		
		String actualtitle=driver.getTitle();
		System.out.println("The title of the page is:"+actualtitle);
		
	}
	@AfterTest
	
	public void close()
	{
driver.close();


	}

	}





