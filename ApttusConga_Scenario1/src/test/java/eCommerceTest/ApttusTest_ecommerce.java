package eCommerceTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.AddtoCart;

import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.MainPage;
import resources.BaseFile;

public class ApttusTest_ecommerce extends BaseFile {

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void ecommerceTest() throws InterruptedException {

		HomePage Login = new HomePage();
		//Click on SignIn
		Login.getSignIn().click();
		//Login with username and password
		LoginPage signin= new LoginPage();
		signin.getusuerName();
		signin.getPassword();
		signin.getSubmit().click();
		//select T-shirt tab
		MainPage mp=new MainPage();
		mp.getTshirttab().click();
		//Add to cart and proceed to checkout			
		AddtoCart atc=new AddtoCart();
		atc.gethover();
		atc.gettoCart().click();
		atc.getCheckout().click();
		
		}

	@AfterTest
	public void teardown() throws IOException {
		driver.quit();
	}
}