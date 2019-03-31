package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderHistoryPage {
    private WebDriver driver;

    @FindBy(xpath = "//span[@class='price']")
    private WebElement price_locator;

    public String getPrice() {
      return price_locator.getText();
    }
}
