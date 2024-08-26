package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import myhooks.Hook;

public class LoginPage {
    
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver=Hook.driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(id="Email")
    WebElement username;
    
    @FindBy(id="Password")
    WebElement password;
    
    @FindBy(xpath="//button[@class = 'button-1 login-button']")
    WebElement loginButton;
    
    
    public void enterEmail(String user) {
        username.sendKeys(user);
    }
    
    public void enterPassword(String pass) {
        password.sendKeys(pass);
    }
        
    
    public void clickloginnButton() {
        loginButton.click();
    }

}
