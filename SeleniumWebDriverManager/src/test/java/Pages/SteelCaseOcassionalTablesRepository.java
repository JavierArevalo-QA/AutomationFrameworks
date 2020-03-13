package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SteelCaseOcassionalTablesRepository {

	
	private static WebDriver driver;
	
	By Products_Link = By.id("menu-item-423704");
	By Occassional_Tables_Link = By.id("menu-item-423675");
	
	
	
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
}
