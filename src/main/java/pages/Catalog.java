package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Catalog {
    private WebDriver driver;

    @FindBy(className = "cat-name")
    private WebElement catalogName_locator;

    public String getCatalogName(){
        return catalogName_locator.getText();
    }
}
