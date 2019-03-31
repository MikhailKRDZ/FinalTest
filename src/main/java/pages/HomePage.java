package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    private WebDriver driver;

    @FindBy(id = "contact-link")
    private WebElement contactLink_locator;
    @FindBy(className = "header_user_info")
    private WebElement headerUserInfo_locator;
    @FindBy(id = "search_query_top")
    private WebElement searchGoods_locator;
    @FindBy(name = "submit_search")
    private WebElement submit_search_locator;
    @FindBy(xpath = "//a[@title='Women']")
    private WebElement women_locator;
    @FindBy(xpath = "//ul[@class='submenu-container clearfix first-in-line-xs']//a[@title='T-shirts']")
    private WebElement tShirt_locator;

    public void contactUsPage() {
        contactLink_locator.click();
    }

    public void signInPage() {
        headerUserInfo_locator.click();
    }
    public void searchGoods(String search) {
        searchGoods_locator.sendKeys(search);
        submit_search_locator.click();
    }

    public WebElement getWomen() {
        return women_locator;
    }
    public void getTshirt() {
        tShirt_locator.click();
    }

}
