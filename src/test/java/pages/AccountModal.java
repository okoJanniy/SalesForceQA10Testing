package pages;

import elements.uiInput.DropDown;
import elements.uiInput.Input;
import elements.uiInput.TextArea;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
public class AccountModal extends BasePage{
    public static final By MODAL_TITLE = By.xpath("//h2[text() = 'New Account']");
    public static final By SAVE_NEW_ACCOUNT_BUTTON = By.cssSelector("[title=Save]");


    public AccountModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isExist(MODAL_TITLE);
    }

    @Step("Create new account")
    public void create (Account account){
        log.info("Create new account");
        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Website").write(account.getWebsite());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Fax").write(account.getFax());
        new DropDown(driver,"Type").select(account.getOption());
        new DropDown(driver,"Industry").select(account.getIndustry());
        new Input(driver, "Employees").write(account.getEmployees());
        new Input(driver, "Annual Revenue").write(account.getAnnualRevenue());
        new TextArea(driver, "Description").write(account.getDescription());
        new TextArea(driver, "Billing Street").write(account.getBillingStreet());
        new TextArea(driver, "Shipping Street").write(account.getShippingStreet());
        new Input(driver, "Billing City").write(account.getBillingCity());
        new Input(driver, "Billing State/Province").write(account.getBillingState());
        new Input(driver, "Shipping City").write(account.getShippingCity());
        new Input(driver, "Shipping State/Province").write(account.getShippingState());
        new Input(driver, "Billing Zip/Postal Code").write(account.getBillingZip());
        new Input(driver, "Billing Country").write(account.getBillingCountry());
        new Input(driver, "Shipping Zip/Postal Code").write(account.getShippingZip());
        new Input(driver, "Shipping Country").write(account.getShippingCountry());
    }

    @Step("Click on save new account button")
    public void save(){
        log.info("Click on Save account button");
        wait.until(ExpectedConditions.visibilityOfElementLocated(SAVE_NEW_ACCOUNT_BUTTON));
        driver.findElement(SAVE_NEW_ACCOUNT_BUTTON).click();
    }

}