package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
public class ContactUsPage {
    private WebDriver driver;

    @FindBy(id = "uniform-id_contact")
    WebElement uniformIdContact_locator;
    @FindBy(xpath = "//*[@id='id_contact']//option[2]")
    WebElement descContact2_locator ;
    @FindBy(id = "email")
    WebElement formControl_locator;
    @FindBy(id = "fileUpload")
    WebElement fileUpload_locator;
    @FindBy(id = "message")
    WebElement message_locator;
    @FindBy(id = "submitMessage")
    WebElement submitMessage_locator;
    @FindBy(xpath = "//*[@id=\'center_column\']//p")
    WebElement successfullySent_locator;
    @FindBy(xpath = "//*[@id=\'center_column\']//li")
    WebElement cannotBeBlank_locator;

    public void uniformIdContact() {
        uniformIdContact_locator.click();
    }
    public void descContact2() {
        descContact2_locator.click();
    }
    public void formControl() {
        formControl_locator.sendKeys("abs@mail.by");
    }
    public void fileUpload() {
        File resourcesDirectory = new File("src/main/resources/Test.txt");
        String absolutePathName = resourcesDirectory.getAbsolutePath();
        fileUpload_locator.sendKeys(absolutePathName);
    }
    public void message() {
        message_locator.sendKeys("Test");
    }

    public void submitMessage() {
        submitMessage_locator.click();
    }

    public String successfullySent(){
        return  successfullySent_locator .getText();
    }

    public String cannotBeBlank(){
        return cannotBeBlank_locator .getText();
    }
}

