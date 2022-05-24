package lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogoutPage extends BasePage {
    public LogoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "react-burger-menu-btn")
    public WebElement burgerButton;

    @FindBy(id = "logout_sidebar_link")
    public WebElement logoutButton;

    public void clickLogout() throws InterruptedException{
        webDriverWait.until(ExpectedConditions.elementToBeClickable(burgerButton));
        burgerButton.click();
        Thread.sleep(3000);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(logoutButton));
        logoutButton.click();
    }


}
