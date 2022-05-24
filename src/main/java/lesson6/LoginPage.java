package lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class LoginPage  extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "user-name")
    public WebElement userNameField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(id = "login-button")
    public WebElement loginButton;


    public void login(String userName,String password) {
        userNameField.sendKeys(userName);
        passwordField.sendKeys(password);
        loginButton.click();
    }

}
