package TestCases1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase1;
import Pages.HomePage1;
import Pages.HotelsPage;
import Pages.LoginPage1;

public class HotelsPageTest extends TestBase1 {
	//LoginPage1 loginPage1;
    HomePage1 homepage1;
	HotelsPage hotelspage;
	
	
	public HotelsPageTest() {
		super();
	}
	
   @BeforeMethod
   public void setup() throws InterruptedException {
	   initialization();
	  // loginPage1 = new LoginPage1();
	// homepage1 = loginPage1.login(prop.getProperty("username"),prop.getProperty("password"));
	}
   
	
   
   @Test
   public void searchhotels() throws InterruptedException {
	   
	  // homepage1 = homepage1.ClickOnHotels();
	   //Thread.sleep(7000);
	   hotelspage = new HotelsPage();
	   Thread.sleep(6000);
	   hotelspage.Hotels("indigo","26/09/2019", "28/09/2019");
	   Thread.sleep(7000);
	   
   
	
	}

}
