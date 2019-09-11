import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Add_Admin {
	
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
	
	//Account
	
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
}
