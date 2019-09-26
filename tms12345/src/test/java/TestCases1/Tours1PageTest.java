package TestCases1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase1;
import Pages.HomePage1;
import Pages.HotelsPage;
import Pages.LoginPage1;
import Pages.Tours1Page;

public class Tours1PageTest extends TestBase1 {
	//LoginPage1 loginPage1;
    HomePage1 homepage1;
	Tours1Page tours1page;
	
	
	public Tours1PageTest() {
		super();
	}
	
   @BeforeMethod
   public void setup() throws InterruptedException {
	   initialization();
	  // loginPage1 = new LoginPage1();
		//homepage1 = loginPage1.login(prop.getProperty("username"),prop.getProperty("password"));
	}
   
	
   
   @Test
   public void Tours1() throws InterruptedException {
	   
	  // homepage1 = homepage1.ClickOnTours1();
	   //Thread.sleep(5000);
	   tours1page = new Tours1Page();
	   Thread.sleep(7000);
	   tours1page.Tours1("Bangkok");
	   Thread.sleep(7000);
	   
   
	
	}

}
