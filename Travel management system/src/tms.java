import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.File;

public class tms {
	
	WebDriver driver;
	
	@BeforeTest
	public void startbrowser() {
		
		//start browser
	
	System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	driver = new ChromeDriver();
	
	}
	
	@Test
	 
	
	
	public void testcases() throws InterruptedException {
	
	//maximize window
	
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	//Login
	
	driver.get("https://www.phptravels.net/admin/");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//form[@class='form-signin form-horizontal wow fadeIn animated animated']//input[@placeholder='Email']")).sendKeys("admin@phptravels.com");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("demoadmin");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block ladda-button fadeIn animated']")).click();
	Thread.sleep(1000);
	
	//TOURS
	
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
	
	
	driver.findElement(By.xpath("//select[@id='isfeatured']/option[2]")).click();
	Thread.sleep(1000);
	
	//scroll down

	
	JavascriptExecutor js11=(JavascriptExecutor)driver;
	js11.executeScript("window.scrollBy(0,800)");
	System.out.println("scrolled Down");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//select[@name='deposittype']/option[01]")).click();
	Thread.sleep(1000);
	
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
	
	//Inclusions
	
	driver.findElement(By.xpath("//a[contains(text(),'Inclusions')]")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[@id='INCLUSIONS']//div[@class='icheckbox_square-grey']//ins[@class='iCheck-helper']")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//button[@id='add']")).click();
	Thread.sleep(1000);
	
	//Exclusions
	
	driver.findElement(By.xpath("//a[contains(text(),'Exclusions')]")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[@id='EXCLUSIONS']//div[@class='icheckbox_square-grey']//ins[@class='iCheck-helper']")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//button[@id='add']")).click();
	Thread.sleep(1000);
	
	//Meta Info
	
	driver.findElement(By.xpath("//a[contains(text(),'Meta Info')]")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@placeholder='Meta title']")).sendKeys("Hawa Mahal  is a palace in Jaipur, India. Made with the red and pink sandstone, the palace sits on the edge of the City Palace, Jaipur, and extends to the Zenana, or women's chambers");
	Thread.sleep(1000);

	driver.findElement(By.xpath("//input[@placeholder='Meta keywords']")).sendKeys("Good");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//textarea[@placeholder='Meta description here...']")).sendKeys("nice");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//button[@id='add']")).click();
	Thread.sleep(1000);
	 
	//policy
	
	
	driver.findElement(By.xpath("//a[contains(text(),'Policy')]")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[@id='s2id_autogen15']//ul[@class='select2-choices']")).sendKeys("abc");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//textarea[@placeholder='Privacy Policy...']")).sendKeys("def");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//button[@id='add']")).click();
	Thread.sleep(1000);
	
	//Contact
	
	driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@placeholder=\"Tour's Email\"]")).sendKeys("abc@gmail.com");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@placeholder='Website']")).sendKeys("def@yahoo.com");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("08472089345");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@placeholder='Address']")).sendKeys("Jaipur");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//button[@id='add']")).click();
	Thread.sleep(1000);
	
		}
	
	@AfterTest()
	public void close() {
		driver.close();
	}

}


