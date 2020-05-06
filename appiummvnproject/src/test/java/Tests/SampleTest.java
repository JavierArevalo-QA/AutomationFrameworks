package Tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SampleTest { 
	
	
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
	  public void sampleTest() {
	    MobileElement el1 = (MobileElement) driver.findElementById("com.android.chrome:id/terms_accept");
	    el1.click();
	    MobileElement el2 = (MobileElement) driver.findElementById("com.android.chrome:id/next_button");
	    el2.click();
	    MobileElement el3 = (MobileElement) driver.findElementById("com.android.chrome:id/positive_button");
	    el3.click();
	  }

	  @AfterTest
	  public void tearDown() {
	    driver.quit();
	  }

}
