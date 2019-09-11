import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class admin_car {

	
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
	Thread.sleep(5000);
	}
	
	@Test(priority=1)
	public void add_car() throws InterruptedException
	{
	//CARS
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[3]/ul[1]/li[10]/a[1]")).click();
	//cars
	driver.findElement(By.xpath("//ul[@id='Cars']//li[1]//a[1]")).click();
	//add cars
	driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
	//General info
	//status
	driver.findElement(By.xpath("//select[@name='carstatus']/option[1]")).click();
	//car name
	driver.findElement(By.xpath("//input[@placeholder='Car Name']")).sendKeys("New Maruti Suzuki Swift");
	
	JavascriptExecutor js11=(JavascriptExecutor)driver;
    js11.executeScript("window.scrollBy(0,200)");
	System.out.println("scrolled Down");
    Thread.sleep(1000);	

	//car stars
	driver.findElement(By.xpath("//select[@name='carstars']")).sendKeys("4");
	//passengers
	driver.findElement(By.xpath("//select[contains(@name,'passangers')]")).click();
	driver.findElement(By.xpath("//select[contains(@name,'passangers')]/option[1]")).click();
	//car doors
	driver.findElement(By.name("doors")).click();
	driver.findElement(By.xpath("//select[contains(@name,'doors')]/option[1]")).click();

	//transmision
	driver.findElement(By.xpath("//select[contains(@name,'doors')]")).click();
	driver.findElement(By.xpath("//select[contains(@name,'doors')]/option[1]")).click();
	//Baggage
	driver.findElement(By.xpath("//select[contains(@name,'doors')]")).click();
	driver.findElement(By.xpath("//select[contains(@name,'doors')]/option[2]")).click();
	//Airport pickup
	driver.findElement(By.xpath("//select[contains(@name,'airportpickup')]")).click();
	driver.findElement(By.xpath("//select[contains(@name,'airportpickup')]/option[1]")).click();
	
	JavascriptExecutor js1=(JavascriptExecutor)driver;
    js1.executeScript("window.scrollBy(0,200)");
	System.out.println("scrolled Down");
    Thread.sleep(1000);	

	
	

//	//pick up location//
//	driver.findElement(By.xpath("//div[@id='s2id_pickuplocationlist1']//span[contains(@class,'select2-chosen')][contains(text(),'Enter Location')]")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//div[@id='select2-drop']//input[contains(@class,'select2-input')]")).sendKeys("Bangalore");
//	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
//	
//	driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/input[1]")).sendKeys(Keys.ENTER);
//	Thread.sleep(1000);
//	
//	//drop up location
//	driver.findElement(By.xpath("//div[@id='s2id_pickuplocationlist2']//span[@class='select2-chosen'][contains(text(),'Enter Location')]")).click();
//    driver.findElement(By.xpath("//div[@id='select2-drop']//input[@class='select2-input']")).sendKeys("Mumbai");
//    driver.findElement(By.xpath("//div[@class='select2-result-label']")).click();
    //price
//    driver.findElement(By.xpath("//input[@name='locations[1]'")).sendKeys("100");
//    
    JavascriptExecutor js12=(JavascriptExecutor)driver;
    js12.executeScript("window.scrollBy(0,800)");
	System.out.println("scrolled Down");
    Thread.sleep(1000);	

    //featured
    driver.findElement(By.xpath("//select[@id='isfeatured']/option[2]")).click();
    //from
    driver.findElement(By.xpath("//input[@placeholder='From']")).click();
    driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("10/09/2019");
    driver.findElement(By.xpath("//td[contains(@class,'active')][contains(text(),'10')]")).click();
//    //to
//    driver.findElement(By.xpath("//input[contains(@placeholder,'To')]")).click();
//    driver.findElement(By.xpath("//input[contains(@placeholder,'To')]")).clear();
//    driver.findElement(By.xpath("//input[contains(@placeholder,'To')]")).sendKeys("12/09/2019");
//    driver.findElement(By.xpath("//td[contains(@class,'active')][contains(text(),'12')]")).click();
    //deposit
    driver.findElement(By.xpath("//select[@name='deposittype']/option[1]")).click();
    driver.findElement(By.xpath("//input[contains(@name,'depositvalue')]")).sendKeys("1500");
    //vax tax
    driver.findElement(By.xpath("//select[contains(@name,'taxtype')]/option[2]")).click();
    driver.findElement(By.xpath("//input[contains(@name,'taxvalue')]")).sendKeys("10");
    //submit
    driver.findElement(By.xpath("//button[@id='add']")).click();
	}
	
    
  	 
  	
  	@Test(priority=2)
  	public void edit_car() throws InterruptedException
  	{
  //car edit
  		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[3]/ul[1]/li[10]/a[1]")).click();
  		//cars
  		driver.findElement(By.xpath("//ul[@id='Cars']//li[1]//a[1]")).click();
  		//edit
  		driver.findElement(By.xpath("//tr[1]//td[12]//span[1]//a[1]")).click();
  		//car name
  		driver.findElement(By.xpath("//input[@placeholder='Car Name']")).clear();
  		//new car name
  		driver.findElement(By.xpath("//input[@placeholder='Car Name']")).sendKeys("Maruti suzuki swift");
  		
  		JavascriptExecutor js13=(JavascriptExecutor)driver;
  	    js13.executeScript("window.scrollBy(0,2000)");
  		System.out.println("scrolled Down");
  	    Thread.sleep(1000);	

  		driver.findElement(By.xpath("//button[@id='update']")).click();
  	}
  		
  		
  		@Test(priority=3)
  		public void delete_car() throws InterruptedException
  		{
  	//CARS DELETE
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
  		
  		 @Test(priority=4)
  	    public void search_car1() throws InterruptedException
  	    {
  	    	//search button
  	    	
  	    	    JavascriptExecutor js12=(JavascriptExecutor)driver;
  	    	    js12.executeScript("window.scrollBy(0,400)");
  	    		System.out.println("scrolled Down");
  	    	    Thread.sleep(1000);	
  	    	    
  	  	driver.findElement(By.xpath("//a[@class='xcrud-search-toggle btn btn-default']")).click();
  	  	//enter name of car
  	  	driver.findElement(By.xpath("//input[@name='phrase']")).sendKeys("Nisan Micra 2011");
  	  	//GO
  	  	driver.findElement(By.xpath("//a[@class='xcrud-action btn btn-primary']")).click();
  	    }

	

	
}
