package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationPage {
    private WebDriver driver;

    @FindBy(xpath = "//div[@id='center_column']//p[starts-with(@class,'alert')]")
    private WebElement alertSuccess_locator;
    @FindBy(xpath = "//a[text()='Back to orders']")
    private WebElement buttonBackToOrders_locator;


    public String getTextAlertSuccess() {
        return alertSuccess_locator.getText();
    }

    public void clickButtonBackToOrders() {
        buttonBackToOrders_locator.click();
    }

}
