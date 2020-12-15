package Pages;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SteelCaseHomePageRepository {

	

	private static WebDriver driver;  
    
	By Accept_AllCokies = By.id("onetrust-accept-btn-handler");	
	By Login_Button = By.xpath("//body/div[@id='page']/section[1]/div[1]/nav[1]/ol[2]/li[1]/a[1]");    
	By Login_Button_Page1 = By.xpath("//button[@class='vex-open vex-login button-blue']"); 
	By Password_TextBox = By.name("password");  
	
	
	
	
	
	By UsernameOnlelogin_TextBox = By.id("username");; 
	By ContinueButtonOneLogin_Button = By.xpath("//button[@class='sc-kTUwUJ blGbUr sc-bdVaJa cVfhXY']");;
	By PasswordOnelogin_TextBox = By.id("password");;
	
	
	
	public SteelCaseHomePageRepository(WebDriver driver) {
		this.driver= driver;
		
		// TODO Auto-generated constructor stub
	}

public void ClickAcceptAllcookiesbutton() {  
	WebDriverWait wait = new WebDriverWait(driver, 15);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onetrust-accept-btn-handler")));  
	
	driver.findElement(Accept_AllCokies).click();
}

public void ClickLoginButton() { 
	
	
	 WebElement isEnabled =    driver.findElement(Login_Button); 
	    
	 WebElement isDisplayed = driver.findElement(Login_Button); 
	     
	     if(isEnabled.isEnabled() && isDisplayed.isDisplayed()) {
	    	 
	    	 driver.findElement(Login_Button).click();
	     }
	     	
	
	

}

public void ClickLoginButtonPage1() {

	 WebElement isEnabled =    driver.findElement(Login_Button_Page1); 
	    
	 WebElement isDisplayed = driver.findElement(Login_Button_Page1); 
	     
	    if(isEnabled.isEnabled() && isDisplayed.isDisplayed()) {
	    	 
	    	 driver.findElement(Login_Button_Page1).click();
	     }

	
	


}



public void SetUsernameOnelogin()  { 
	
	
	 
	WebDriverWait wait = new WebDriverWait(driver, 15);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));     
	
	  
	 
	
	// WebElement isEnabled =    driver.findElement(UsernameOnlelogin_TextBox); 
	    
	 //WebElement isDisplayed = driver.findElement(UsernameOnlelogin_TextBox); 
	     
	   // if(isEnabled.isEnabled() && isDisplayed.isDisplayed()) {
	    	 
	    	 driver.findElement(UsernameOnlelogin_TextBox).sendKeys("jarevalo@steelcase.com");
	     //}

	
	
	
	
	
}


public void SetPasswordOneLogin() {

	
	WebDriverWait wait = new WebDriverWait(driver, 15);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
	
	
	    	 
	    	 driver.findElement(PasswordOnelogin_TextBox).sendKeys("Recuerda11");;
	     
	


}

public void ClickEnter() {

	Actions action = new Actions(driver);
    action.sendKeys(Keys.ENTER).build().perform();

}
}