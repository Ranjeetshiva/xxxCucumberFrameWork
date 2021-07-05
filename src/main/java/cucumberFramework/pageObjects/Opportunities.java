package cucumberFramework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class Opportunities {

	private WebDriver driver;
	
	public Opportunities(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
