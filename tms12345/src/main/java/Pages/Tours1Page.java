package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase1;

public class Tours1Page extends TestBase1{

	@FindBy(xpath="//span[contains(text(),'Tours')]")
	WebElement Tours1;
	
	@FindBy(xpath="//div[@id='s2id_autogen3']//a[contains(@class,'select2-choice select2-default')]")
	WebElement Cityname;
	
	@FindBy(xpath="//div[@id='select2-drop']//input[contains(@class,'select2-input')]")
	WebElement Cityname1;
	
	@FindBy(xpath="//div[contains(text(),'Thailand,')]")
	WebElement Cityname2;
	
	@FindBy(xpath="//div[@class='col-md-2 form-group go-right col-xs-12 search-button']//button[@class='btn-primary btn btn-lg btn-block pfb0 loader'][contains(text(),'Search')]")
	WebElement Search;
	
	//Initializing Page Objects
	
	public Tours1Page() {
		PageFactory.initElements(driver, this);
		
	}

	
	public void Tours1(String CN) throws InterruptedException {
		
		Tours1.click();
		Thread.sleep(1000);
		Cityname.click();
		Thread.sleep(5000);
		Cityname1.sendKeys(CN);
		Thread.sleep(5000);
		Cityname2.click();
		Thread.sleep(5000);
		Search.click();
		Thread.sleep(3000);
	}
	
}
	
	



	


