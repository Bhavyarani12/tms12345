import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class search_hotel_user {

	
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
	public void search_hotel() throws InterruptedException
	
	{

		
		//search
		driver.findElement(By.xpath("//span[contains(text(),'Hotels')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Search by Hotel or City Name')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[18]/div[1]/input[1]")).sendKeys("Indigo");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'Bay Lodge, Mozambique')]")).click();
		Thread.sleep(2000);
		//checking
		driver.findElement(By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']")).sendKeys("11/09/2019");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[13]//tr[3]//td[4]")).click();
		Thread.sleep(1000);
		//checkout
		driver.findElement(By.xpath("//input[@placeholder='Check out']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[14]//tr[3]//td[5]")).click();
		Thread.sleep(1000);
     	
		//search
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-lg btn-block btn-primary pfb0 loader')]")).click();
		Thread.sleep(1000);
	}
	
	
	
	
}

