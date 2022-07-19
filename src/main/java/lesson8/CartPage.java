package lesson8;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;


public class CartPage {
    private SelenideElement shoppingCartContainer = $(By.id("shopping_cart_container"));

    private SelenideElement removeSauceLabsBackpack = $(By.id("remove-sauce-labs-backpack"));

    @Step("Nahren iz korzini")
    public lesson8.LogoutPage removeCart() {
        removeSauceLabsBackpack.click();
        return page(LogoutPage.class);
    }
}
