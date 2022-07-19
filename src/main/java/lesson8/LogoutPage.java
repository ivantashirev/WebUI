package lesson8;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class LogoutPage {
    private SelenideElement burgerButton = $(By.id("react-burger-menu-btn"));

    private SelenideElement logoutButton = $(By.id("logout_sidebar_link"));

    @Step("Razlogiruemsa na vsu katushku")
    public void clickLogout() {
        burgerButton.click();
        logoutButton.click();
    }


}
