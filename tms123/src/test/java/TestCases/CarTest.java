package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.Cars;
import Pages.HomePage;
import Pages.LoginPage;

public class CarTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	Cars cars;
	
	public CarTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
	initialization();
	loginpage = new LoginPage();
	homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test
	public void Cars() throws InterruptedException {
	homepage = homepage.ClickOnCars();
	Thread.sleep(1000);
	cars = new Cars();
    Thread.sleep(1000);
    cars.AddCars("Maruti Suzuki", "Luxury", "Bangalore", "Dubai", "2500", "28/09/2019", "30/09/2019");
    
	
	

}
}