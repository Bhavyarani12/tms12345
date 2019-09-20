package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homepage;
	
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
	}
	@Test
	public void loginTest() throws InterruptedException {
//		Thread.sleep(2000);
		homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	
}

}