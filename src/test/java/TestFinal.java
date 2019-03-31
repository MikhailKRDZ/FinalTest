import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Optional;
import pages.*;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class TestFinal {
    private WebDriver driver;
    private HomePage homePage;
    private ContactUsPage contactUsPage;
    private SearchResultPage searchResultPage;
    private SignInPage signInPage;
    private AuthenticationPage authenticationPage;
    private ShoppingCartSummary shoppingCartSummary;
    private Catalog catalog;

    @BeforeMethod(alwaysRun = true)
    @Parameters({"Browser", "Device", "Width", "Height"})
    public void start(@Optional String browserName,
                      @Optional String deviceName,
                      @Optional Integer width,
                      @Optional Integer height) {
        if (browserName == null || browserName.isEmpty()) {
            driver = new ChromeDriver();
//            driver = new FirefoxDriver();
        } else {
            if (browserName.contentEquals("Chrome")) {
                if (deviceName != null && !deviceName.isEmpty()) {
                    Map<String, String> mobileEmulation = new HashMap<String, String>();
                    mobileEmulation.put("deviceName", deviceName);
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
                    driver = new ChromeDriver(chromeOptions);
                } else {
                    driver = new ChromeDriver();
                }
            } else if (browserName.contentEquals("ff")) {
                driver = new FirefoxDriver();
            } else {
                driver = new ChromeDriver();
            }
        }
        if (deviceName != null && !deviceName.isEmpty()) {
            if (width != null && width != 0 && height != null && height != 0) {
                Dimension dimension = new Dimension(width, height);
                driver.manage().window().maximize();
            }
        }
        driver.get("http://automationpractice.com/index.php");

        homePage = PageFactory.initElements(driver, HomePage.class);
        contactUsPage = PageFactory.initElements(driver, ContactUsPage.class);
        searchResultPage = PageFactory.initElements(driver, SearchResultPage.class);
        signInPage = PageFactory.initElements(driver, SignInPage.class);
        authenticationPage = PageFactory.initElements(driver, AuthenticationPage.class);
        shoppingCartSummary = PageFactory.initElements(driver, ShoppingCartSummary.class);
        catalog = PageFactory.initElements(driver, Catalog.class);
    }

    @AfterMethod(alwaysRun = true)
    public void finish() {
        driver.quit();
    }

    @Test()
    public void contactUsFormSendsSuccessfully() {
        homePage.contactUsPage();
        contactUsPage.uniformIdContact();
        contactUsPage.descContact2();
        contactUsPage.formControl();
        contactUsPage.fileUpload();
        contactUsPage.message();
        contactUsPage.submitMessage();

        String contactUsFormSends = contactUsPage.successfullySent();

        Assert.assertEquals("Your message has been successfully sent to our team.", contactUsFormSends,
                "Search result should contain 'Your message has been successfully sent to our team.'");
    }

    @Test()

    public void errorMessageAppearsIfMessageAreaIsEmpty() {
        homePage.contactUsPage();
        contactUsPage.uniformIdContact();
        contactUsPage.descContact2();
        contactUsPage.formControl();
        contactUsPage.fileUpload();
        contactUsPage.submitMessage();

        String errorMessageAppears = contactUsPage.cannotBeBlank();

        Assert.assertEquals("The message cannot be blank.", errorMessageAppears,
                "Search result should contain 'The message cannot be blank.");
    }

    @Test
    public void verifyTheAbilityToRegister() {

        String randomText = UUID.randomUUID().toString();

        homePage.signInPage();
        signInPage.emailCreate(randomText);
        signInPage.iconUser();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        authenticationPage.idGender();
        authenticationPage.customerFirstName();
        authenticationPage.customerLastName();
        authenticationPage.password();
        authenticationPage.dateOfBirth();
        authenticationPage.monthOfBirth();
        authenticationPage.yearOfBirth();
        authenticationPage.signNewsletter();
        authenticationPage.receiveSpecialOffersFromOurPartners();
        authenticationPage.firstName();
        authenticationPage.lastName();
        authenticationPage.companyName();
        authenticationPage.address1();
        authenticationPage.address2();
        authenticationPage.city();
        authenticationPage.state();
        authenticationPage.postcode();
        authenticationPage.country();
        authenticationPage.additionalInformation();
        authenticationPage.homePhone();
        authenticationPage.mobilePhone();
        authenticationPage.assignAnAddressAliasForFutureReference();
        authenticationPage.registerButton();
        driver.getCurrentUrl();

        Assert.assertTrue(driver.getTitle().contains("My account"), "Header contains My account ");
    }

    @Test
    public void verifyTheAbilityToSearchItems() {
        homePage.searchGoods("Blouse");
        String searchGoods = searchResultPage.getSearchGoodsName();
        Integer numbersOfItemsFound = searchResultPage.getNumbersOfItemsFound();

        Assert.assertTrue(searchGoods.contains("BLOUSE"), "Header contains Blouse ");

        Assert.assertTrue(numbersOfItemsFound > 0, "numbersOfItemsFound more than 0 ");
    }

    @Test
    public void verifyTheAbilityToAddAndDeleteItemsFromCart() {
        String expectedGood = "Blouse";
        homePage.searchGoods(expectedGood);
        searchResultPage.addToCart();
        try {
            WebDriverWait wait = new WebDriverWait(driver, 2);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
        }

        searchResultPage.checkout();
        Actions actions = new Actions(driver);
        WebElement shopCart = shoppingCartSummary.getViewMyShoppingCart();
        actions.moveToElement(shopCart).perform();

        Assert.assertEquals(true,shoppingCartSummary.getProductsNumbersInShoppingCart() == 1, "item successfully added to your cart");

        Assert.assertEquals(expectedGood,shoppingCartSummary.getProductsNameInShoppingCart(),"expectedGood and productsNameInShoppingCart the same");

        shoppingCartSummary.cartRemoveLink();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Assert.assertEquals("(empty)",shoppingCartSummary.getStringViewMyShoppingCart(),"Removed item from basket, shoppingCart is empty");
    }

    @Test
    public void catalogTest() {
        Actions actions = new Actions(driver);
        WebElement women = homePage.getWomen();
        actions.moveToElement(women).perform();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        homePage.getTshirt();
        catalog.getCatalogName();
        System.out.println(catalog.getCatalogName());

        Assert.assertEquals(catalog.getCatalogName(), "T-SHIRTS ", "catalog name T-SHIRTS ");
    }
}


