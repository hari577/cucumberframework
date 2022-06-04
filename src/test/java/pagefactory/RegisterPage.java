package pagefactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	WebDriver driver;
	@FindBy(xpath ="//input[@name='username']")
	WebElement btn_username;
	@FindBy(xpath ="//input[@id='input-firstname']")
	WebElement btn_firstname;
	@FindBy(xpath ="//input[@id='input-lastname']")
	WebElement btn_lastname;
	
	@FindBy(xpath ="//input[@id='input-email']")
	WebElement btn_email;
	
	@FindBy(xpath ="//select[@id='input-country']")
	WebElement btn_inputcountry;
	
	@FindBy(xpath ="//input[@id='input-password']")
	WebElement btn_inputpassword;
	
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		
		
		//AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}
	
	public void usernamebutton(String username) 
	{
		
		try
		{
			if(btn_username.isDisplayed())
			{
			btn_username.click();
			btn_username.sendKeys(username);
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void firstnamebutton(String username) 
	{
		
		try
		{
			if(btn_firstname.isDisplayed())
			{
				btn_firstname.click();
				btn_firstname.sendKeys(username);
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
		
	public void lastnamebutton(String username) 
	{
		
		try
		{
			if(btn_lastname.isDisplayed())
			{
				btn_lastname.click();
				btn_lastname.sendKeys(username);
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
				
	public void email(String username) 
	{
		
		try
		{
			if(btn_email.isDisplayed())
			{
				btn_email.click();
				btn_email.sendKeys(username);
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void selectcountry(String username) 
	{
		
		try
		{
			Select dropDown = new Select(btn_inputcountry);
			List<WebElement> e = dropDown.getOptions();
			

			for(int i = 0; i <  e.size(); i++)
			{
			    System.out.println(e.get(i).getText());
			}
			dropDown.selectByVisibleText(username);
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}			
	
	public void password(String username) 
	{
		
		try
		{
			if(btn_inputpassword.isDisplayed())
			{
				btn_inputpassword.click();
				btn_inputpassword.sendKeys(username);
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

