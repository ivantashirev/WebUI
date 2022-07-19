package lesson8;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class InventoryPage {
    private SelenideElement addToCartSauceLabsBackPack = $(By.id("add-to-cart-sauce-labs-backpack"));

    @Step("Zasun' v korzinu")
    public lesson8.CartPage addToCart() {
        addToCartSauceLabsBackPack.hover();
        addToCartSauceLabsBackPack.click();
        return page(CartPage.class);
    }
}
