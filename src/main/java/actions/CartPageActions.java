package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import elements.CartPageElements;

public class CartPageActions extends CartPageElements {


	public CartPageActions(WebDriver driver) {
		super(driver);
	}
	

	public double verifyPrice() {	
	double actualSubTotal =0;
	
	for(WebElement webElement:listOfE) {
		actualSubTotal = actualSubTotal+getPriceFromText(webElement);
	}
	return actualSubTotal;
	}
	
	public double getSubTotalValue() {
		return getPriceFromText(subTotal);
	}
	

	
	
	}
	


