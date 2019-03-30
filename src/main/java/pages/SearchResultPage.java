package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage {
    private WebDriver driver;

    @FindBy(className = "lighter")
    private WebElement seachHeading_locator;
    @FindBy(className = "heading-counter")
    private WebElement headingCounter_locator;
    @FindBy(xpath = "//a[@title='Add to cart']")
    private WebElement addToCart_locator;
    @FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
    private WebElement checkout_locator;


     public String getSearchGoodsName() {
        return seachHeading_locator.getText();
    }

    public Integer getNumbersOfItemsFound() {
        String str = headingCounter_locator.getText();
        str = str.replaceAll("\\D+","");
        return Integer.valueOf(str);
    }

    public void addToCart() {
        addToCart_locator.click();
    }

    public void checkout() {
        checkout_locator.click();
    }
}