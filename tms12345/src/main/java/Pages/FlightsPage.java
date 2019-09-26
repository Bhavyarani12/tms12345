package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase1;

public class FlightsPage extends TestBase1 {

	@FindBy(xpath="//span[contains(text(),'Flights')]")
	WebElement Flights;
	
	@FindBy(xpath="//div[@id='s2id_origin']//span[@class='select2-chosen'][contains(text(),'Enter Location')]")
	WebElement Location;
	
	@FindBy(xpath="//div[@id='select2-drop']//input[contains(@class,'select2-input')]")
	WebElement Location1;
	
	@FindBy(xpath="//div[@class='select2-result-label']")
	WebElement Location2;
	
	@FindBy(xpath="//div[@id='s2id_destination']//span[@class='select2-chosen'][contains(text(),'Enter Location')]")
	WebElement Location11;
	
	@FindBy(xpath="//div[@id='select2-drop']//input[contains(@class,'select2-input')]")
	WebElement Location12;
	
	@FindBy(xpath="//div[contains(text(),'Intl Arpt (DXB)')]")
	WebElement Location13;
	
	@FindBy(xpath="//button[@class='btn-primary btn btn-lg btn-block pfb0']")
	WebElement Search;
	
	
	//Initializing Page Objects
	
	public FlightsPage() {
		PageFactory.initElements(driver, this);
		
	}

	
	public void FlightsPage(String LCTN1,String LCTN2) throws InterruptedException {
		
		Flights.click();
		Thread.sleep(1000);
		Location.click();
		Thread.sleep(5000);
		Location1.sendKeys(LCTN1);
        Thread.sleep(7000);
        Location2.click();
        Thread.sleep(5000);
        Location11.click();
        Thread.sleep(5000);
		Location12.sendKeys(LCTN2);
		Thread.sleep(1000);
		Location13.click();
		Thread.sleep(5000);
		Search.click();
		Thread.sleep(1000);
	}
	
}
	
	



	


