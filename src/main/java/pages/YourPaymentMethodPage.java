package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourPaymentMethodPage {
    private WebDriver driver;

    @FindBy(xpath = "//p[@class='payment_module']//a[@class='cheque']")
    private WebElement buttonPaymentCheque_locator;

    public void getButtonPaymentCheque() {
        buttonPaymentCheque_locator.click();
    }
}
