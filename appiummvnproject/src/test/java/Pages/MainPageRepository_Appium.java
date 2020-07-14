package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy.ByAccessibilityId;
import io.appium.java_client.android.nativekey.AndroidKey;

public class MainPageRepository_Appium<MobileElement> {

	
	

	

	private static WebDriver driver; 
	
	By Terms_Accept = By.id("com.android.chrome:id/terms_accept"); 
	By Next_Button = By.id("com.android.chrome:id/next_button"); 
	By Positive_Button = By.id("com.android.chrome:id/positive_button"); 
	By Search_Box = By.id("com.android.chrome:id/search_box_text"); 
	By URL_Bar = By.id("com.android.chrome:id/url_bar"); 
	By Enter_Key = By.xpath("//android.widget.ImageView[@content-desc=\"Card Menu\"]");
	
	By Login_Button = By.xpath("//a[@class='trigger-signup login-link']");    
	By Login_Button_Page1 = By.xpath("//button[@class='vex-open vex-login button-blue']"); 
	By Password_TextBox = By.name("password");  
	
	
	
	
	
	By UsernameOnlelogin_TextBox = By.id("username");; 
	By ContinueButtonOneLogin_Button = By.xpath("//button[@class='sc-kTUwUJ blGbUr sc-bdVaJa cVfhXY']");;
	By PasswordOnelogin_TextBox = By.id("password");;
	
	
	By User_Account = By.xpath("//android.view.View[@content-desc=\\\"User Account\\\"]/android.widget.TextView"); 
	By LoginRegister_Button = By.xpath("//android.view.View[@content-desc=\"LOG IN / REGISTER\"]"); 
	By ConfirmationLogin_Button = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[5]/android.view.View[2]/android.view.View[1]/android.widget.Button[1]");
	By UserName_TextBox = By.id("username");
	public MainPageRepository_Appium(WebDriver driver) {
		
		this.driver= driver;
		// TODO Auto-generated constructor stub
	}

	
	
	
	private By ByAccessibilityId(String string) {
		// TODO Auto-generated method stub
		return null;
	}


	public void ClickTermsAcceptButton() {
		
		
		driver.findElement(Terms_Accept).click();
	}

	
	public void ClickNextButton() { 
		
		driver.findElement(Next_Button).click();
	}
	
	public void PositiveButton() {
		
		driver.findElement(Positive_Button).click();
	}
	
	public void ClickSearchBox() {
		
		driver.findElement(Search_Box).click();
	}
	
	public void URLBAR() {
		
		driver.findElement(URL_Bar).sendKeys("www.steelcase.com");;
		
	}
	
	public void ClickenterAppium() { 
		
		

		driver.findElement(Enter_Key).click();
		 
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
		
		
		    	 
		    	 driver.findElement(PasswordOnelogin_TextBox).sendKeys("Recuerda09");;
		     
		


	}

	public void ClickEnter() {

		Actions action = new Actions(driver);
	    action.sendKeys(Keys.ENTER).build().perform();

	}
	
	
	
}
