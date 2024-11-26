package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(name = "username")
    static WebElement txtUsername;
    @FindBy(name = "password")
    static WebElement txtPassword;
    @FindBy(css="[type=\"submit\"]")
    static WebElement btnLogin;
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements (driver,this);

    }

    public void doLogin(String username, String password){
        txtUsername.sendKeys (username);
        txtPassword.sendKeys (password);
        btnLogin.click ();
    }
}
