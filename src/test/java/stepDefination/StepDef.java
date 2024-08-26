package stepDefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import myhooks.Hook;
import pom.LoginPage;

public class StepDef {

	WebDriver driver;
    LoginPage login;
    
    public StepDef() {
        this.driver = Hook.driver;
        this.login = new LoginPage(driver);
    }

	@Given("the user is on the login page {string}")
	public void the_user_is_on_the_login_page(String url) {
	   driver.get(url);
	    
	}

	@And("the user enters a valid username {string}")
	public void the_user_enters_a_valid_username(String email) {
	   login.enterEmail(email);
	    
	}

	@And("the user enters a valid password {string}")
	public void the_user_enters_a_valid_password(String pass) {
	    login.enterPassword(pass);
	   
	}

	@And("the user clicks the login button")
	public void the_user_clicks_the_login_button() {
	    login.clickloginnButton();
	   
	}








}
