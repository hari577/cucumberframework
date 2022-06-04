package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Login_page_opencart {
	WebDriver driver;
	@FindBy(xpath = "//a[text()='Register' and @class='btn btn-black navbar-btn']")
	WebElement btn_register;
	
	public Login_page_opencart(WebDriver driver) {
		this.driver = driver;
		
		
		//AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}
	public void registerbutton() 
	{
		try
		{
		btn_register.click();
		Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
