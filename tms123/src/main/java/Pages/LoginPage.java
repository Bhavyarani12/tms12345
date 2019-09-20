package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {

	//Page Factory-OR:
	//Page Factory-OR
		@FindBy(xpath="//form[@class='form-signin form-horizontal wow fadeIn animated animated']//input[@placeholder='Email']")
		WebElement username;
		
		@FindBy(xpath="//input[@placeholder='Password']")
		WebElement password;
		
		@FindBy(xpath="//button[@class='btn btn-primary btn-block ladda-button fadeIn animated']")
		WebElement loginBtn;
		
	
	//Initializing the Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String un, String pwd) throws InterruptedException {
		username.sendKeys(un);
		Thread.sleep(5000);
		password.sendKeys(pwd);
		Thread.sleep(5000);
		loginBtn.click();
		Thread.sleep(2000);
		
		return new HomePage();
		
	}
	
}

	
	


