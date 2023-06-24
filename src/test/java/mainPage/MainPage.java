package mainPage;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import actions.CartPageActions;
import baseTest.BaseTest;

public class MainPage extends BaseTest {
	
	CartPageActions cartPageActions = null;
	
	@Test
		public void varifyCart() throws InterruptedException {
		cartPageActions=homePageActions.addToCartAndNavigatToCart(3);
		Assert.assertEquals(driver.getTitle(), "Cart Page | Kamolini");
	}
	@Test(dependsOnMethods = "varifyCart")
	public void finalVerify() {
		double actualSubTotal =cartPageActions. verifyPrice();
		
		double expSubTotal =cartPageActions.getSubTotalValue();	  
	
		Assert.assertEquals(expSubTotal,actualSubTotal);
	
	}

			
}

