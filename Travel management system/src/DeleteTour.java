
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class DeleteTour {
	
	WebDriver driver;
	
	@BeforeTest
   public  void main(String[] args) throws InterruptedException, IOException {
		
		//start browser
		  
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.phptravels.net/admin/");
		driver.manage().window().maximize();

		
		
		
	}
	
	@Test(priority=0)
	public void login() throws InterruptedException
	{
		//login
		driver.findElement(By.xpath("//form[@class='form-signin form-horizontal wow fadeIn animated animated']//input[@placeholder='Email']")).sendKeys("admin@phptravels.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("demoadmin");
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block ladda-button fadeIn animated']")).click();
		Thread.sleep(5000);
		
		
	}
	
	@Test(priority=1)
	public void TMS()
	{
		driver.findElement(By.xpath("//body[contains(@class,'pace-done')]/div[@class='wrapper']/nav[@id='sidebar']/div[@class='social-sidebar']/ul[@id='social-sidebar-menu']/li[9]/a[1]")).click();
		driver.findElement(By.xpath("//ul[@id='Tours']//a[contains(text(),'Tours')]")).click();
		driver.findElement(By.xpath("//tr[1]//td[1]//div[1]//ins[1]")).click();
	
	}
	@AfterTest
	public void close()
	{
	
		driver.close();
	}
		
	



		
}
	


