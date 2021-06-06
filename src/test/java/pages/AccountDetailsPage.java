package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
public class AccountDetailsPage extends BasePage {
    public static final By DETAILS_TAB= By.cssSelector("a[data-label = 'Details']");

    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }
    //TODO implement
    @Override
    public boolean isPageOpened() {
        return false;
    }

    public AccountDetailsPage openDetailsTab(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(DETAILS_TAB));
        driver.findElement(DETAILS_TAB).click();
        return this;
    }

    @Step("Validate data on account page")
    public void validateAccount(Account account){
        log.info("Validating data on account page");
        validateInput("Account Name", account.getAccountName());
        validateInput("Website", account.getWebsite());
        validateInput("Phone", account.getPhone());
        validateInput("Fax", account.getFax());
        validateInput("Type", account.getOption());
        validateInput("Industry", account.getIndustry());
        validateInput("Employees", account.getEmployees());
        validateInput("Annual Revenue", String.format("$"+account.getAnnualRevenue()));
        validateInput("Description", account.getDescription());
        validateInput("Billing Address", String.format("%s\n%s, %s %s\n%s", account.getBillingStreet(),account.getBillingCity(),account.getBillingState(),
                account.getBillingZip(),account.getBillingCountry()));
        validateInput("Shipping Address", String.format("%s\n%s, %s %s\n%s", account.getShippingStreet(),account.getShippingCity(),account.getShippingState(),
                account.getShippingZip(),account.getShippingCountry()));

    }
}