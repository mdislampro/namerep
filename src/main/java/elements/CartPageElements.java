package elements;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Common;

public class CartPageElements extends Common {
	
	public CartPageElements(WebDriver driver) {
		super(driver);
		
	}

	public WebDriver driver =null;
	
	
	
	@FindBy(xpath="//div[@class='apzZQq']")
	public List<WebElement>listOfE;
	
	@FindBy(xpath="//dd[@data-hook='SubTotals.subtotalText']")
	public WebElement subTotal;

}
