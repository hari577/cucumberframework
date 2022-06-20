package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.Login_page_opencart;
import pagefactory.Marketplace;
import pagefactory.Paymentgateway;
import pagefactory.RegisterPage;
import pagefactory.Registerpage_opencart;
import pagefactory.Registerpageobjects;
import pagefactory.pagedemoleela;
import pagefactory.pagedemomani;

public class RegisterStepDefinition {
	WebDriver driver = null;
	Login_page_opencart login;
	RegisterPage reg;
	Registerpageobjects registerpage;
	Paymentgateway paymentg;
	Marketplace mp;
	pagedemomani pdm;
	pagedemoleela pdl;
	Registerpage_opencart roc;
	
	
	
	@Given("I launch URL")
	public void browser_is_open() {
	System.out.println("  ===  launching an url ===== ");
			
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		
		
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
	public void i_select_country_from_the_dropdown(String selectcountry) {
		reg=new RegisterPage(driver);
		reg.selectcountry(selectcountry);
		
	}

	@When("i enter password {string}")
	public void i_enter_password(String pass) {
		reg=new RegisterPage(driver);
		reg.password(pass);
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
	
	@Given("i click on login button")
	public void i_click_on_login_button() throws Exception {
		paymentg=new Paymentgateway(driver);
		paymentg.clickonloginbutton();
	}

	@Given("user enters {string} as email i")
	public void user_enters_as_email_i(String string) throws Exception {
		paymentg=new Paymentgateway(driver);
		paymentg.enteremailid(string);
	}
	@Then("i validate the text {string}")
	public void i_validate_the_text() {
		paymentg=new Paymentgateway(driver);
		paymentg.textvalidation();
	}
	


	@When("i click on marketplace")
	public void i_click_on_marketplace() throws Exception {
	mp=new Marketplace(driver);
	mp.ClickOnMarketPlaceButton();
	}

	@Then("i validate text {string}")
	public void i_validate_text(String string) {
	    pdm=new pagedemomani(driver);
	    pdm.sample();
	    
	}

	@Then("i click on something")
	public void i_click_on_something() {
pdl=new pagedemoleela(driver);
pdl.demoleela();

	}
	
	@When("i select full name as {string}")
	public void i_select_full_name_as(String fullname) {
	   roc=new Registerpage_opencart(driver);
	   roc.clickonfullname(fullname);
	}
	@When("i click on forgot your password button")
	public void i_click_on_forgot_your_password_button() {
		login=new Login_page_opencart(driver);
	    login.clickOnforgotpassword();
	}

	@When("i enter email address as {string}")
	public void i_enter_email_address_as(String string) {
		login=new Login_page_opencart(driver);
	     login.textemail(string);
	}

	
	@When("i click on submit button")
	public void i_click_on_submit_button() throws InterruptedException {
		login=new Login_page_opencart(driver);
	    login.clickOnsubmitButton();
	}
	@Then("i validate {string}")
	public void i_validate(String string) {
		login=new Login_page_opencart(driver);
		login.successvalidation(string);
	}
}
