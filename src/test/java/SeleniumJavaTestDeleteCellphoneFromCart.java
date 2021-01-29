import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumJavaTestDeleteCellphoneFromCart {

	
	private static WebDriver driver = null; 
	
	
	public SeleniumJavaTestDeleteCellphoneFromCart() {
		// TODO Auto-generated constructor stub
	}

	@BeforeTest 
	public void TestSetUp() { 
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver(); 
		
		
	
	}  
	
	@Test 
	public void PurchaseSamsungGalaxyS6() throws InterruptedException {
		
		SeleniumTestJavaRepositpry SeleniumTestJavaRepositpryOBJCT = new SeleniumTestJavaRepositpry(driver); 
		
		driver.get("https://www.demoblaze.com/index.html");
	 	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 	
	 	driver.manage().window().maximize();
		
		SeleniumTestJavaRepositpryOBJCT.SelectGalaxyS6(); 
		SeleniumTestJavaRepositpryOBJCT.AddtoCartSelectGalaxyS6();
		SeleniumTestJavaRepositpryOBJCT.openingcart();
		SeleniumTestJavaRepositpryOBJCT.ValidateSamsungGalaxyS6isINtheCart();
		SeleniumTestJavaRepositpryOBJCT.DeleteGalaxyS6FromCart();
	}
	
	@AfterTest 
	public void FinishingTest() throws InterruptedException {
		
		driver.quit();
	
	}
}
