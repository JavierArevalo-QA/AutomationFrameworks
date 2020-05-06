package Tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	 
	static AppiumDriver<MobileElement> driver;
	 
	
	
	@BeforeTest
	
	
	public void setup(){ 
		
		
	
		
		try {
		DesiredCapabilities caps = new DesiredCapabilities();  
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9"); 
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "motorola one");
		caps.setCapability(MobileCapabilityType.UDID, "ZY3234FZL4");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\jarevalo\\Downloads\\com.android.chrome_81.0.4044.117.apk");
		//caps.setCapability(capabilityName "chromedriverExecutable", value "C:\\Users\\jarevalo\\Downloads");
	    //caps.setCapability(capabilityName "chromedriverExecutable", value "C:\\Users\\jarevalo\\Downloads" );
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	driver = new AppiumDriver<MobileElement>(url,caps);
	//driver = new AndroidDriver<MobileElement>(url,caps);
	//driver = new IOSDriver<MobileElement>(url,caps);
	
	
		}catch(Exception exp) {
			System.out.println(exp.getCause()); 
			System.out.println(exp.getMessage()); 
		exp.printStackTrace(); }
	}
	
	@Test
	public void sampleTest() { 
		
		
		System.out.println("I am inside sample Test"); 
	}
	
	@AfterTest
	public void teardown() {
		
	}
	
}
