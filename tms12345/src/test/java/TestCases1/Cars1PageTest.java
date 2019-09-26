package TestCases1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase1;
import Pages.Cars1Page;
import Pages.HomePage1;
import Pages.HotelsPage;
import Pages.LoginPage1;

public class Cars1PageTest extends TestBase1 {
	//LoginPage1 loginPage1;
    HomePage1 homepage1;
	Cars1Page cars1page;
	
	
	public Cars1PageTest() {
		super();
	}
	
   @BeforeMethod
   public void setup() throws InterruptedException {
	   initialization();
	  // loginPage1 = new LoginPage1();
		//homepage1 = loginPage1.login(prop.getProperty("username"),prop.getProperty("password"));
	}
   
	
   
   @Test
   public void Cars1Page() throws InterruptedException {
	   
	   //homepage1 = homepage1.ClickOnCars();
	   //Thread.sleep(1000);
	   cars1page = new Cars1Page();
	   Thread.sleep(1000);
	   cars1page.Cars1Page("nile egypt", "malaysia");
	   Thread.sleep(1000);
	   
   
	
	}

}
