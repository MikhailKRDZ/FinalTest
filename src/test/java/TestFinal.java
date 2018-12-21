import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
<<<<<<< HEAD
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Optional;
import pages.*;
import java.util.UUID;
import java.util.*;
import java.util.concurrent.TimeUnit;
=======
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.*;

import java.util.HashMap;
import java.util.Map;
>>>>>>> d6ea5c0d71a9c69c4f431d6e125a9eef7b5bca9d

public class TestFinal {
    private WebDriver driver;
    private HomePage homePage;
    private ContactUsPage contactUsPage;
    private SearchResultPage searchResultPage;
    private SignInPage signInPage;
    private AuthenticationPage authenticationPage;

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
<<<<<<< HEAD
        homePage = PageFactory.initElements(driver, HomePage.class);
        contactUsPage = PageFactory.initElements(driver, ContactUsPage.class);
        searchResultPage = PageFactory.initElements(driver, SearchResultPage.class);
        signInPage = PageFactory.initElements(driver, SignInPage.class);
        authenticationPage = PageFactory.initElements(driver, AuthenticationPage.class);
=======
        homePage = new HomePage(driver);
        contactUsPage = new ContactUsPage(driver);
        searchResultPage = new SearchResultPage(driver);
        signInPage = new SignInPage(driver);
        authenticationPage = new AuthenticationPage(driver);
        Actions builder = new Actions(driver);
>>>>>>> d6ea5c0d71a9c69c4f431d6e125a9eef7b5bca9d
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
<<<<<<< HEAD
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

        Assert.assertTrue(driver.getTitle().contains("My account"), "Header contains My account ");
        driver.getCurrentUrl();
=======
        authenticationPage.gender();
        int d = 251232198;
>>>>>>> d6ea5c0d71a9c69c4f431d6e125a9eef7b5bca9d
    }
}


