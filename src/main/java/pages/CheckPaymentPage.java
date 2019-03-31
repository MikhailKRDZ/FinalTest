package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckPaymentPage {
        private WebDriver driver;

    @FindBy(xpath = "//button[@type='submit']//span[text()='I confirm my order']")
    private WebElement buttonConfirmMyOrder_locator;


    public void getButtonConfirmMyOrder() {
            buttonConfirmMyOrder_locator.click();}

}
