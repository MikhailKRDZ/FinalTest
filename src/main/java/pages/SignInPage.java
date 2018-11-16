package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    private WebDriver driver;
    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    private static By emailCreate_locator = By.id("email_create");
    private static By iconUser_locator = By.className("icon-user");

//    private static By formControl_locator = By.xpath("//*[@id=\"email\"]");
//    private static By fileUpload_locator = By.xpath("//*[@id=\"fileUpload\"]");
//    private static By message_locator = By.xpath("//*[@id=\"message\"]");
//    private static By submitMessage_locator = By.id("submitMessage");
//    private static By successfullySent_locator = By.xpath("//*[@id=\"center_column\"]//p");
//    private static By cannotBeBlank_locator = By.xpath("//*[@id=\"center_column\"]//li");
//    private static By
//    private static By
//    private static By
//    private static By
//    private static By
//    private static By
//    private static By
//    private static By
//    private static By
//    private static By
//    private static By
//    private static By
//    private static By
//    private static By
//    private static By
//
public void emailCreate() {
    driver.findElement(emailCreate_locator).sendKeys("ikhailkirdzik@gmail.com");
}
    public void iconUser() {
        driver.findElement(iconUser_locator).click();
    }

//    public void descContact2() {
//        driver.findElement(descContact2_locator).click();
//    }
//    public void fileUpload() {
//        driver.findElement(fileUpload_locator).sendKeys("D:\\Учеба\\АТ\\Final\\Test.txt");
//    }
//    public void message() {
//        driver.findElement(message_locator).sendKeys("Test");
//    }
//    public void submitMessage() {
//        driver.findElement(submitMessage_locator).click();
//
//    }
//    public String successfullySent(){
//        return driver.findElement( successfullySent_locator ).getText();
//    }
//    public String cannotBeBlank(){
//        return driver.findElement( cannotBeBlank_locator ).getText();
//    }

}
