import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.ContactUsPage;
import pages.HomePage;
import pages.SearchResultPage;
import pages.SignInPage;
import java.util.HashMap;
import java.util.Map;

public class TestFinal {
    private WebDriver driver;
    private HomePage homePage;
    private ContactUsPage contactUsPage;
    private SearchResultPage searchResultPage;
    private SignInPage signInPage;

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
                driver.manage().window().setSize(dimension);
            }
        }
        driver.get("http://automationpractice.com/index.php");
        homePage = new HomePage(driver);
        contactUsPage = new ContactUsPage(driver);
        searchResultPage = new SearchResultPage(driver);
        signInPage = new SignInPage(driver);
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
        homePage.signInPage();
        signInPage.emailCreate();
        signInPage.iconUser();

        int d = 2512;
    }
}



