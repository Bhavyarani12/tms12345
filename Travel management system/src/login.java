import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//open browser
		
		driver.get("https://www.phptravels.net/admin/");
		Thread.sleep(1000);
		
		// login 
		
		driver.findElement(By.xpath("//form[@class='form-signin form-horizontal wow fadeIn animated animated']//input[@placeholder='Email']")).sendKeys("admin@phptravels.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Minds123");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block ladda-button fadeIn animated']")).click();
		Thread.sleep(1000);
		
		driver.close();
		

	}

}
