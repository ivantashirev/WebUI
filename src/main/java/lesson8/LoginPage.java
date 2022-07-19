package lesson8;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {

    private SelenideElement userNameField = $(By.id("user-name"));

    private SelenideElement passwordField = $(By.id("password"));

    private SelenideElement loginButton = $(By.id("login-button"));

    @Step("Logiruemsa na vsu katushku")
    public lesson8.InventoryPage login(String userName, String password) {
        userNameField.sendKeys(userName);
        passwordField.sendKeys(password);
        loginButton.click();
        return page(InventoryPage.class);
    }

}
