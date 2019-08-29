package demoproject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class scrolldown {
	WebDriver driver;
	
	@BeforeTest
	
	public void startbrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("http://facebook.com");
		Thread.sleep(1000);
		
}
	@Test(priority=0)
	public void testcases() throws InterruptedException
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2500)");
		System.out.println("scrolled Down");
		Thread.sleep(5000);
		
		
		js.executeScript("window.scrollBy(2500,-2500)");
		System.out.println("scrolled up");
		Thread.sleep(1000);
	

	}
	
	@AfterTest()
	public void close()
	{
driver.close();
}


}
