package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class TravelHopeFlightsPage extends TestBase {
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/nav[1]/div[3]/ul[1]/li[8]/ul[1]/li[1]/a[1]")
	WebElement Bookings;
	@FindBy(xpath="//a[@class='xcrud-search-toggle btn btn-default']")
	WebElement Search;
	@FindBy(xpath="//input[@name='phrase']")
	WebElement input;
	@FindBy(xpath="//a[@class='xcrud-action btn btn-primary']")
	WebElement Go;
	
	//initializing PageObjects
    public void TravelHopeFlightsPage() {
    	PageFactory.initElements(driver, this);
    }
    
    public void FlightsPage(String INPT) throws InterruptedException {
    	
		Bookings.click();
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		input.sendKeys(INPT);
		Thread.sleep(1000);
		Go.click();
		Thread.sleep(1000);

    }
}
	
	

