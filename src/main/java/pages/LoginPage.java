package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    @CacheLookup
    @FindBy(how = How.ID, using = "quick_email")
    private WebElement login;

    @CacheLookup
    @FindBy(how = How.ID, using = "quick_pass")
    private WebElement password;

    @CacheLookup
    @FindBy(how = How.ID, using = "quick_login_button")
    private WebElement loginButton;

    public void login(String email, String pass) {
        login.clear();
        login.sendKeys(email);
        password.clear();
        password.sendKeys(pass);
        loginButton.click();
    }
}
