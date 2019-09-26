package Pages;

import java.sql.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class ToursPage extends TestBase  {
	
	@FindBy(xpath="//a[contains(text(),'Add New')]")
	WebElement AddNewTour;
	
	@FindBy(xpath="//div[@id='GENERAL']//input[@placeholder='Tour Name']")
	WebElement TourName;
	
	
    
    @FindBy(xpath="//input[@name='maxadult']")
    WebElement Quantity;
    
    @FindBy(xpath="//input[@name='adultprice']")
    WebElement Price;
    
    @FindBy(xpath="//span[@id='adultbtn']")
    WebElement Enable;
    
    @FindBy(id="childbtn")
    WebElement Disable;
    
    @FindBy(xpath="//input[contains(@name,'maxchild')]")
    WebElement Quantity1;
    
    @FindBy(xpath="//input[contains(@name,'childprice')]")
    WebElement Price1;
    
    @FindBy(xpath="//span[@id='childbtn']")
    WebElement Enable1;
    
    @FindBy(xpath="//span[@id='infantbtn']")
    WebElement Disable2;
    
    @FindBy(xpath="//input[contains(@name,'maxinfant')]")
    WebElement Quantity2;
    
    @FindBy(xpath="//input[contains(@name,'infantprice')]")
    WebElement Price2;
    
    @FindBy(xpath="//span[@id='infant']")
    WebElement Enable2;
    
    @FindBy(xpath="//select[contains(@name,'tourstars')]/option[3]")
    WebElement Stars;
    
    @FindBy(xpath="//select[contains(@name,'tourstars')]")
    WebElement Days;
    
    @FindBy(xpath="//input[contains(@name,'tournights')]")
    WebElement Nights;
    
    @FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[9]/div[1]/div[1]/a[1]/span[2]/b[1]")
    WebElement TourType;
    
    @FindBy(xpath="//div[contains(text(),'Private')]")
    WebElement TourTpye1;
    
    @FindBy(xpath="//input[contains(@placeholder,'From')]")
    WebElement From;
    @FindBy(xpath="//td[contains(@class,'active')][contains(text(),'23')]")
    WebElement From1;
    @FindBy(xpath="//div[contains(@class,'col-md-2')]//input[contains(@placeholder,'To')]")
    WebElement To;
    @FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/table[1]/tbody[1]/tr[5]/td[4]")
    WebElement To1;    
    
    
   	
      @FindBy(xpath="//div[@id='s2id_locationlist10']//b")
    WebElement Location;
      @FindBy(xpath="//div[@id='select2-drop']//input[contains(@class,'select2-input')]")
      WebElement Location1;
      @FindBy(xpath="//div[contains(@class,'select2-result-label')]")
      WebElement Location2;
    
   
    
    @FindBy(xpath="//button[@id='add']")
    WebElement Submit;
    
    //initializing PageObjects
    public ToursPage() {
    	PageFactory.initElements(driver, this);
    }
    
    public void ToursPage(String TN,String QNTY1,String PRCE1,String QNTY2,String PRCE2,String QNTY3,String PRCE3,String DAYS,String NYTS,String LCTN) throws InterruptedException {
    
    	AddNewTour.click();
    	Thread.sleep(1000);
    	TourName.sendKeys(TN);
    	Thread.sleep(1000); 	
    	Quantity.sendKeys(QNTY1);
    	Thread.sleep(1000);
    	Price.sendKeys(PRCE1);
    	Thread.sleep(1000);
    	Enable.click();
    	Thread.sleep(1000);
    	Disable.click();
    	Thread.sleep(1000);
    	Quantity.sendKeys(QNTY2);
    	Thread.sleep(1000);
    	Price.sendKeys(PRCE2);
    	Enable.click();
    	Thread.sleep(1000);
    	Disable.click();
    	Thread.sleep(1000);
    	Quantity.sendKeys(QNTY3);
    	Thread.sleep(1000);
    	Price.sendKeys(PRCE3);
    	Thread.sleep(1000);
    	Enable.click();
    	Days.sendKeys(DAYS);
    	Thread.sleep(1000);
    	Nights.sendKeys(NYTS);
    	Thread.sleep(1000);	
    	JavascriptExecutor js3=(JavascriptExecutor)driver;
   		js3.executeScript("window.scrollBy(300,400)");
   		TourType.click();
   		Thread.sleep(1000);
   		TourTpye1.click();
   		Thread.sleep(1000);
    	
    	From.sendKeys("23/09/2019");
    	Thread.sleep(1000);
        From1.click();
        Thread.sleep(1000);
        To.sendKeys("25/09/2019");
    	Thread.sleep(1000);
    	To1.click();
    	Thread.sleep(1000);
    	JavascriptExecutor js31=(JavascriptExecutor)driver;
	   		js31.executeScript("window.scrollBy(300,400)");
	   Thread.sleep(1000);
    	Location.click();
    	Thread.sleep(1000);
        Location1.sendKeys(LCTN);
    	Thread.sleep(1000);
    	Location2.click();
    	Thread.sleep(1000);
    	   JavascriptExecutor js4=(JavascriptExecutor)driver;
    	   js4.executeScript("window.scrollBy(0,900)");
    	   Thread.sleep(1000);	
    	Submit.click();
    	Thread.sleep(1000);
    	
	}
}
