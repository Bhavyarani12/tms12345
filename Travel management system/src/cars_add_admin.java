import java.awt.RenderingHints.Key;
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

public class cars_add_admin {
	
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

	
	

	//pick up location//
	driver.findElement(By.xpath("//div[@id='s2id_pickuplocationlist1']//span[contains(@class,'select2-chosen')][contains(text(),'Enter Location')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@id='select2-drop']//input[contains(@class,'select2-input')]")).sendKeys("Bang");
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//div[contains(text(),'alore, India')]")).click();
	Thread.sleep(1000);
	
//	//drop up location
//	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[12]/div[2]/div[1]/a[1]/span[1]")).click();
//	Thread.sleep(1000);
//    driver.findElement(By.xpath("//div[@id='select2-drop']//input[@class='select2-input']")).sendKeys("Mum");
//    Thread.sleep(1000);
//    driver.findElement(By.xpath("//div[@class='select2-result-label']")).click();
//    Thread.sleep(1000);
//    //price
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
	
	
	
	
		
}
