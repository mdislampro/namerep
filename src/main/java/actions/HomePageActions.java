package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import elements.HomePageElements;

public class HomePageActions extends HomePageElements{
	
	public HomePageActions(WebDriver driver) {
		super(driver);
		
		
	}

	public CartPageActions addToCartAndNavigatToCart(int numberOfProduct) throws InterruptedException {
		for(int i=1; i<=numberOfProduct; i++) { 

			Actions actions = new Actions(driver);

			actions.moveToElement(product(i)).build().perform();

			Thread.sleep(5000);
			quickView(i).click();
			Thread.sleep(5000);

			driver.switchTo().frame(iframe); Thread.sleep(5000); 
			addToCart.click();
					Thread.sleep(5000); 
					driver.switchTo().defaultContent();
					driver.switchTo().frame(1);
					Thread.sleep(5000);

					if(i!=3) { Thread.sleep(4000);
					icone.click();

					}else { Thread.sleep(4000);
					viewCart.click(); }
					Thread.sleep(4000); 
					driver.switchTo().defaultContent(); 
					}
		return new CartPageActions(driver);
		
		}


}
