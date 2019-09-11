import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

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

public class TMS_ADMIN {
	
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
	public void login() throws InterruptedException { 
	
		//Login
	
	driver.findElement(By.xpath("//form[@class='form-signin form-horizontal wow fadeIn animated animated']//input[@placeholder='Email']")).sendKeys("admin@phptravels.com");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("demoadmin");
	driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block ladda-button fadeIn animated']")).click();
	Thread.sleep(1000);
	
	}
	
	//ACCOUNTS
	@Test(priority=1)
	public void add_admin()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		
		//add admin
		 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[3]/ul[1]/li[5]/ul[1]/li[1]/a[1]")).click();
		//add
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Bhavya");
		driver.findElement(By.xpath("//input[@placeholder='Last name']")).sendKeys("Hosamani");
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("www.admin@phptravels.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("demoadmin");
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("7411247883");
	    driver.findElement(By.xpath("//span[@class='select2-chosen']")).click();
	    driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/input[1]")).sendKeys("India");
	    driver.findElement(By.xpath("/html[1]/body[1]/div[4]/ul[1]/li[2]/div[1]")).click();
	   
		driver.findElement(By.xpath("//select[contains(@name,'status')]/option[1]")).click();
		//add hotels
		driver.findElement(By.xpath("//body[contains(@class,'pace-done')]//div[contains(@class,'panel-body')]//div[contains(@class,'panel-body')]//div[1]//div[1]//div[2]//ul[1]//li[1]//label[1]//div[1]//ins[1]")).click();
		//add tours
		driver.findElement(By.xpath("//body[contains(@class,'pace-done')]//div[contains(@class,'panel-body')]//div[contains(@class,'panel-body')]//div[1]//div[1]//div[2]//ul[1]//li[2]//label[1]//div[1]//ins[1]")).click();
		//add cars
		driver.findElement(By.xpath("//body[contains(@class,'pace-done')]//div[contains(@class,'panel-body')]//div[contains(@class,'panel-body')]//div[1]//div[1]//div[2]//ul[1]//li[3]//label[1]//div[1]")).click();
		//add bookings
		driver.findElement(By.xpath("//body[contains(@class,'pace-done')]//div[contains(@class,'panel-body')]//div[contains(@class,'panel-body')]//div[1]//div[1]//div[2]//ul[1]//li[4]//label[1]//div[1]//ins[1]")).click();
		//add locations
		driver.findElement(By.xpath("//body[contains(@class,'pace-done')]//div[contains(@class,'panel-body')]//div[contains(@class,'panel-body')]//div[1]//div[1]//div[2]//ul[1]//li[5]//label[1]//div[1]//ins[1]")).click();
		//edit hotels
		driver.findElement(By.xpath("//div[contains(@class,'panel-body')]//div[2]//div[1]//div[2]//ul[1]//li[1]//label[1]//div[1]//ins[1]")).click();
		//edit tours
		driver.findElement(By.xpath("//div[contains(@class,'panel-body')]//div[2]//div[1]//div[2]//ul[1]//li[2]//label[1]//div[1]//ins[1]")).click();
		//edit cars
	    driver.findElement(By.xpath("//div[contains(@class,'panel-body')]//div[2]//div[1]//div[2]//ul[1]//li[3]//label[1]//div[1]//ins[1]")).click();
	    //edit bookings
	    driver.findElement(By.xpath("//div[contains(@class,'panel-body')]//div[2]//div[1]//div[2]//ul[1]//li[4]//label[1]//div[1]//ins[1]")).click();
	    //edit locations
	    driver.findElement(By.xpath("//div[contains(@class,'panel-body')]//div[2]//div[1]//div[2]//ul[1]//li[5]//label[1]//div[1]//ins[1]")).click();
	    //delete hotels
	    driver.findElement(By.xpath("//div[3]//div[1]//div[2]//ul[1]//li[1]//label[1]//div[1]//ins[1]")).click();
	    //delete tours
	    driver.findElement(By.xpath("//div[3]//div[1]//div[2]//ul[1]//li[2]//label[1]//div[1]//ins[1]")).click();
	    //delete cars
	    driver.findElement(By.xpath("//div[3]//div[1]//div[2]//ul[1]//li[3]//label[1]//div[1]//ins[1]")).click();
	    //delete bookings
	    driver.findElement(By.xpath("//div[3]//div[1]//div[2]//ul[1]//li[4]//label[1]//div[1]//ins[1]")).click();
	    //delete locations
	    driver.findElement(By.xpath("//div[3]//div[1]//div[2]//ul[1]//li[5]//label[1]//div[1]//ins[1]")).click();
	    
	    //submit
	    driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]")).click();
	}	
		
	//TRAVELHOPE HOTELS
	@Test(priority=2)
	public void hotel_view() throws InterruptedException
	{
		//travelhope hotels
		driver.findElement(By.xpath("//a[contains(text(),'Travelhope Hotels')]")).click();
		Thread.sleep(1000);
		//bookings
		driver.findElement(By.xpath("//ul[@id='TravelhopeHotels']//a[contains(text(),'Bookings')]")).click();
		Thread.sleep(1000);
		//view
		driver.findElement(By.xpath("//a[@class='btn btn-default btn-xcrud btn btn-primary']")).click();
		Thread.sleep(1000);
		
	}

	@Test(priority=3)
	public void remove() throws InterruptedException
	
	{
		//travelhope hotels
		driver.findElement(By.xpath("//a[contains(text(),'Travelhope Hotels')]")).click();
		Thread.sleep(1000);
		//bookings
		driver.findElement(By.xpath("//ul[@id='TravelhopeHotels']//a[contains(text(),'Bookings')]")).click();
		Thread.sleep(1000);
		//remove
		driver.findElement(By.xpath("//a[@class='xcrud-action btn btn-danger btn-xcrud']")).click();
		Thread.sleep(1000);
		//pop-up
		driver.switchTo().alert().dismiss();
}
	
  //TRAVELHOPE FLIGHTS
	
	@Test(priority=4)
	public void view_flight_booking() throws InterruptedException
	{
		//travelhope flights
		driver.findElement(By.xpath("//a[contains(text(),'Travelhope Flights')]")).click();
		Thread.sleep(1000);
		//bookings
		driver.findElement(By.xpath("//ul[@id='TravelhopeFlights']//a[contains(text(),'Bookings')]")).click();
		Thread.sleep(1000);
		//invoice(view)
		driver.findElement(By.xpath("//tr[1]//td[14]//span[1]//a[1]")).click();
		Thread.sleep(1000);
	}
	
	@Test(priority=5)
	public void remove_flight_booking() throws InterruptedException
	{
		//travelhope flights
		driver.findElement(By.xpath("//a[contains(text(),'Travelhope Flights')]")).click();
		Thread.sleep(1000);
		//bookings
		driver.findElement(By.xpath("//ul[@id='TravelhopeFlights']//a[contains(text(),'Bookings')]")).click();
		Thread.sleep(1000);
		//remove
		driver.findElement(By.xpath("//tr[1]//td[14]//span[1]//a[2]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
	}

	//TOURS
	
	@Test(priority=6)
	public void add_tours() throws InterruptedException {
		
	
	
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
	
	driver.findElement(By.xpath("//span[@class='select2-chosen'][contains(text(),'Select')]")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[contains(text(),'Private')]")).click();
	Thread.sleep(1000);
	
	
	
	//scroll down


		JavascriptExecutor js11=(JavascriptExecutor)driver;
	    js11.executeScript("window.scrollBy(0,600)");
		System.out.println("scrolled Down");
	    Thread.sleep(1000);	

	    
	    //location
	    driver.findElement(By.xpath("//div[@id='s2id_locationlist6']//span[@class='select2-chosen'][contains(text(),'Enter Location')]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@class='select2-input select2-focused']")).sendKeys("Jaipur");
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//div[@class='select2-result-label']")).click();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	
	
    driver.findElement(By.xpath("//input[@name='depositvalue']")).sendKeys("345.54");
	
	driver.findElement(By.xpath("//select[@name='taxtype']/option[02]")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@name='taxvalue']")).sendKeys("2345");
	Thread.sleep(1000);
	 
	driver.findElement(By.xpath("//input[@id='mapaddress']")).sendKeys("Hawa Mahal Rd, Badi Choupad, J.D.A. Market, Pink City, Jaipur, Rajasthan 302002");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@id='latitude']")).sendKeys("26.9239° N");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@id='longitude']")).sendKeys("75.8267° E");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//button[@id='add']")).click();
	Thread.sleep(1000);
	}
	
	@Test(priority=7)
	public void edit_tours() throws InterruptedException {
		
	
	//Tours
   driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[3]/ul[1]/li[9]/a[1]")).click();
   //tours(in)
   driver.findElement(By.xpath("//ul[@id='Tours']//a[contains(text(),'Tours')]")).click();
   //edit
   driver.findElement(By.xpath("//tr[4]//td[11]//span[1]//a[1]")).click();
   //tour name clear
   driver.findElement(By.xpath("//div[@id='GENERAL']//input[@placeholder='Tour Name']")).clear();
   //new tour name
   driver.findElement(By.xpath("//div[@id='GENERAL']//input[@placeholder='Tour Name']")).sendKeys("Delhi");
   
   JavascriptExecutor js1=(JavascriptExecutor)driver;
   js1.executeScript("window.scrollBy(0,800)");
   System.out.println("scrolled Down");
   Thread.sleep(1000);	
   
   //submit
   driver.findElement(By.xpath("//button[@id='update']")).click();
	}
	
	@Test(priority=8)
	public void delete_tours() throws InterruptedException {
		
	
	//Tours
   driver.findElement(By.xpath("//body[contains(@class,'pace-done')]/div[contains(@class,'wrapper')]/nav[@id='sidebar']/div[contains(@class,'social-sidebar')]/ul[@id='social-sidebar-menu']/li[9]/a[1]")).click();
   //tours(in)
   driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[3]/ul[1]/li[9]/ul[1]/li[1]/a[1]")).click();
   //delete (old and new Delhi city)
   driver.findElement(By.xpath("//a[@id='33']")).click();
   //pop-up message
   driver.switchTo().alert().accept();
	}
	
	@Test(priority=9)
	public void search() throws InterruptedException
	{
		//Tours
		driver.findElement(By.xpath("//body[contains(@class,'pace-done')]/div[@class='wrapper']/nav[@id='sidebar']/div[@class='social-sidebar']/ul[@id='social-sidebar-menu']/li[9]/a[1]")).click();
		//tours(in)
		driver.findElement(By.xpath("//ul[@id='Tours']//a[contains(text(),'Tours')]")).click();
		
		   JavascriptExecutor js1=(JavascriptExecutor)driver;
		   js1.executeScript("window.scrollBy(0,900)");
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
		
	//CARS
	
	@Test(priority=10)
	public void edit_car() throws InterruptedException
	{
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[3]/ul[1]/li[10]/a[1]")).click();
			//cars
			driver.findElement(By.xpath("//ul[@id='Cars']//li[1]//a[1]")).click();
			//edit
			driver.findElement(By.xpath("//tr[1]//td[12]//span[1]//a[1]")).click();
			//car name
			driver.findElement(By.xpath("//input[@placeholder='Car Name']")).clear();
			//new car name
			driver.findElement(By.xpath("//input[@placeholder='Car Name']")).sendKeys("Maruti suzuki swift");
			
			JavascriptExecutor js1=(JavascriptExecutor)driver;
		    js1.executeScript("window.scrollBy(0,2000)");
			System.out.println("scrolled Down");
		    Thread.sleep(1000);	

			driver.findElement(By.xpath("//button[@id='update']")).click();
			
	}

	@Test(priority=11)
	public void delete_car() throws InterruptedException
	{
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[3]/ul[1]/li[10]/a[1]")).click();
		Thread.sleep(1000);
		//cars
		driver.findElement(By.xpath("//ul[@id='Cars']//li[1]//a[1]")).click();
		Thread.sleep(1000);
		//delete
		driver.findElement(By.xpath("//a[@id='7']")).click();
		Thread.sleep(1000);
		//pop-up message
       driver.switchTo().alert().accept();         
	}
	
	@Test(priority=12)
	public void search_Car() throws InterruptedException
	{
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[3]/ul[1]/li[10]/a[1]")).click();
		//cars
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[3]/ul[1]/li[10]/ul[1]/li[1]/a[1]")).click();
		JavascriptExecutor js1=(JavascriptExecutor)driver;
	    js1.executeScript("window.scrollBy(0,800)");
		System.out.println("scrolled Down");
	    Thread.sleep(1000);	

		//search button
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/a[1]")).click();
		//enter name of car
		driver.findElement(By.xpath("//input[@name='phrase']")).sendKeys("Ford Focus 2014");
		//GO
		driver.findElement(By.xpath("//a[@class='xcrud-action btn btn-primary']")).click();
		}
	@AfterTest
	public void close()
	{
		driver.close();
		
	}
}





	
	

	
		