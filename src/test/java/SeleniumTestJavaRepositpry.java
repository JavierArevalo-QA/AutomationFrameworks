import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class SeleniumTestJavaRepositpry {

	private WebDriver driver; 
	
	By Select_SamsungGalaxyS6 = By.linkText("Samsung galaxy s6"); 
	By AddtoCart_Button = By.linkText("Add to cart");
	By OpeningCart_Button = By.linkText("Cart");
    By Validating_GalaxyS6isinTheCart = By.xpath("//td[contains(text(),'Samsung galaxy s6')]");
	By DeletinigSamsungGalaxyS6_FromCart = By.linkText("Delete");
    By PlaceOrder_Button = By.xpath("//button[contains(text(),'Place Order')]");
    By PlaceOrder_Name = By.xpath("//input[@id='name']");
    By PlaceOrder_Country = By.xpath("//input[@id='country']"); 
    By PlaceOrder_City = By.xpath("//input[@id='city']");
    By PlaceOrder_CreditCard = By.cssSelector("#card");
    By PlaceOrder_Month = By.cssSelector("#month");   
    By PlaceOrder_Year =  By.cssSelector("#year");
    By PlaceOrder_FinishPurchase_Button = By.xpath("//button[contains(text(),'Purchase')]");
    By FinishingPurchase_Message = By.xpath("//h2[contains(text(),'Thank you for your purchase!')]");
    
 
    
    public SeleniumTestJavaRepositpry(WebDriver driver) { 
		// TODO Auto-generated constructor stub
		this.driver= driver;
	} 
	
	
	public void SelectGalaxyS6() {  
		WebDriverWait wait = new WebDriverWait(driver, 15);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Samsung galaxy s6")));  
		
		driver.findElement(Select_SamsungGalaxyS6).click();
	}
	
	
	public void AddtoCartSelectGalaxyS6() {  
		WebDriverWait wait = new WebDriverWait(driver, 15);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Add to cart")));  
		
		driver.findElement(AddtoCart_Button).click(); 
		
		
		try {
		    WebDriverWait waitt = new WebDriverWait(driver, 5);
		    waitt.until(ExpectedConditions.alertIsPresent());
		    Alert alert = driver.switchTo().alert();
		    System.out.println(alert.getText());
		    alert.accept();
		    Assert.assertTrue(alert.getText().contains("Thanks."));
		} catch (Exception e) {
		    //exception handling
		}
			
	}
	
	public void openingcart() {  
		WebDriverWait wait = new WebDriverWait(driver, 15);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Cart")));  
		
		driver.findElement(OpeningCart_Button).click();
	}	

	public void ValidateSamsungGalaxyS6isINtheCart() {  
		WebDriverWait wait = new WebDriverWait(driver, 15);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(),'Samsung galaxy s6')]")));  
		
	String ValidatingGalaxyS6Existance =driver.findElement(Validating_GalaxyS6isinTheCart).getText();  
	String ExpectedString = "Samsung galaxy s6";
	Assert.assertEquals(ValidatingGalaxyS6Existance,ExpectedString);
	
	}	
	
	public void DeleteGalaxyS6FromCart() {  
		WebDriverWait wait = new WebDriverWait(driver, 15);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Delete")));  
		
		driver.findElement(DeletinigSamsungGalaxyS6_FromCart).click();
	}
	
	public void ValidateSamsungGalaxyS6isNOTINtheCart() {  
		WebDriverWait wait = new WebDriverWait(driver, 15);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(),'Samsung galaxy s6')]")));  
		
	String ValidatingGalaxyS6Existance =driver.findElement(Validating_GalaxyS6isinTheCart).getText();  
	String ExpectedString = "Samsung galaxy s6";
	Assert.assertNotSame(ValidatingGalaxyS6Existance,ExpectedString);
	
	}	
	
	public void ClickAtPlaceOrderButton() {  
		WebDriverWait wait = new WebDriverWait(driver, 15);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Place Order')]")));  
		
		driver.findElement(PlaceOrder_Button).click();
	}
	
	
	public void FillPurchaseDataName() {  
		WebDriverWait wait = new WebDriverWait(driver, 15);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='name']")));  
		
		driver.findElement(PlaceOrder_Name).sendKeys("TestName");
	}
	



	public void FillPurchaseDataCountry() {  
		WebDriverWait wait = new WebDriverWait(driver, 15);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='country']")));  
		
		driver.findElement(PlaceOrder_Country).sendKeys("TestCountry");
	}

	public void FillPurchaseDataCity() {  
		WebDriverWait wait = new WebDriverWait(driver, 15);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='city']")));  
		
		driver.findElement(PlaceOrder_City).sendKeys("TestCity");
	}

	public void FillPurchaseCreditCard() {  
		WebDriverWait wait = new WebDriverWait(driver, 15);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#card")));  
		
		driver.findElement(PlaceOrder_CreditCard).sendKeys("1234567890123456");
	}


	public void FillPurchaseMonth() {  
		WebDriverWait wait = new WebDriverWait(driver, 15);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#month")));  
		
		driver.findElement(PlaceOrder_Month).sendKeys("TestingMonth");
	}
	
	
	public void FillPurchaseYear() {  
		WebDriverWait wait = new WebDriverWait(driver, 15);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#year")));  
		
		driver.findElement(PlaceOrder_Month).sendKeys("Testingyear");
	}


	public void ClickAtFinishingPurchaseButton() {  
		WebDriverWait wait = new WebDriverWait(driver, 15);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Purchase')]")));  
		
		driver.findElement(PlaceOrder_FinishPurchase_Button).click();
	}
	

	public void FinishingPurchaseMessage() {  
		WebDriverWait wait = new WebDriverWait(driver, 15);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Thank you for your purchase!')]")));  
		
		String MessageFromPurchase = driver.findElement(FinishingPurchase_Message).getText();
		String Expectedmessage = "Thank you for your purchase!";
		Assert.assertEquals(MessageFromPurchase,Expectedmessage);
	}

}
