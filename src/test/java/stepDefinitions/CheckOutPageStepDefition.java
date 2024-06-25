package stepDefinitions;

import org.testng.Assert;

import Util.TestContextSetup;
import io.cucumber.java.en.Then;

public class CheckOutPageStepDefition {
	TestContextSetup testContextSetup;
	
	public CheckOutPageStepDefition(TestContextSetup testContextSetup) {
		// TODO Auto-generated constructor stub
		this.testContextSetup=testContextSetup;
	}
	@Then("Verify Product detais")
	public void verify_product_detais() throws InterruptedException {
		System.out.println("***************************"+testContextSetup.pm.getCheckoutPage().getQuantity() +"*******************************************");
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(testContextSetup.pm.getCheckoutPage().getQuantity(), testContextSetup.cnt+1);
		
	    
	}
	@Then("verify place Order and Apply buttons are displayed")
	public void verify_place_order_and_apply_buttons_are_displayed() {
		Assert.assertEquals(testContextSetup.pm.getCheckoutPage().isApplyButtonEnabled(), true);
		Assert.assertEquals(testContextSetup.pm.getCheckoutPage().isPlaceOrderBtnDisplayed(), true);
	}
	@Then("Proceeds to checkout")
	public void proceeds_to_checkout() {
	    testContextSetup.pm.getCheckoutPage().proceedToCheckout();
	}
	


}
