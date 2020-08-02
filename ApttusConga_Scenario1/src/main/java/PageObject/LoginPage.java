package PageObject;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resources.BaseFile;

public class LoginPage extends BaseFile {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "input#email")
	private WebElement Emailid;

	@FindBy(css = "input#passwd")
	private WebElement password;

	@FindBy(css = "button#SubmitLogin")
	private WebElement Submit;

	//Enter username
	public WebElement getusuerName() {
		Emailid.sendKeys("jetblue@grr.la");
	return Emailid;
	}

	// enter password
	public WebElement getPassword() {
		password.sendKeys("jetblue");
		return password;
	}
	//click Submit
	public WebElement getSubmit() {
		return Submit;
	}
	
}