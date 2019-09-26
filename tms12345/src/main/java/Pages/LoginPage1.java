package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.TestBase1;

public class LoginPage1 extends TestBase1 {

	//Page Factory-OR:
	//Page Factory-OR
		@FindBy(xpath="//input[@placeholder='Email']")
		WebElement username;
		
		@FindBy(xpath="//input[@placeholder='Password']")
		WebElement password;
		
		@FindBy(xpath="//button[@class='btn btn-action btn-lg btn-block loginbtn']")
		WebElement button;
		
		@FindBy(xpath="//a[@class='navbar-brand go-right']//img")
		WebElement phptravels;
		
	
	//Initializing the Page Objects
	public LoginPage1() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage1 login(String un, String pwd) throws InterruptedException {
//		username.clear();
//		Thread.sleep(1000);
		username.sendKeys(un);
		Thread.sleep(5000);
//		password.clear();
//		Thread.sleep(1000);
		password.sendKeys(pwd);
		Thread.sleep(5000);
		button.click();
		Thread.sleep(7000);
		phptravels.click();
		Thread.sleep(7000);
		
		
		return new HomePage1();
		
	}
	
}


