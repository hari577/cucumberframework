package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import junit.framework.Assert;

public class Paymentgateway {
	WebDriver driver;
	
	@FindBy(xpath = "(//a[text()='Login'])[2]")
	WebElement btn_login;
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement email_text;
	@FindBy(xpath ="//h1[text()='Log in to your OpenCart account']")
	WebElement validate_text;
	

	
	public Paymentgateway(WebDriver driver) {
		this.driver = driver;
		
		
		//AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}
	
	public void clickonloginbutton() throws Exception
	{
		if(btn_login.isDisplayed())
		{
			btn_login.click();
		}
		else
		{
			throw new Exception("loginbutton is not displaye");
		}
	}
	
	public void enteremailid(String email) throws Exception
	{
		if(email_text.isDisplayed())
		{
			email_text.sendKeys(email);
			email_text.click();
		}
		else
		{
			throw new Exception("unable to enter text in email file");
		}
	}
	
	
	public void textvalidation()
	{
		if(validate_text.isDisplayed())
		{
			String str=validate_text.getText();
			System.out.println(str);
			
			String str1=validate_text.getText();
			
			String str2="Log in to your OpenCart account";
	
			
			
			if(str1.equals(str2))
			{
				System.out.println("text validation is correct");
			}
			
			
			
		}
	}
	
}
