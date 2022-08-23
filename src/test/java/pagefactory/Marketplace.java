package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Marketplace {
	WebDriver driver;
	@FindBy(xpath = "(//a[text()='Marketplace'])[1]")   
	WebElement btn_marketplace;
	
	

	
	
	
	
	
	
	public Marketplace(WebDriver driver) {
		this.driver = driver;
		
		
		//AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}
	
	
	public void ClickOnMarketPlaceButton() throws Exception
	{
		if(btn_marketplace.isDisplayed())
		{
			btn_marketplace.click();
		}
		else
		{
			throw new Exception("buttinmarketplace is not found");
		}
	}
}
