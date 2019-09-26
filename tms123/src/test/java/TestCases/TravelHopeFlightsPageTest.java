package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.TravelHopeFlightsPage;

public class TravelHopeFlightsPageTest extends TestBase{
	
	LoginPage loginpage;
    HomePage homepage;
    TravelHopeFlightsPage travelhopeflightspage;
    
    public TravelHopeFlightsPageTest() {
		super();
	}
    
    @BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
     @Test
	public void FlightsPage() throws InterruptedException {
    	
		homepage = homepage.ClickOnTravelHopeFlights();
		Thread.sleep(1000);
		travelhopeflightspage = new TravelHopeFlightsPage();
		Thread.sleep(1000);
		travelhopeflightspage.FlightsPage("BLR");
    }
}

	



	
