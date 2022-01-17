package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PracticumCSSLocators extends BaseTest {

    String errorMessageLocatorByCss = ".error-message-container";
    String loginButtonLocatorByCss = "#login-button";
    String loginFormLocatorByCss = "[class^='form_c']";
    String picturesLocatorByCss = ".inventory_item_img.inventory_item_img";
    String getLoginFormLocatorByCss = ".login-box .form_group";
    String getTitleLocatorByCss = "title";
    String acceptedUsernamesAndPasswordLocatorByCss = "div.login_credentials_wrap";
    String loginButtonFormLocatorByCss = "[id=login_button_container]";
    String loginBoxlocatorByCss = "[class$='box']";
    String cheackOutButtonByCss = "[name~=checkout]";
    String headerContainerLocatorByCss = "[id*='header']";
    String socealNetworLocatorByCss = "[class|=\"social\"]";


    @Test
    public void cssLocators() {
        driver.findElement(By.cssSelector(errorMessageLocatorByCss));
        driver.findElement(By.cssSelector(loginFormLocatorByCss));
        driver.findElement(By.cssSelector(loginButtonLocatorByCss));
        driver.findElement(By.cssSelector(picturesLocatorByCss));
        driver.findElement(By.cssSelector(getLoginFormLocatorByCss));
        driver.findElement(By.cssSelector(getTitleLocatorByCss));
        driver.findElement(By.cssSelector(acceptedUsernamesAndPasswordLocatorByCss));
        driver.findElement(By.cssSelector(loginButtonFormLocatorByCss));
        driver.findElement(By.cssSelector(loginBoxlocatorByCss));
        driver.findElement(By.cssSelector(cheackOutButtonByCss));
        driver.findElement(By.cssSelector(headerContainerLocatorByCss));
        driver.findElement(By.cssSelector(socealNetworLocatorByCss));

    }
}
