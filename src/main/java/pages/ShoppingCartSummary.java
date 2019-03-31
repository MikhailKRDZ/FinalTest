package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartSummary {
    private WebDriver driver;

    @FindBy(xpath = "//a[@title='View my shopping cart']")
    private WebElement viewMyShoppingCart_locator;
    @FindBy(xpath = "//span[@class='quantity']")
    private WebElement quantity_locator;
    @FindBy(xpath = "//a[@class='cart_block_product_name']")
    private WebElement cartBlockProductName_locator;
    @FindBy(xpath = "//a[@class='ajax_cart_block_remove_link']")
    private WebElement cartRemoveLink_locator;
    @FindBy(xpath = "//span[@class='ajax_cart_no_product']")
    private WebElement ajaxCartNoProduct_locator;
    @FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
    private WebElement buttonCheckout_locator;

    public  WebElement getViewMyShoppingCart() {
        return viewMyShoppingCart_locator;
    }

    public  Integer getProductsNumbersInShoppingCart() {
        String str = quantity_locator.getText();
        return Integer.valueOf(str);
    }
    public  String getProductsNameInShoppingCart() {
        String str = cartBlockProductName_locator.getText();
        return str;
    }
    public  void cartRemoveLink() {
        cartRemoveLink_locator.click();
    }
    public  String getStringViewMyShoppingCart() {
        String str = ajaxCartNoProduct_locator.getText();
        return str;
    }
    public  void getButtonCheckout() {
        buttonCheckout_locator.click();
    }
}
