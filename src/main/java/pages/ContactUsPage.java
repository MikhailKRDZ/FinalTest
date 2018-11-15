package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage {


    private WebDriver driver;

    public ContactUsPage(WebDriver driver) {

        this.driver = driver;
    }

    private static By uniformIdContact_locator = By.id("uniform-id_contact");
    private static By descContact2_locator = By.xpath("//*[@id=\"id_contact\"]//option[2]");
    private static By formControl_locator = By.xpath("//*[@id=\"email\"]");
    private static By fileUpload_locator = By.xpath("//*[@id=\"fileUpload\"]");
    private static By message_locator = By.xpath("//*[@id=\"message\"]");
    private static By submitMessage_locator = By.id("submitMessage");
    private static By successfullySent_locator = By.xpath("//*[@id=\"center_column\"]//p");
    private static By cannotBeBlank_locator = By.xpath("//*[@id=\"center_column\"]//li");

    public void uniformIdContact() {
        driver.findElement(uniformIdContact_locator).click();
    }

    public void descContact2() {
        driver.findElement(descContact2_locator).click();
    }
    public void formControl() {
        driver.findElement(formControl_locator).sendKeys("mikhailkirdzik@gmail.com");
    }
    public void fileUpload() {
        driver.findElement(fileUpload_locator).sendKeys("D:\\Учеба\\АТ\\Final\\Test.txt");
    }
    public void message() {
        driver.findElement(message_locator).sendKeys("Test");
    }
    public void submitMessage() {
        driver.findElement(submitMessage_locator).click();

    }
    public String successfullySent(){
        return driver.findElement( successfullySent_locator ).getText();
    }
    public String cannotBeBlank(){
        return driver.findElement( cannotBeBlank_locator ).getText();
    }


}

