package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutPage {
	WebDriver driver;
public CheckOutPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}
By qntityDisplayed=By.xpath("//p[@class='quantity']");
By ApplyBtn=By.xpath("//button[text()='Apply']");
By placeOrderBtn=By.xpath("//button[text()=\"Place Order\"]");

public int getQuantity() {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));
	wait.until(ExpectedConditions.presenceOfElementLocated(qntityDisplayed));
	String[] quantity=driver.findElement(qntityDisplayed).getText().split(" ", 2);
	return Integer.parseInt(quantity[0]);
}
public boolean isApplyButtonEnabled() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	return driver.findElement(ApplyBtn).isDisplayed();
}
public boolean isPlaceOrderBtnDisplayed() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	return driver.findElement(placeOrderBtn).isEnabled();
}
public void proceedToCheckout() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(placeOrderBtn).click();
}

}
