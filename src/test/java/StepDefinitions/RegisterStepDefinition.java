package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pagefactory.Login_page_opencart;
import pagefactory.RegisterPage;
import pagefactory.Registerpageobjects;

public class RegisterStepDefinition {
	WebDriver driver = null;
	Login_page_opencart login;
	RegisterPage reg;
	Registerpageobjects registerpage;
	
	@Given("I launch URL")
	public void browser_is_open() {
	System.out.println("  ===  I am inside LoginDemoSteps_PF class ===== ");
			
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}
	@And("I click on register button")
	public void register_button() 
	{
		login=new Login_page_opencart(driver);
		
	
		login.registerbutton();
		
	}

	@When("I enter username {string}")
	public void i_enter_username(String username) {
		reg=new RegisterPage(driver);
	    reg.usernamebutton(username);
      
	}

	@When("I enter firstname {string}")
	public void i_enter_firstname(String firstname) {
		reg=new RegisterPage(driver);
	    reg.firstnamebutton(firstname);
	}

	@When("I enter Lastname {string}")
	public void i_enter_Lastname(String lastname) {
		reg=new RegisterPage(driver);
	    reg.lastnamebutton(lastname);
	}

	@When("I enter email address {string}")
	public void i_enter_email_address(String emailaddress) {
		reg=new RegisterPage(driver);
	    reg.email(emailaddress);
	}

	@When("I select country {string} from the dropdown")
	public void i_select_country_from_the_dropdown(String drp) {
		reg=new RegisterPage(driver);
		reg.selectcountry(drp);
		
	}

	@When("i enter password {string}")
	public void i_enter_password(String string) {
		reg=new RegisterPage(driver);
		reg.password(string);
	}
	
	@When("I click On register button in opencart page")
	public void i_click_On_register_button_in_opencart_page() throws Exception {
		registerpage=new Registerpageobjects(driver);
		registerpage.ClickOnregisterButton();
	}
	
	@When("I enter {string} as username in opencart page")
	public void i_enter_as_username_in_opencart_page(String email) throws Exception {
		registerpage=new Registerpageobjects(driver);
		registerpage.inputusername(email);
//email=mani551@gmail.com
	
	}
	
	@When("I enter {string} as firstname in opencart page")
	public void i_enter_as_firstname_in_opencart_page(String firstname) throws Exception {
		registerpage=new Registerpageobjects(driver);
		registerpage.inputfirstname(firstname);
	}
}
