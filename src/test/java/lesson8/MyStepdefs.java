package lesson8;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;

public class MyStepdefs {
    @Given("User authorized")
    public void userAuthorized() {
        open("https://www.saucedemo.com");
        new LoginPage().login("standard_user", "secret_sauce");
    }

    @When("Click SauceLabsBackpack button in page")
    public void clickSauceLabsBackpackButtonInPage() {
        new InventoryPage().addToCart();
    }

    @And("remove SauceLabsBackpack")
    public void removeSauceLabsBackpack() {
        new CartPage().removeCart();
    }

    @Then("logout user")
    public void clickToBurgerMenu() {
        new LogoutPage().clickLogout();
    }


    @After (value = "@close")
    public void quitBrowser() {
        Selenide.closeWebDriver();
    }
}
