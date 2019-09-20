package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ToursPage;



	public class ToursPageTest extends TestBase {
		//private static final String String = null;
		LoginPage loginPage;
		HomePage homepage;
		ToursPage tourspage;
		
		public ToursPageTest() {
			super();
		}

		@BeforeMethod
		public void setup() throws InterruptedException {
			initialization();
			loginPage = new LoginPage();
			homepage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		}
		
		@Test
		public void ToursPage() throws InterruptedException {

			homepage = homepage.ClickOnTours();
			Thread.sleep(1000);
			tourspage = new ToursPage();
			Thread.sleep(1000);
			tourspage.ToursPage("HawaMahal","1" , "2500", "1", "1000", "1", "1000", "2", "1", "Jaipur");
			Thread.sleep(1000);
			
		}
			
		}
		
		
		

	


