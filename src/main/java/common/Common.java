package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import actions.CartPageActions;

public class Common {
	
	public WebDriver driver = null;

	
	public Common(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

public double getPriceFromText(WebElement element) {
		
		return Double.parseDouble(element.getText().replace("$", ""));
}	

}
