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
	
	
	@FindBy(xpath = "//a[text()='Forgot your password?']")
	WebElement btn_forgotpassword;
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement text_email;
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitbutton;
	@FindBy(xpath = "(//p)[1]")
	WebElement validatetext;
	
	@FindBy(xpath = "//div[@class='alert alert-success']")
	WebElement successvalidation;
	
	
	
	
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
	
	public void clickOnforgotpassword()
	{
		btn_forgotpassword.click();
	}
	
	public void textemail(String str)
	{
		text_email.click();
		text_email.sendKeys(str);
	}
	public void clickOnsubmitButton() throws InterruptedException
	{
		submitbutton.click();
		Thread.sleep(5000);
		
	}

	public void successvalidation(String success)
	{
		String str=successvalidation.getText();
		System.out.println(str);
		String str1=str.substring(0, 69);
		System.out.println(str1);
		if(str1.equals(success))
		{
			System.out.println("validation pass");
		}
	}
}
