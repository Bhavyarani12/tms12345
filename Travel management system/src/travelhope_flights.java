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

public class travelhope_flights {

WebDriver driver1;
	
	@BeforeTest
	public void startbrowser1() throws InterruptedException, IOException {
		
		//start browser
	
	System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	driver1 = new ChromeDriver();
	
	driver1.get("https://www.phptravels.net/admin/");
	driver1.manage().window().maximize();
	
	
	//Screenshot and title
	 
	 TakesScreenshot ts=(TakesScreenshot)driver1;
	 File file=ts.getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(file, new File("D:\\Screenshot\\fb"));
	 
	 
	  String actualtitle=driver1.getTitle();
	  Thread.sleep(1000);
	
	
	}
	
	@Test(priority=0) 
	public void testcases() throws InterruptedException { 
	
		//Login
	
	driver1.findElement(By.xpath("//form[@class='form-signin form-horizontal wow fadeIn animated animated']//input[@placeholder='Email']")).sendKeys("admin@phptravels.com");
	driver1.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("demoadmin");
	driver1.findElement(By.xpath("//button[@class='btn btn-primary btn-block ladda-button fadeIn animated']")).click();
	Thread.sleep(5000);
	}
	
	
	
	@Test(priority=1)
	public void view_flight_booking()
	{
		//travelhope flights
		driver1.findElement(By.xpath("//a[contains(text(),'Travelhope Flights')]")).click();
		//bookings
		driver1.findElement(By.xpath("//ul[@id='TravelhopeFlights']//a[contains(text(),'Bookings')]")).click();
		//invoice(view)
		driver1.findElement(By.xpath("//tr[1]//td[14]//span[1]//a[1]")).click();
	}
	
	@Test(priority=2)
	public void remove_flight_booking()
	{
		//travelhope flights
		driver1.findElement(By.xpath("//a[contains(text(),'Travelhope Flights')]")).click();
		//bookings
		driver1.findElement(By.xpath("//ul[@id='TravelhopeFlights']//a[contains(text(),'Bookings')]")).click();
		//remove
		driver1.findElement(By.xpath("//tr[1]//td[14]//span[1]//a[2]")).click();
		driver1.switchTo().alert().dismiss();
	}

}

	
	

