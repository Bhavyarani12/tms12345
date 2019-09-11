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

public class search_car_user {

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
	public void search_car() throws InterruptedException
	{
	
		//car
		driver.findElement(By.xpath("//div[@id='body-section']//li[4]//a[1]")).click();
		 Thread.sleep(1000);
	    //pickup location
		driver.findElement(By.xpath("/html[1]/body[1]/div[5]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/a[1]/span[1]")).click();
		Thread.sleep(1000);
		//dropup location
		driver.findElement(By.xpath("//div[contains(text(),'Nile Egypt')]")).click();
		Thread.sleep(2000);
		//time
		driver.findElement(By.xpath("//select[@name='pickupTime']/option[4]")).click();
		Thread.sleep(2000);
		//time 
		driver.findElement(By.xpath("/html[1]/body[1]/div[5]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[6]/div[1]/select[1]/option[5]")).click();
		Thread.sleep(2000);
		//search
		driver.findElement(By.xpath("//div[@class='bgfade col-md-2 form-group go-right col-xs-12 search-button']//button[@class='btn-primary btn btn-lg btn-block pfb0 loader'][contains(text(),'Search')]")).click();
		Thread.sleep(1000);
		
		
	
	//book
	driver.findElement(By.xpath("//button[@class='btn btn-action loader loader btn-block br25']")).click();
	
	JavascriptExecutor js1=(JavascriptExecutor)driver;
    js1.executeScript("window.scrollBy(0,1500)");
	System.out.println("scrolled Down");
    Thread.sleep(1000);	
    
    //book now
    driver.findElement(By.xpath("//button[@class='btn btn-block btn-action btn-lg']")).click();
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

	}