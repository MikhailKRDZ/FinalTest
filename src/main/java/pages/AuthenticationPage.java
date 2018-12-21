package pages;

<<<<<<< HEAD
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPage {
    private WebDriver driver;

    @FindBy(id = "id_gender2")
    private WebElement idGender_locator;
    @FindBy(id = "customer_firstname")
    private WebElement customerFirstName_locator;
    @FindBy(id = "customer_lastname")
    private WebElement customerLastName_locator;
    @FindBy(id = "passwd")
    private WebElement password_locator;
    @FindBy(xpath = "//*[@id='days']/option[3]")
    private WebElement dateOfBirth_locator;
    @FindBy(xpath = "//*[@id='months']/option[6]")
    private WebElement monthOfBirth_locator;
    @FindBy(xpath = "//*[@id='years']/option[119]")
    private WebElement yearOfBirth_locator;
    @FindBy(id = "newsletter")
    private WebElement signNewsletter_locator;
    @FindBy(id = "optin")
    private WebElement receiveSpecialOffersFromOurPartners_locator;
    @FindBy(id = "firstname")
    private WebElement firstName_locator;
    @FindBy(id = "lastname")
    private WebElement lastName_locator;
    @FindBy(id = "company")
    private WebElement companyName_locator;
    @FindBy(id = "address1")
    private WebElement address1_locator;
    @FindBy(id = "address2")
    private WebElement address2_locator;
    @FindBy(id = "city")
    private WebElement city_locator;
    @FindBy(xpath = "//*[@id='id_state']/option[22]")
    private WebElement state_locator;
    @FindBy(id = "postcode")
    private WebElement postcode_locator;
    @FindBy(xpath = "//*[@id='id_country']//option[contains(text(),'United States')]")
    private WebElement country_locator;
    @FindBy(id = "other")
    private WebElement additionalInformation_locator;
    @FindBy(id = "phone")
    private WebElement homePhone_locator;
    @FindBy(id = "phone_mobile")
    private WebElement mobilePhone_locator;
    @FindBy(id = "alias")
    private WebElement assignAnAddressAliasForFutureReference_locator;
    @FindBy(xpath = "//span[(text()='Register')]")
    private WebElement registerButton_locator;

    public void idGender() {
        idGender_locator.click();
    }

    public void customerFirstName() {
        customerFirstName_locator.sendKeys("Abc");
    }

    public void customerLastName() {
        customerLastName_locator.sendKeys("Cba");
    }

    public void password() {
        password_locator.sendKeys("Ab4c6Cba");
    }

    public void firstName() {
        firstName_locator.sendKeys("Abc");
    }

    public void lastName() {
        lastName_locator.sendKeys("Cba");
    }

    public void companyName() {
        companyName_locator.sendKeys("Abcde");
    }

    public void address1() {
        address1_locator.sendKeys("Street Hjjkk, P.O. Box 4656, Company name, gfhfh ");
    }

    public void address2() {
        address2_locator.sendKeys("Apartment 345, suite 45, unit 34, building 2, floor 254 ");
    }

    public void city() {
        city_locator.sendKeys("Klmnop");
    }

    public void state() {
        state_locator.click();
    }

    public void postcode() {
        postcode_locator.sendKeys("12345");
    }

    public void dateOfBirth() {
        dateOfBirth_locator.click();
    }

    public void monthOfBirth() {
    monthOfBirth_locator.click();
}

    public void yearOfBirth() {
        yearOfBirth_locator.click();
    }

    public void country() {
        country_locator.click();
    }

    public void signNewsletter() {
        signNewsletter_locator.click();
    }

    public void receiveSpecialOffersFromOurPartners() {
        receiveSpecialOffersFromOurPartners_locator.click();
    }

    public void additionalInformation() {
        additionalInformation_locator.sendKeys("Information additional");
    }

    public void homePhone() {
        homePhone_locator.sendKeys("911911");
    }

    public void mobilePhone() {
        mobilePhone_locator.sendKeys("119119");
    }

    public void assignAnAddressAliasForFutureReference() {
        assignAnAddressAliasForFutureReference_locator.clear();
        assignAnAddressAliasForFutureReference_locator.sendKeys("USSR");
    }

    public void registerButton() {
        registerButton_locator.click();
    }
=======
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class AuthenticationPage {
    private WebDriver driver;
    public AuthenticationPage(WebDriver driver) {
        this.driver = driver;
    }

    private static By hoverElement_locator = By.xpath("//*[@id=\'account-creation_form\']//*[@class='clearfix']");
    private static By element_locator = By.className("navigation_page");
    private static By customerFirstname_locator = By.className("search_query");
    private static By idGender_locator = By.className("header-container");
    private static By columnsContainer_locator = By.className("columns-container");
    private static By accountСeationForm_locator = By.id("account-creation_form");
    private static By stdBox_locator = By.className("std box");
    private static By idGender1_locator = By.xpath("//div[not(contains(@style,'display:none'))]//*[@id='id_gender1']");
    private static By mr_locator = By.xpath("//div[not(contains(@style,'display:none'))]//*[@id='id_gender1']");
    private static By idGenderName_locator = By.xpath("//div[not(contains(@style,'display:none'))]//*[@name='id_gender']");
    private static By display_locator = By.xpath("//div[not(contains(@style,'display:none'))]");
    private static By centerColumn_locator = By.id("center_column");
    private static By noSlide_locator = By.id("noSlide");


    public void gender() {



        driver.findElement(element_locator).click();
        driver.findElement(customerFirstname_locator).sendKeys("Abc");
        driver.findElement(idGender_locator);
        driver.findElement(columnsContainer_locator);
        driver.findElement(centerColumn_locator);
        driver.findElement(display_locator);
        driver.findElement(noSlide_locator);
//        driver.findElement(idGenderName_locator);
//        driver.findElement(stdBox_locator);
//        driver.findElement(idGender1_locator);



//        driver.findElement(accountСeationForm_locator);

//        Actions builder = new Actions(driver);
//        builder.moveToElement((WebElement) hoverElement_locator).perform();
////        By locator = By.id("clickElementID");
//        driver.findElement(gender_locator).click();

//        Actions builder = new Actions(driver);
//        driver.findElement(element_locator);
        int k = 20;
        WebElement element = driver.findElement(element_locator);
//        builder.moveToElement(element).build().perform();

    }

>>>>>>> d6ea5c0d71a9c69c4f431d6e125a9eef7b5bca9d
}
