import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class travelhope_hotels {

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
	public void hotel_view() throws InterruptedException
	{
		//travelhope hotels
		driver.findElement(By.xpath("//a[contains(text(),'Travelhope Hotels')]")).click();
		//bookings
		driver.findElement(By.xpath("//ul[@id='TravelhopeHotels']//a[contains(text(),'Bookings')]")).click();
		//view
		driver.findElement(By.xpath("//a[@class='btn btn-default btn-xcrud btn btn-primary']")).click();
		
	}

	@Test(priority=2)
	public void remove()
	{
		//travelhope hotels
		driver.findElement(By.xpath("//a[contains(text(),'Travelhope Hotels')]")).click();
		//bookings
		driver.findElement(By.xpath("//ul[@id='TravelhopeHotels']//a[contains(text(),'Bookings')]")).click();
		//remove
		driver.findElement(By.xpath("//a[@class='xcrud-action btn btn-danger btn-xcrud']")).click();
		//pop-up
		driver.switchTo().alert().dismiss();
}
	
	@AfterTest
	public void close()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
}