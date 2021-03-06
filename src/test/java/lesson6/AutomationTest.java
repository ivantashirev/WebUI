package lesson6;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Epic("Интернет магазин")
public class AutomationTest {
    WebDriver driver;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
    }

    @Test
    @Feature("Корзина")
    @Story("Добавление и удаление")
    void addToCartTest() throws InterruptedException {
        driver.get("https://www.saucedemo.com");

        new LoginPage(driver).login("standard_user","secret_sauce");
        Thread.sleep(2000);
        new InventoryPage(driver).addToCartSauceLabsBackPack.click();
        Thread.sleep(2000);
        new CartPage(driver).shoppingCartContainer.click();
        Thread.sleep(2000);
        new CartPage(driver).removeSauceLabsBackpack.click();
        Thread.sleep(2000);
        new LogoutPage(driver).burgerButton.click();
        Thread.sleep(2000);
        new LogoutPage(driver).logoutButton.click();
    }

    @AfterEach
    void quitDriver() {
        driver.quit();
    }
}
