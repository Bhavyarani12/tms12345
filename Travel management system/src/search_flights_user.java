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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class search_flights_user {

WebDriver driver;
	
	
	@BeforeTest
	public void startbrowser() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C://ChromeDriver.exe");
        driver=new ChromeDriver();
        
        driver.get("https://www.phptravels.net/");
        driver.manage().window().maximize();
        
      //Screenshot and title
   	 
   	 TakesScreenshot ts=(TakesScreenshot)driver;
   	 File file=ts.getScreenshotAs(OutputType.FILE);
   	 FileUtils.copyFile(file, new File("D:\\Screenshot\\fb"));
   	 
   	 
   	String actualtitle=driver.getTitle();
	  Thread.sleep(1000);
	
   	
	}
	
	@Test(priority=0)
	public void search_flight() throws InterruptedException
	{
		//flights
		driver.findElement(By.xpath("/html[1]/body[1]/div[5]/section[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(2000);
		//radiobutton
		driver.findElement(By.xpath("/html[1]/body[1]/div[5]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/form[1]/div[9]/div[2]/div[1]/div[1]/ins[1]")).click();
		//enter location
		driver.findElement(By.xpath("//div[@id='s2id_destination']//span[@class='select2-chosen'][contains(text(),'Enter Location')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[18]/div[1]/input[1]")).sendKeys("Dubai Intl Arpt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='select2-result-label']")).click();
		Thread.sleep(2000);
		//enter location
		driver.findElement(By.xpath("//span[contains(text(),'Enter Location')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[19]/div[1]/input[1]")).sendKeys("Hubli Arpt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='select2-result-label']")).click();
		Thread.sleep(2000);
	
	
		
		
		
		
		//date
		driver.findElement(By.xpath("//input[@id='departure']")).clear();
		driver.findElement(By.xpath("//input[@id='departure']")).sendKeys("2019/09/12");
		driver.findElement(By.xpath("//div[15]//tr[3]//td[5]")).click();
		//guests
		driver.findElement(By.xpath("//div[@class='col-md-1 form-group go-right col-xs-12']//input[@placeholder='0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='sumManualPassenger']")).click();
		//search button
		driver.findElement(By.xpath("/html[1]/body[1]/div[5]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/form[1]/div[6]/button[1]")).click();
		Thread.sleep(2000);
	
	}
	
	@Test(priority=1)
	public void book_flight() throws InterruptedException
	{
		//book now
		driver.findElement(By.xpath("//form[@id='form_1']//span[@class='ladda-label'][contains(text(),'Book Now')]")).click();
		//email
		driver.findElement(By.xpath("//div[@id='login']//input[@id='email']")).clear();
		driver.findElement(By.xpath("//div[@id='login']//input[@id='email']")).sendKeys("admin@phptravels.com");
		//pswrd
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("demoadmin");
		//login
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-block']")).click();
		
	//guest book
		driver.findElement(By.xpath("//a[@class='btn btn-default btn-block']")).click();
		
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		   js1.executeScript("window.scrollBy(0,600)");
		   System.out.println("scrolled Down");
		   Thread.sleep(1000);
		   
		   //title
		   driver.findElement(By.xpath("//select[@id='title']/option[2]")).click();
		   	//name
		   driver.findElement(By.xpath("//input[@id='name']")).sendKeys("bhavya");
		   //surname
		   driver.findElement(By.xpath("//input[@id='surname']")).sendKeys("hosamani");
		   //email
		   driver.findElement(By.xpath("//div[@class='col-md-4']//input[@id='email']")).sendKeys("bhavyahosamani89@gmail.com");
		   //phone
		   driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7896543456");
		   //bday
		   driver.findElement(By.xpath("//input[@id='birthday']")).sendKeys("1996-12-23");
		   //card
		   driver.findElement(By.xpath("//input[@id='cardno']")).sendKeys("1234");
		   //exprtn
		   driver.findElement(By.xpath("//input[@id='expiration']")).sendKeys("2020-12-30");
		   
		   JavascriptExecutor js12=(JavascriptExecutor)driver;
		   js12.executeScript("window.scrollBy(0,200)");
		   System.out.println("scrolled Down");
		   Thread.sleep(1000);
		   
//		  //county
//		   driver.findElement(By.xpath("//a[@class='select2-choice']")).sendKeys("india");
//		   driver.findElement(By.xpath("//li[@class='select2-results-dept-0 select2-result select2-result-selectable']//div[@class='select2-result-label']")).click();
//		   //payment
//		   driver.findElement(By.xpath("//li[@class='select2-results-dept-0 select2-result select2-result-selectable']//div[@class='select2-result-label']/option[4]")).click();
//		   driver.findElement(By.xpath("//input[@id='card-number']")).sendKeys("2345");
//		   driver.findElement(By.xpath("//select[@id='expiry-month']/optio[3]")).click();
//		   driver.findElement(By.xpath("//select[@id='expiry-year']/option[2]")).click();
//		   driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys("102342");
//		 
//		   //
		   
		   
	
	
	}
}