package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.SteelCaseHomePageRepository;
import Pages.SteelCaseOcassionalTablesRepository;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ForLegsTables {

	public ForLegsTables() {
		
		
		
		// TODO Auto-generated constructor stub
	}


	
	private static WebDriver driver = null;


		
		
		
		@BeforeTest

		public void TestSetUp() { 
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver(); 
			
			
		
		}
	
	
	

@Test
	public void FourLegsTables() throws InterruptedException {
	SteelCaseOcassionalTablesRepository SCOcassionaltablesobjct = new SteelCaseOcassionalTablesRepository(driver);

	SteelCaseHomePageRepository loginpageobjects = new SteelCaseHomePageRepository(driver); 
	
	
 	driver.get("https://www.steelcase.com/");
 	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
 	
 	driver.manage().window().maximize();
	
	
	
	loginpageobjects.ClickLoginButton();
	
	loginpageobjects.ClickLoginButtonPage1();
	
    loginpageobjects.SetUsernameOnelogin();  
    
    
    loginpageobjects.ClickEnter();
    
    loginpageobjects.SetPasswordOneLogin();
    
    loginpageobjects.ClickEnter();

 	SCOcassionaltablesobjct.ClickComponentsLink();
   
 	SCOcassionaltablesobjct.ClickOcassionalTablesLink();

 	SCOcassionaltablesobjct.Validate4LegsTableAmountofStockisDisplayed();

}


}
