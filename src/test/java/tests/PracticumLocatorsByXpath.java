package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PracticumLocatorsByXpath extends BaseTest {
    String loginButtonLocatorByXpath = "//input[@id='login-button']";
    String nameVariantsLocatorByXpath = "//h4[text()='Accepted usernames are:']";
    String pictureLocatorByXpath = "//div[contains(@class,'bot')]";
    String getNameVariants2LocatorByXpath = "//div[contains(text(),'us')]";
    String shoppingCartLinkLocatorByXpath = "//span[@class='shopping_cart_badge']//ancestor::a";
    String signTwitterLocatorByXpath = "//ul[@class='social']//descendant::li[1]";
    String shoppingCartLocatorByXpathFollowing = "//div[@class='header_label']//following::div";
    String socialNetworksLocatorByXpath = "//li[@class='social_facebook']/parent::*";
    String fieldUserNameLocatorByXpath = "//input[@id = 'password']//preceding::input";
    String fieldPasswordLocatorByXpath = "//input[@class='input_error form_input' and @type='password']";

    @Test
    public void addLocators() {
        driver.findElement(By.xpath(loginButtonLocatorByXpath));
        driver.findElement(By.xpath(nameVariantsLocatorByXpath));
        driver.findElement(By.xpath(pictureLocatorByXpath));
        driver.findElement(By.xpath(getNameVariants2LocatorByXpath));
        driver.findElement(By.xpath(shoppingCartLinkLocatorByXpath));
        driver.findElement(By.xpath(signTwitterLocatorByXpath));
        driver.findElement(By.xpath(shoppingCartLocatorByXpathFollowing));
        driver.findElement(By.xpath(socialNetworksLocatorByXpath));
        driver.findElement(By.xpath(fieldUserNameLocatorByXpath));
        driver.findElement(By.xpath(fieldPasswordLocatorByXpath));





    }


}
