package TestCases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.SteelCaseHomePageRepository;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public Login() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
 WebDriver driver = null;


	
	
	
	@BeforeTest

	public void TestSetUp() { 
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver(); 
		
		
	
	}
		
	
@Test
	
	public void TestLogin() throws InterruptedException {
		
		
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
        
     
        
		
        
        
	}	
	

	@AfterTest
public void FinishTest() {	
		
		driver.close();
		driver.quit();
		
		
	}		

}
