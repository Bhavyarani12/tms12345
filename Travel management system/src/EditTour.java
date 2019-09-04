import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditTour {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://www.phptravels.net/admin/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//form[@class='form-signin form-horizontal wow fadeIn animated animated']//input[@placeholder='Email']")).sendKeys("admin@phptravels.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("demoadmin");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block ladda-button fadeIn animated']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[3]/ul[1]/li[9]/a[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//ul[@id='Tours']//a[contains(text(),'Tours')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//tr[1]//td[1]//div[1]//ins[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Spectaculars Of The Nile 3 Nights')]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@id='GENERAL']//input[@placeholder='Tour Name']")).sendKeys("Spectaculars Of The Nile 3 Nights  123");
		Thread.sleep(1000);
	}

}
