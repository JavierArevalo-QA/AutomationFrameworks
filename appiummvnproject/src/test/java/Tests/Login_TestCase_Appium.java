package Tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.MainPageRepository_Appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Login_TestCase_Appium { 
	
	
	private AndroidDriver driver;

	  @BeforeTest
	  public void setUp() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("deviceName", "motorola one");
	    desiredCapabilities.setCapability("udid", "ZY3234FZL4");
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("platformVersion", "9");
	    desiredCapabilities.setCapability("appPackage", "com.android.chrome");
	    desiredCapabilities.setCapability("appActivity", "org.chromium.chrome.browser.document.ChromeLauncherActivity");

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");                        

	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	  }

	
	  @Test 
	  
	  public void sampleTest() throws InterruptedException {
		  
		  MainPageRepository_Appium loginpageobjects_Appium = new MainPageRepository_Appium(driver); 
		  
		
		 
		  loginpageobjects_Appium.ClickTermsAcceptButton(); 
		  loginpageobjects_Appium.ClickNextButton(); 
		  loginpageobjects_Appium.PositiveButton(); 
		  loginpageobjects_Appium.ClickSearchBox(); 
		  loginpageobjects_Appium.URLBAR();
		 loginpageobjects_Appium.ClickenterAppium();
		  
		  
		  
		   
		  
	
	     
	  
	  
	  }

	  
	  @Test 
	  
	  public void Login_Appium() throws InterruptedException {

	     
	        
			
	        
	        
		}	
		
	  /*
	  
	  @AfterTest
	  public void tearDown() {
	    driver.quit();
	  }
*/
}
