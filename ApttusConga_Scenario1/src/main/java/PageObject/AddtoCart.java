package PageObject;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import resources.BaseFile;

public class AddtoCart extends BaseFile {

	public AddtoCart() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "div.right-block")
	private WebElement hoverMouse;
	@FindBy(xpath = "//span[contains(text(),'Add to cart')]")
	private WebElement AddtoCart;
	@FindBy(xpath = "//div[@class='layer_cart_product col-xs-12 col-md-6']//h2[1]")
	private WebElement Detail1;
	@FindBy(css = "div.layer_cart_product_info")
	private WebElement Detail2;
	@FindBy(css = "a.btn.btn-default.button.button-medium")
	private WebElement Checkout;

	// Select Tshirt
	public WebElement gethover() {
		Actions a = new Actions(driver);
		a.moveToElement(hoverMouse).build().perform();
		return hoverMouse;
	}
	// Add to Cart
	public WebElement gettoCart() {
		return AddtoCart;
	}
	// Proceed to checkout
	public WebElement getCheckout() {
		return Checkout;
	}

}