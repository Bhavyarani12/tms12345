import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Book_Tour {
	
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
	public void book_tour() throws InterruptedException
	{
		JavascriptExecutor js1=(JavascriptExecutor)driver;
	    js1.executeScript("window.scrollBy(0,800)");
		System.out.println("scrolled Down");
	    Thread.sleep(1000);	
        
	    //SPECTACULARS OF THE NILE 3 NIGHTS
	    driver.findElement(By.xpath("//div[@class='row hotel-list image-box hotel listing-style1 add-clearfix featured_tours']//div[1]//article[1]//figure[1]//a[1]//img[1]")).click();
	   
	    JavascriptExecutor js11=(JavascriptExecutor)driver;
	    js11.executeScript("window.scrollBy(0,1400)");
		System.out.println("scrolled Down");
	    Thread.sleep(1000);	
	    
	    //date
	    driver.findElement(By.xpath("//input[@placeholder='Search']")).clear();
	    //enter date
	    driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys("11/09/2019");
	    //clicking on the given date
	    driver.findElement(By.xpath("//td[contains(@class,'active')]")).click();
	    driver.findElement(By.xpath("//select[@id='selectedAdults']/option[2]")).click();
	    driver.findElement(By.xpath("//select[@id='selectedChild']/option[1]")).click();
	    driver.findElement(By.xpath("//select[@id='selectedInfants']/option[1]")).click();
	    //Book now 
	    driver.findElement(By.xpath("//button[@class='btn btn-block btn-action btn-lg loader']")).click();
	    
	    //personal details
	    
	    driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Bhavya");
	    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Hosamani");
	    driver.findElement(By.xpath("//div[@class='col-md-5 col-xs-12']//input[@placeholder='Email']")).sendKeys("bhavyahosamani89@gmail.com");
	    driver.findElement(By.xpath("//input[@placeholder='Confirm Email']")).sendKeys("bhavyahosamani89@gmail.com");
	    driver.findElement(By.xpath("//input[@placeholder='Contact Number']")).sendKeys("7411247892");
	    driver.findElement(By.name("address")).sendKeys("vibhuti colony gulbarga");
	    //select country
	    driver.findElement(By.xpath("//a[@class='select2-choice']")).click();
	    driver.findElement(By.xpath("//a[@class='select2-choice']")).sendKeys("India");
	    //click on INDIA 
	    driver.findElement(By.xpath("//li[@class='select2-results-dept-0 select2-result select2-result-selectable']//span[@class='select2-match'][contains(text(),'India')]")).click();
	    
	    JavascriptExecutor js111=(JavascriptExecutor)driver;
	    js111.executeScript("window.scrollBy(0,1200)");
		System.out.println("scrolled Down");
	    Thread.sleep(1000);	

	    //confirm booking
	    driver.findElement(By.xpath("//button[@name='guest']")).click();

	}
	
	
	
	@AfterTest
	public void close()
	{
		driver.close();
		
	}
	    
	    
	   
	  
	  
		
	
}





