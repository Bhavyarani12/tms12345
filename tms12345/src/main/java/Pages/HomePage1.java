package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase1;

public class HomePage1 extends TestBase1 {
	
	//@FindBy(xpath="//span[contains(text(),'Hotels')]")
	//WebElement Hotels;
	
	@FindBy(xpath="//span[contains(text(),'Flights')]")
	WebElement Flights;
	
	@FindBy(xpath="//span[contains(text(),'Tours')]")
	WebElement Tours1;
	
	@FindBy(xpath="//span[contains(text(),'Cars')]")
	WebElement Cars;
	
	//Initializing Page Objects
	
	public void HomePage1() {
      PageFactory.initElements(driver, this);
	}
	
//	public HomePage1 ClickOnHotels() {
//		Hotels.click();
//		return new HomePage1();
//	}
	
	public HomePage1 ClickOnFlights() {
		Flights.click();
		return new HomePage1();
	}
	public HomePage1 ClickOnTours1() {
		Tours1.click();
		return new HomePage1();
	}

	public HomePage1 ClickOnCars() {
		Cars.click();
		return new HomePage1();
		
	}

}
