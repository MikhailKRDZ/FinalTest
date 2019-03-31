package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPage {
    private WebDriver driver;

    @FindBy(xpath = "//input[@id='cgv']")
    private WebElement checkboxCgv_locator;
    @FindBy(xpath = "//button[@name='processCarrier']")
    private WebElement buttonProcessCarrier_locator;
    @FindBy(xpath = "//span[@id='total_price']")
    private WebElement totalPrice_locator;


    public void getCheckboxCgv() {
        checkboxCgv_locator.click();
    }

    public void getButtonProcessCarrier() {
        buttonProcessCarrier_locator.click();
    }

    public String getTotalPrice() {
      return   totalPrice_locator.getText();
    }

}
