package lesson6;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "shopping_cart_container")
    public WebElement shoppingCartContainer;

    @FindBy(id = "remove-sauce-labs-backpack")
    public WebElement removeSauceLabsBackpack;

    @Step("Nahren iz korzini")
    public void removeCart() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(removeSauceLabsBackpack));
        removeSauceLabsBackpack.click();
    }
}
