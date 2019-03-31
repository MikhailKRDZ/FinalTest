package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdressPage {
    private WebDriver driver;

    @FindBy(xpath = "//button[@name='processAddress']")
    private WebElement buttonProcessAdress_locator;

    public void getButtonProcessAdress() {
        buttonProcessAdress_locator.click();
    }
}
