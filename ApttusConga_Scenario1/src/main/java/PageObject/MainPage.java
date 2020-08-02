package PageObject;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resources.BaseFile;

public class MainPage extends BaseFile {

	public MainPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-child(3) a[title='T-shirts']")
	private WebElement Tshirttab;

	
	//Select Tshirt tab
	public WebElement getTshirttab() {
		return Tshirttab;
	}


	
}