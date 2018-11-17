package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    private static By contactLink_locator = By.id("contact-link");
    private static By headerUserInfo_locator = By.className("header_user_info");

    public void contactUsPage() {
        driver.findElement(contactLink_locator).click();
    }
    public void signInPage() {
        driver.findElement(headerUserInfo_locator).click();
    }
}
