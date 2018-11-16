package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    private WebDriver driver;
    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    private static By emailCreate_locator = By.id("email_create");
    private static By iconUser_locator = By.className("icon-user");


public void emailCreate() {
    driver.findElement(emailCreate_locator).sendKeys("ik@mail.ru");
}
    public void iconUser() {
        driver.findElement(iconUser_locator).click();
    }


}
