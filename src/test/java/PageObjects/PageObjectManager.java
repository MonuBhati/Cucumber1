package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public LandingPage landingPage; 
	public OffersPage offersPage; ;
	public WebDriver driver;
	public CheckOutPage checkOutPage;
	
	
	public PageObjectManager(WebDriver driver) {//constuctor
		this.driver=driver;
	}
	
	public LandingPage getLandingPage() {
		
	landingPage=new LandingPage(driver);
		return landingPage;
	}
	
	public OffersPage getOffersPage() {
		
		offersPage=new OffersPage(driver);
		return offersPage;
			
		}
	
	
public CheckOutPage getCheckOutPage() {
		
	checkOutPage=new CheckOutPage(driver);
		return checkOutPage;
			
		}
	
	
	
	
	
	
	
	
	
	
	

}
