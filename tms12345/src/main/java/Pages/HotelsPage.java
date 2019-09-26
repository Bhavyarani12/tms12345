package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase1;

public class HotelsPage extends TestBase1 {
	 
	//@FindBy(xpath="//span[contains(text(),'Hotels')]")
	//WebElement Hotels;
	
	@FindBy(xpath="//span[contains(text(),'Search by Hotel or City Name')]")
	WebElement Search;
	
	@FindBy(xpath="/html[1]/body[1]/div[18]/div[1]/input[1]")
	WebElement Search1;
	
	@FindBy(xpath="//div[contains(text(),'Bay Lodge, Mozambique')]")
	WebElement Search2;
	
	@FindBy(xpath="//div[@id='dpd1']//input[@placeholder='Check in']")
	WebElement Checkin;
	
	@FindBy(xpath="//div[13]//tr[5]//td[5]")
	WebElement Checkin1;
	
	@FindBy(xpath="/html[1]/body[1]/div[5]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/form[1]/div[3]/div[1]/input[1]")
	WebElement Checkout;
	
	@FindBy(xpath="//input[@placeholder='Check out']")
	WebElement Checkout1;
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-block btn-primary pfb0 loader']")
	WebElement Button;
	
	//Initializing Page Objects
	
	public HotelsPage() {
		PageFactory.initElements(driver, this);
		
	}

	
	public void Hotels(String HN,String CI,String CO) throws InterruptedException {
		
		//Hotels.click();
		//Thread.sleep(1000);
		Search.click();
		Thread.sleep(7000);
		Search1.sendKeys(HN);
		Thread.sleep(4000);
		Search2.click();
		Thread.sleep(5000);
		Checkin.sendKeys(CI);
        Thread.sleep(7000);
        Checkin1.click();
        Thread.sleep(5000);
		Checkout.click();
		Thread.sleep(5000);
		Checkout1.sendKeys(CO);
		Thread.sleep(6000);
		Button.click();
		Thread.sleep(6000);
	}
	
}
	
	


