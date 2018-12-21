package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {
    private WebDriver driver;

    @FindBy(id = "email_create")
    WebElement emailCreate_locator;
    @FindBy(className = "icon-user")
    WebElement iconUser_locator;



    public void emailCreate(String mail) {
        emailCreate_locator.sendKeys(mail + "@mail.ru");
    }

    public void iconUser() {
        iconUser_locator.click();
    }
}


