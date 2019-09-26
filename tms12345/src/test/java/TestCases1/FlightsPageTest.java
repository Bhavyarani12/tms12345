package TestCases1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase1;
import Pages.FlightsPage;
import Pages.HomePage1;
import Pages.HotelsPage;
import Pages.LoginPage1;

public class FlightsPageTest extends TestBase1 {
	//LoginPage1 loginPage1;
    HomePage1 homepage1;
	FlightsPage flightspage;
	
	
	public FlightsPageTest() {
		super();
	}
	
   @BeforeMethod
   public void setup() throws InterruptedException {
	   initialization();
	  // loginPage1 = new LoginPage1();
		//homepage1 = loginPage1.login(prop.getProperty("username"),prop.getProperty("password"));
	}
   
	
   
   @Test
   public void HotelsPage() throws InterruptedException {
	   
//	   homepage1 = homepage1.ClickOnFlights();
//	   Thread.sleep(1000);
	   flightspage = new FlightsPage();
	   Thread.sleep(1000);
	   flightspage.FlightsPage("delhi", "dubai");
	   Thread.sleep(1000);
	   
   
	
	}

}
