import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public SeleniumTest() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.iedriver().setup();
		WebDriverManager.chromedriver().setup();
		
		//WebDriver driver1 = new FirefoxDriver();
		//WebDriver driver2 = new InternetExplorerDriver();
		WebDriver driver = new ChromeDriver();
	
	//driver1.get("https://google.com");
	//driver2.get("https://google.com");
		driver.get("http://testapp.galenframework.com/");
        WebElement loginbutton = driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary button-login']"));
		loginbutton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("test"); 
	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("TestPassword");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		WebElement loginbutton1 = driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary button-login']"));
		loginbutton1.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();	
	}

}
