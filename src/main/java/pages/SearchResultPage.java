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

    public String getSearchGoodsName() {
        return seachHeading_locator.getText();
    }

    public Integer getNumbersOfItemsFound() {
        String str = headingCounter_locator.getText();
        str = str.replaceAll("\\D+","");
        return Integer.valueOf(str);
    }
}