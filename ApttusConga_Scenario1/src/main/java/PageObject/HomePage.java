package PageObject;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resources.BaseFile;

public class HomePage extends BaseFile {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "a.login")
	private WebElement Login;

	//Select SignIn
	public WebElement getSignIn() {
		return Login;
	}
}