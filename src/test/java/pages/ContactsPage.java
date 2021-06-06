package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
public class ContactsPage extends BasePage {
    public static final By NEW_CONTACT_BUTTON = By.cssSelector("[title=New]");
    String contactIsCreated = "//slot[@name = 'primaryField']//child::*[contains(text(),'%s')]";
    By ICON = By.cssSelector("img[title=Contacts]");

    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    @Step("Check that contact page was opened")
    public boolean isPageOpened() {
        return isExist(ICON);
    }

    public ContactsPage open(){
        driver.get(BASE_URL + "lightning/o/Contact/list?filterName=Recent");
        return this;
    }

    @Step("Open new contact form")
    public ContactsModal clickNew() {
        log.info("Click on new contact button");
        driver.findElement(NEW_CONTACT_BUTTON).click();
        return new ContactsModal(driver);
    }

    @Step("Check that contact is created")
    public boolean contactIsCreated(String contactLastName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(contactIsCreated,contactLastName))));
        return driver.findElement(By.xpath(String.format(contactIsCreated,contactLastName))).isDisplayed();

    }

}