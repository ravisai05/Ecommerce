package PageObjects;

import org.openqa.selenium.WebDriver;

import stepDefinitions.LandingPageStepDefinition;

public class PageManager {

	public WebDriver driver;
	public LandinPage landingPage;
	public OfferPage offerPage;
	public CheckOutPage checkoutPage;
	public PageManager(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public LandinPage getLandingPage() {
		landingPage=new LandinPage(this.driver);
		return landingPage;
	}
	public OfferPage getOfferPage() {
		offerPage=new OfferPage(this.driver);
		return offerPage;
		
	}
	public CheckOutPage getCheckoutPage() {
		checkoutPage=new CheckOutPage(driver);
		return checkoutPage;
	}
	
}
