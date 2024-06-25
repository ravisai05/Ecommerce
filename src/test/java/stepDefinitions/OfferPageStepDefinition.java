package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import PageObjects.OfferPage;
import Util.TestContextSetup;
import io.cucumber.java.en.Then;

public class OfferPageStepDefinition {

	public TestContextSetup testContextSetup;
	public OfferPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	@Then("^user go and search in same shortname (.+) in offer page check if product exists$")
	public void user_go_and_search_in_same_shortname_in_offer_page_check_if_product_exists(String product) throws InterruptedException {
		testContextSetup.pm.getLandingPage().clickOnTopDeals();
		Thread.sleep(10);
		testContextSetup.pm.getOfferPage().search(product);
		String actual=testContextSetup.pm.getOfferPage().getProductName();
		   assertEquals(actual, testContextSetup.res);
		   
		   
	}
	
}
