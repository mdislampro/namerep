package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Common;

public class HomePageElements extends Common {
	
	

	public HomePageElements(WebDriver driver) {
		super(driver);
		
	}
	public WebElement product(int numOfProduct) {
		return driver.findElement(By.xpath("//div[@data-index=\"" + numOfProduct + "\"]"));
	}
	public WebElement quickView(int numOfProduct) {

		return driver.findElement(By.xpath("(//button[text()='Quick View'])["+(numOfProduct+2)+"]"));
	}
	@FindBy(xpath="//iframe[@class='D3gDT9']")
	public WebElement iframe;
	
	@FindBy(xpath="//*[text()='Add to Cart']")
	public WebElement addToCart;

	@FindBy(id="cart-widget-close")
	public WebElement icone;

	@FindBy(id="widget-view-cart-button")
	public WebElement viewCart;
	
	

	
}						

