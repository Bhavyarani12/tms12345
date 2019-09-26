package TestCases;

import java.awt.print.Book;

import org.testng.ReporterConfig.Property;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ToursPage;
import Pages.TravelHopeFlightsPage;
import Pages.TravelHopeHotelsPage;

public class TravelHopeHotelPageTest extends TestBase {

	LoginPage loginpage;
    HomePage homepage;
    TravelHopeHotelsPage travelhopehotelspage;
	
	public TravelHopeHotelPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
     @Test
	public void HotelsPage() throws InterruptedException {
    	 
		homepage = homepage.ClickOnTravelHopeHotels();
		Thread.sleep(1000);
		travelhopehotelspage = new TravelHopeHotelsPage();
		Thread.sleep(1000);
		travelhopehotelspage.HotelsPage("Chennai");
	}
}


	
	
		
	

