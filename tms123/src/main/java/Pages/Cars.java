package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class Cars extends TestBase {
	

	@FindBy(xpath="//ul[@id='Cars']//li[1]//a[1]")
	WebElement Cars1;
	@FindBy(xpath="//button[contains(text(),'Add')]")
    WebElement Add;
	@FindBy(xpath="//input[@placeholder='Car Name']")
	WebElement CarName;
	@FindBy(xpath="//div[@id='s2id_autogen21']//b")
    WebElement cartype;
	@FindBy(xpath="//div[@id='select2-drop']//input[contains(@class,'select2-input')]")
	WebElement cartype1;
	@FindBy(xpath="//div[contains(@class,'select2-result-label')]")
	WebElement cartype2;
	@FindBy(xpath="//div[@id='s2id_pickuplocationlist1']//span[contains(@class,'select2-chosen')][contains(text(),'Enter Location')]")
	WebElement pickuplocation;
	@FindBy(xpath="//div[@id='select2-drop']//input[contains(@class,'select2-input')]")
	WebElement pickuplocation1;
	@FindBy(xpath="//div[contains(@class,'select2-result-label')]")
	WebElement pickuplocation2;
	@FindBy(xpath="//div[@id='s2id_dropofflocationlist1']//span[contains(@class,'select2-chosen')][contains(text(),'Enter Location')]")
	WebElement droplocation;
	@FindBy(xpath="//div[@id='select2-drop']//input[contains(@class,'select2-input')]")
	WebElement droplocation1;
	@FindBy(xpath="//div[contains(@class,'select2-result-label')]")
	WebElement droplocation2;
	@FindBy(name="locations[1][price]")
	WebElement price;
	@FindBy(xpath="//input[contains(@placeholder,'From')]")
	WebElement from;
	@FindBy(xpath="//td[contains(@class,'active')][contains(text(),'28')]")
	WebElement from1;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[13]/div[3]/input[1]")
	WebElement to;
	@FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/table[1]/tbody[1]/tr[6]/td[2]")
	WebElement to1;
	@FindBy(xpath="//button[@id='add']")
	WebElement submit;
	
	
	
	public Cars() {
		PageFactory.initElements(driver, this);
	}
	
	public void AddCars(String CN,String CARTYPE,String LCTN,String LCTN1,String PRCE,String FRM,String TO) throws InterruptedException {
		
		Cars1.click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		CarName.sendKeys(CN);
		Thread.sleep(1000);
		cartype.click();
		Thread.sleep(1000);
		cartype1.sendKeys(CARTYPE);
		Thread.sleep(1000);
		cartype2.click();
		Thread.sleep(1000);
		JavascriptExecutor js3=(JavascriptExecutor)driver;
   		js3.executeScript("window.scrollBy(300,400)");
		
		pickuplocation.click();
		Thread.sleep(1000);
		pickuplocation1.sendKeys(LCTN);
		Thread.sleep(1000);
		pickuplocation2.click();
		Thread.sleep(1000);
		droplocation.click();
		Thread.sleep(1000);
		droplocation1.sendKeys(LCTN1);
		Thread.sleep(1000);
		droplocation2.click();
		Thread.sleep(1000);
		price.sendKeys(PRCE);
		Thread.sleep(1000);
		from.sendKeys(FRM);
		Thread.sleep(1000);
		from1.click();
		Thread.sleep(1000);
		to.sendKeys(TO);
		Thread.sleep(1000);
		to1.click();
		Thread.sleep(1000);
		submit.click();
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
		
		
	
	
		
	}


}