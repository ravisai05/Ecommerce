package PageObjects;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandinPage {
	 WebDriver driver;
	public LandinPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	By search=By.xpath("//input[@placeholder='Search for Vegetables and Fruits']");
	By productName=By.xpath("//h4[@class='product-name']");
	By topDeals=By.xpath("//a[text()='Top Deals']");
	By addQuantity=By.xpath("//a[text()='+']"); 
	By addToCart=By.xpath("//button[text()='ADD TO CART']");
	By cartIcon=By.xpath("//a[@class='cart-icon']");
	By prcdToCheckout=By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	public void search(String product) {
		driver.findElement(search).sendKeys(product);
	}
	public String getProductName() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver.findElement(productName).getText().split("-")[0].trim();
	}
	public void clickOnTopDeals() {
		driver.findElement(topDeals).click();
		Set<String> sID=driver.getWindowHandles();
		Iterator<String> i1=sID.iterator();
		String parent = i1.next();
		String child= i1.next();
		if(driver.getWindowHandle().equals(parent)) {
			driver.switchTo().window(child);
		}
		}
	public void addProduct() {
		driver.findElement(addQuantity).click();
	}
	public void addProductToCart() {
		driver.findElement(addToCart).click();
	}
	public void proceedToCheckout() {
		driver.findElement(cartIcon).click();
		driver.findElement(prcdToCheckout).click();
		
	

	}
	
}
