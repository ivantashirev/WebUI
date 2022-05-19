package lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Lesson5Test {
    WebDriver driver;
    WebDriverWait webDriverWait;


    @BeforeAll
    static void registerDriver(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() throws InterruptedException{
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://saucedemo.com");

        WebElement userNameField = driver.findElement(By.id("user-name"));
        userNameField.sendKeys("standard_user");
        Thread.sleep(1000);


        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");
        Thread.sleep(1000);


        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        Thread.sleep(1000);
    }

    @Test
    void addToCartAndDeleteFromCart() throws InterruptedException {
        //Add to cart Sauce Labs Backpack
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-sauce-labs-backpack")));
        WebElement testAddToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        testAddToCart.click();
        Thread.sleep(1000);

        //Remove from cart
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("shopping_cart_container")));
        WebElement cartIcon = driver.findElement(By.id("shopping_cart_container"));
        cartIcon.click();
        Thread.sleep(1000);

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("remove-sauce-labs-backpack")));
        WebElement removeFromCart = driver.findElement(By.id("remove-sauce-labs-backpack"));
        removeFromCart.click();
        Thread.sleep(1000);
    }

    @AfterEach
    void logout() throws InterruptedException {
        //Logout
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-burger-menu-btn")));
        WebElement burgerMenuButton = driver.findElement(By.id("react-burger-menu-btn"));
        burgerMenuButton.click();
        Thread.sleep(1000);

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout_sidebar_link")));
        WebElement logoutButton = driver.findElement(By.id("logout_sidebar_link"));
        logoutButton.click();
        Thread.sleep(2000);
    }
    @AfterEach
    void browserClose() {
        driver.quit();
    }
}
