import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.phptravels.net/demo/admin");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("abc");
	}

}
