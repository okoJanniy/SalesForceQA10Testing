package pages;

import elements.lightning.DropDownLightning;
import elements.lightning.InputLightning;
import elements.lightning.TextAreaLightning;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import models.Contacts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
public class ContactsModal extends BasePage{
    public static final By MODAL_TITLE = By.xpath("//h2[text() = 'New Contact']");
    public static final By SAVE_NEW_CONTACT_BUTTON = By.xpath("//button[contains(@name,'SaveEdit')]");

    public ContactsModal(WebDriver driver) {
        super(driver);
    }
    public boolean isPageOpened() {
        return isExist(MODAL_TITLE);
    }

    @Step("Create new contact")
    public void create (Contacts contact){
        log.info ("Creating new contact");
        new InputLightning(driver, "Phone").writeContactLightning(contact.getPhone());
        new InputLightning(driver, "Mobile").writeContactLightning(contact.getMobile());
        new DropDownLightning(driver,"Salutation").selectForNewLightningField(contact.getSalutation());
        new InputLightning(driver, "First Name").writeContactLightning(contact.getFirstName());
        new InputLightning(driver, "Last Name").writeContactLightning(contact.getLastName());
        new DropDownLightning(driver, "Account Name").selectForNewSearchLightningFields(contact.getAccountName());
        new InputLightning(driver, "Email").writeContactLightning(contact.getEmail());
        new InputLightning(driver, "Title").writeContactLightning(contact.getTitle());
        new DropDownLightning(driver, "Reports To").selectForNewSearchLightningFields(contact.getReportsTo());
        new TextAreaLightning(driver, "Mailing Street").writeTextareaForLightningFields(contact.getMailingStreet());
        new TextAreaLightning(driver, "Other Street").writeTextareaForLightningFields(contact.getOtherStreet());
        new InputLightning(driver, "Mailing City").writeContactLightning(contact.getMailingCity());
        new InputLightning(driver, "Mailing State/Province").writeContactLightning(contact.getMailingState());
        new InputLightning(driver, "Mailing Zip/Postal Code").writeContactLightning(contact.getMailingZip());
        new InputLightning(driver, "Mailing Country").writeContactLightning(contact.getMailingCountry());
        new InputLightning(driver, "Other City").writeContactLightning(contact.getOtherCity());
        new InputLightning(driver, "Other State/Province").writeContactLightning(contact.getOtherState());
        new InputLightning(driver, "Other Zip/Postal Code").writeContactLightning(contact.getOtherZip());
        new InputLightning(driver, "Other Country").writeContactLightning(contact.getOtherCountry());
        new InputLightning(driver, "Fax").writeContactLightning(contact.getFax());
        new InputLightning(driver, "Home Phone").writeContactLightning(contact.getHomePhone());
        new InputLightning(driver, "Other Phone").writeContactLightning(contact.getOtherPhone());
        new InputLightning(driver, "Asst. Phone").writeContactLightning(contact.getAsstPhone());
        new InputLightning(driver, "Assistant").writeContactLightning(contact.getAssistant());
        new InputLightning(driver, "Department").writeContactLightning(contact.getDepartment());
        new DropDownLightning(driver,"Lead Source").selectForNewLightningField(contact.getLeadSource());
        new InputLightning(driver,"Birthdate").writeContactLightning(contact.getBirthdate());
        new TextAreaLightning(driver, "Description").writeTextareaForLightningFields(contact.getDescription());
    }

    @Step("Click on save new contact button")
    public void save(){
        log.info ("Click on save new contact button");
        wait.until(ExpectedConditions.visibilityOfElementLocated(SAVE_NEW_CONTACT_BUTTON));
        driver.findElement(SAVE_NEW_CONTACT_BUTTON).click();
    }
}