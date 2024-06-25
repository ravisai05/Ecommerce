package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OfferPage {

	 WebDriver driver;
	public OfferPage(WebDriver driver) {
		this.driver=driver;
	}
	By search=By.xpath("//input[@id='search-field']");
	By product=By.xpath("//tr/td");
	

	public void search(String productName) {
		
	driver.findElement(search).sendKeys(productName);
		
	}
	
	public String getProductName() {
		return driver.findElement(product).getText();
	}
}
