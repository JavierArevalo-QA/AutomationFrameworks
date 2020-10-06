package Pages;

import static org.testng.Assert.assertEquals;

import java.awt.Scrollbar;
import java.util.concurrent.TimeUnit;

import javax.swing.JScrollBar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SteelCaseOcassionalTablesRepository {

	
	private static WebDriver driver;
	
	By Products_Link = By.id("menu-item-423704");
	By Occassional_Tables_Link = By.id("menu-item-423675");
	
	By ForLegsTableStock = By.xpath("//span[contains(text(),'4 Leg')]");  
	
	
	public SteelCaseOcassionalTablesRepository(WebDriver driver) {
		// TODO Auto-generated constructor stub
	
		this.driver= driver;
	
	}

	public void ClickComponentsLink() {
	
		WebDriverWait wait = new WebDriverWait(driver, 15);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-423704")));
		
		driver.findElement(Products_Link).click();
	}

	
	public void ClickOcassionalTablesLink() {
	
		WebDriverWait wait = new WebDriverWait(driver, 15);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-423675")));
		
	driver.findElement(Occassional_Tables_Link).click();
		  
		 
	}
	
	public void Validate4LegsTableAmountofStockisDisplayed() throws InterruptedException { 
		
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement Element = driver.findElement(By.xpath("//span[contains(text(),'4 Leg')]"));  
		js.executeScript("arguments[0].scrollIntoView(true);", Element);
		 
		 */
		
		//Thread.sleep(10000);
		
		driver.get("https://www.steelcase.com/products/occasional-tables/");
	 	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'4 Leg')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'4 Leg')]")));
		
	String amountoftablesdisplayedfrompage = driver.findElement(By.xpath("//span[contains(text(),'4 Leg')]")).getText();
	String ExpectedAmountofTablesDisplayed = "4 Leg (1)";
	
	assertEquals(ExpectedAmountofTablesDisplayed,amountoftablesdisplayedfrompage);
	
	System.out.println(amountoftablesdisplayedfrompage + "Cantidad Desplegada por la pagina"); 
	System.out.println(ExpectedAmountofTablesDisplayed + "Cantidad Esperada en la pagina"); 
	}
	
}
