package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Registerpage_opencart {

	WebDriver driver;
	
	@FindBy(xpath = "(//a[text()='Register'])[1]")
	WebElement btn_register1;
	@FindBy(xpath = "(//a[text()='Fullname'])[1]")
	WebElement enterFullname;
	
	public Registerpage_opencart(WebDriver driver) {
		this.driver = driver;
		
		
		//AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}
	
	
	public void ClickOnregisterButton() throws Exception
	{
		if(btn_register1.isDisplayed())
		{
			btn_register1.click();
		}
		else
		{
			throw new Exception("btn_register1 is not displayed");
		}
		
		
	}
	
	public void clickonfullname(String fullname)
	{
		if(enterFullname.isDisplayed())
		{
			enterFullname.sendKeys(fullname);
		}
	}
}
