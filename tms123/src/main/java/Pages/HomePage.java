package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/nav[1]/div[3]/ul[1]/li[9]/a[1]")
	WebElement Tours;
	
	@FindBy(xpath="//ul[@id='Tours']//a[contains(text(),'Tours')]")
	WebElement Tours1;
	
	@FindBy(xpath="//a[contains(text(),'Travelhope Hotels')]")
	WebElement TravelHopeHotels;
	
	@FindBy(xpath="//ul[@id='TravelhopeHotels']//a[contains(text(),'Bookings')]")
	WebElement Bookings;
	
	@FindBy(xpath="//a[contains(text(),'Travelhope Flights')]")
    WebElement TravelHopeFlights;
	
	@FindBy(xpath="//ul[@id='TravelhopeFlights']//a[contains(text(),'Bookings')]")
	WebElement Bookings1;
	
	//Initializing the Page Objects
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		public HomePage ClickOnTours() {
			Tours.click();
			return new HomePage();
		}
		
		public HomePage ClickOnTours1() {
			Tours1.click();
			return new HomePage();
		}
		public HomePage ClickOnTravelHopeHotels() {
			TravelHopeHotels.click();
			return new HomePage();
		}
		public HomePage ClickOnBookings() {
			Bookings.click();
			return new HomePage();
		}
		public HomePage ClickOnTravelHopeFlights() {
			TravelHopeFlights.click();
			return new HomePage();
			
		
			
		}
		
}

