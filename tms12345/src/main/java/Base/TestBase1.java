package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import Util.TestUtil1;

public class TestBase1 {

	public static WebDriver driver;
	public static Properties prop;
	
	 public TestBase1() {
		 
	try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Bhavya\\eclipse-workspace\\tms12345\\src\\main\\java\\Config\\Config1.properties");
	prop.load(ip);
	
	} catch (FileNotFoundException e) {
		e.printStackTrace();
			
	} catch (IOException e) {
		e.printStackTrace();
	}
		 
	 }
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe ");	
			driver=new FirefoxDriver();
		}
				
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil1.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil1.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	
	
	}
		
	}
	
	
	



	


