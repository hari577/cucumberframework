package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class pagedummy {
	WebDriver driver;
	@FindBy(xpath = "")
	WebElement btn_r;
	
	public pagedummy(WebDriver driver) {
		this.driver = driver;
		
		
		//AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}
}
