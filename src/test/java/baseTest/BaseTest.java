package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import actions.HomePageActions;
import common.Common;

public class BaseTest {
	
	public WebDriver driver=null;
	public HomePageActions homePageActions = null;
	public Common common = null;

	@BeforeClass 
	public void  addProduct() throws InterruptedException{

		String pathofTheProject = System.getProperty("user.dir");


		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://kamoleshbachar.wixsite.com/kamolini/");
		//driver.manage().window().maximize();
		homePageActions = new HomePageActions(driver);
		common = new Common(driver);
	}
	
	@AfterClass
	public void q() {
		driver.close();
}
}
