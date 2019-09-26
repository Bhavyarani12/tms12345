package TestCases1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.TestBase1;
import Pages.HomePage1;
import Pages.LoginPage1;



	public class LoginPage1Test extends TestBase1 {
		LoginPage1 loginPage1;
		HomePage1 homepage1;
		
		public  LoginPage1Test() {
			super();
		}

		@BeforeMethod
		public void setup() {
			initialization();
			loginPage1 = new LoginPage1();
		}
		@Test
		public void loginTest() throws InterruptedException {
			//Thread.sleep(2000);
			homepage1 = loginPage1.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}

	}

	

