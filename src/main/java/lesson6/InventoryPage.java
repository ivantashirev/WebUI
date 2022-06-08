package lesson6;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InventoryPage extends BasePage {
    public InventoryPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement addToCartSauceLabsBackPack;

    @Step("Zasun' v korzinu")
    public void addToCart() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(addToCartSauceLabsBackPack));
        addToCartSauceLabsBackPack.click();
    }
}
