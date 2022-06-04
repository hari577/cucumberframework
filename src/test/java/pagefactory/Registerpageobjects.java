package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Registerpageobjects {
	WebDriver driver;
	@FindBy(xpath = "//a[text()='Register' and @class='btn btn-black navbar-btn']")
	WebElement btn_register;
	@FindBy(xpath = "//input[@id='input-username']")
	WebElement input_username;
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement input_firstname;
	public Registerpageobjects(WebDriver driver) {
		this.driver = driver;
		
		
		//AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}
	
	public void ClickOnregisterButton() throws Exception
	{
		if(btn_register.isDisplayed())
		{
			btn_register.click();
		}
		else
		{
			throw new Exception("register button is not displayed");
		}
	}
	
	public void inputusername(String username) throws Exception
	{
		
		
		if(input_username.isDisplayed())
		{
			input_username.click();
			input_username.sendKeys(username);
		}
		else
		{
			throw new Exception("register button is not displayed");
		}
	}
	public void inputfirstname(String firstname) throws Exception
	{
		if(input_firstname.isDisplayed())
		{
			input_firstname.click();
			input_firstname.sendKeys(firstname);
		}
		else
		{
			throw new Exception("register button is not displayed");
		}
	}	
	}
	
	

