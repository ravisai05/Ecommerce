package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LandinPage;
import Util.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LandingPageStepDefinition {

	
	public  WebDriver driver;
	public String res="";
	public TestContextSetup testContextSetup;
	public LandingPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}

	
	
	@Given("user is on greencart landing page")
	public void user_is_on_greencart_landing_page() {
		testContextSetup.pm.getLandingPage();
	    
	}
	
	@When("^user  searched with short name called (.+) and extract for product$")
	public void user_searched_with_short_name_called_tom_and_extract_for_product(String product) throws InterruptedException{
		testContextSetup.pm.getLandingPage().search(product);
	   Thread.sleep(Duration.ofSeconds(2));
	  
	   testContextSetup.res=testContextSetup.pm.getLandingPage().getProductName();
	   
	   
	   
	   System.out.println(testContextSetup.res + "is extracted from home page");
	   
	}
	@When("Add quantity of product")
	public void add_quantity_of_product() {
		int c=testContextSetup.cnt;
		while(c>0) {
			testContextSetup.pm.landingPage.addProduct();
			c-=1;
		}
	   
	}
	@When("Click on add to acrt")
	public void click_on_add_to_acrt() {
	    testContextSetup.pm.landingPage.addProductToCart();
	}


@When("Click on proceed to checkout")
public void click_on_proceed_to_checkout() {
   testContextSetup.pm.landingPage.proceedToCheckout();
}
}
