package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ConfigManager;

public class LoginPage extends BasePage{

    @FindBy(id = "manager-name")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login")
    private WebElement loginButton;

    public void enterUserName() {
        userName.sendKeys(ConfigManager.getProperty("username"));
    }

    public void enterPassword() {
        password.sendKeys(ConfigManager.getProperty("password"));
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }




}
