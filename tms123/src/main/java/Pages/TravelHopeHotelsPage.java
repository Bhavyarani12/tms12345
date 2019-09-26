package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class TravelHopeHotelsPage extends TestBase {

	@FindBy(xpath="//ul[@id='TravelhopeHotels']//a[contains(text(),'Bookings')]")
	WebElement Bookings;
	@FindBy(xpath="//a[@class='xcrud-search-toggle btn btn-default']")
	WebElement Search;
	@FindBy(xpath="//input[@name='phrase']")
	WebElement input;
	@FindBy(xpath="//a[@class='xcrud-action btn btn-primary']")
	WebElement Go;
	
	 //initializing PageObjects
    public TravelHopeHotelsPage() {
    	PageFactory.initElements(driver, this);
    }
     
	public  void HotelsPage(String INPT) throws InterruptedException {

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
		
		
	
	    
	    
	




	
	
		
		
	


