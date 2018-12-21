package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage {
    private WebDriver driver;


    @FindBy(id = "contact-link")
    private WebElement contactLink_locator;
    @FindBy(className = "header_user_info")
    private WebElement headerUserInfo_locator;

    public void contactUsPage() {
        contactLink_locator.click();
    }

    public void signInPage() {
        headerUserInfo_locator.click();
    }
}
