package pages;

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

}
