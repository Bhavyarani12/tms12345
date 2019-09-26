package Pages;

import javax.swing.JList.DropLocation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase1;

public class Cars1Page extends TestBase1 {

	@FindBy(xpath="//div[@id='body-section']//li[4]//a[1]")
	WebElement Cars1;
	
	@FindBy(xpath="//div[@id='s2id_carlocations']//span[contains(@class,'select2-chosen')][contains(text(),'Location')]")
	WebElement Pickuplocation;
	
	@FindBy(xpath="//div[@id='select2-drop']//input[contains(@class,'select2-input')]")
	WebElement Pickuplocation1;
	
	@FindBy(xpath="//div[contains(@class,'select2-result-label')]")
	WebElement Pickuplocation2;
	
	@FindBy(xpath="//div[@class='bgfade col-md-2 form-group go-right col-xs-12 search-button']//button[@class='btn-primary btn btn-lg btn-block pfb0 loader'][contains(text(),'Search')]")
	WebElement Search ;
	

	//Initializing Page Objects
	
	public Cars1Page() {
		PageFactory.initElements(driver, this);
		
	}

	
	public void Cars1Page(String PL,String DL)throws InterruptedException {
		
		Cars1.click();
		Thread.sleep(1000);
		Pickuplocation.click();
		Thread.sleep(1000);
		Pickuplocation1.sendKeys(PL);
		Thread.sleep(5000);
		Pickuplocation2.click();
		Thread.sleep(5000);
		Search.click();
		Thread.sleep(1000);
	}
	
}
	
	



	


