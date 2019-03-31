package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Catalog {

    private WebDriver driver;

    @FindBy(className = "cat-name")
    private WebElement catalogName_locator;
    @FindBy(className = "product-container")
    private WebElement productContainer_locator;
    @FindBy(className = "right-block")
    private WebElement rightBlock_locator;
    @FindBy(xpath = "//button[@class='exclusive']")
    private WebElement buttonExclusive_locator;
    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    private WebElement buttonContinueExclusive_locator;


    public String getCatalogName(){
        return catalogName_locator.getText();
    }

    public  WebElement getproductContainerLocator() {
        return productContainer_locator;
    }
    public void clickRightBlock() {
        rightBlock_locator.click();
    }

    public void addButtonExclusive() {
         buttonExclusive_locator.click();
    }
    public void getButtonContinueExclusive() {
        buttonContinueExclusive_locator.click();
    }

}
