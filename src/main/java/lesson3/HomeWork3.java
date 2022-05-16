package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class HomeWork3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");
        Thread.sleep(2000);

        //Authorization
        WebElement userNameField = driver.findElement(By.id("user-name"));
        userNameField.sendKeys("standard_user");
        Thread.sleep(1000);

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");
        Thread.sleep(1000);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        Thread.sleep(1000);

        //Add to cart Sauce Labs Backpack
        WebElement testAddToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        testAddToCart.click();
        Thread.sleep(1000);

        //Remove from cart
        WebElement cartIcon = driver.findElement(By.id("shopping_cart_container"));
        cartIcon.click();
        Thread.sleep(1000);

        WebElement removeFromCart = driver.findElement(By.id("remove-sauce-labs-backpack"));
        removeFromCart.click();
        Thread.sleep(1000);

        //Logout
        WebElement burgerMenuButton = driver.findElement(By.id("react-burger-menu-btn"));
        burgerMenuButton.click();
        Thread.sleep(3000);

        WebElement logoutButton = driver.findElement(By.id("logout_sidebar_link"));
        logoutButton.click();
        Thread.sleep(3000);


        driver.quit();
    }

}

