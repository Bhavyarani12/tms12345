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

public class search_tour_user {

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
	public void search() throws InterruptedException
	{
		//TOURS
	driver.findElement(By.xpath("//div[@id='body-section']//li[3]//a[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='s2id_autogen3']//a[@class='select2-choice select2-default']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(text(),'Big Bus Tour of Dubai')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='tchkin']//input[@placeholder='Check in']")).clear();
	driver.findElement(By.xpath("//div[@id='tchkin']//input[@placeholder='Check in']")).sendKeys("10/09/2019");
	driver.findElement(By.xpath("//td[contains(@class,'active')][contains(text(),'10')]")).click();
	driver.findElement(By.xpath("//select[@id='adults']/option[2]")).click();
	driver.findElement(By.xpath("//select[@id='tourtype']/option[2]")).click();
	driver.findElement(By.xpath("//div[@id='tours']//button[contains(@class,'btn-primary btn btn-lg btn-block pfb0 loader')][contains(text(),'Search')]")).click();
	
	
	
	


}
}
