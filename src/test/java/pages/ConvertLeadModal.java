package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2
public class ConvertLeadModal extends BasePage{
    public static final By MODAL_TITLE_FOR_LEAD_CONVERTION = By.xpath("//h2[text() = 'Convert Lead ']");
    public static final By CONVERT_BUTTON = By.xpath("//span[text() = 'Convert']");
    public static final By LEAD_CONVERTED_TEXT = By.xpath("//span[text() = 'Your lead has been converted']");
    public static final By GO_TO_LEADS_BUTTON = By.xpath("//button[text() = 'Go to Leads']");
    public static final By STATUS_COMPLETE_BUTTON = By.xpath("//button//span[text() = 'Mark Status as Complete']");
    public ConvertLeadModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isExist(MODAL_TITLE_FOR_LEAD_CONVERTION);
    }
    public void convertLead() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CONVERT_BUTTON));
        Thread.sleep(1000);
        driver.findElement(CONVERT_BUTTON).click();

    }

    @Step("Check by text that lead was converted")
    public boolean isLeadConverted() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LEAD_CONVERTED_TEXT));
        return isExist(LEAD_CONVERTED_TEXT);
    }

    @Step("Go to leads page after converting Lead")
    public void goToLeads(){
        log.info("Click on Go to leads button");
        wait.until(ExpectedConditions.visibilityOfElementLocated(GO_TO_LEADS_BUTTON));
        driver.findElement(GO_TO_LEADS_BUTTON).click();

    }

    @Step("Click on  Mark status as completed button")
    public void clickOnStatusCompleteButton(){
        log.info("Click on Mark Status as Completed button");
        wait = new WebDriverWait(driver,5);
        while ( !isPageOpened()){
            try{
                wait.until(ExpectedConditions.visibilityOfElementLocated(STATUS_COMPLETE_BUTTON));
                driver.findElement(STATUS_COMPLETE_BUTTON).click();
            }catch (ElementClickInterceptedException e){
                log.warn(e.getLocalizedMessage());
                WebElement element = driver.findElement(STATUS_COMPLETE_BUTTON);
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", element);
            }
        }
        wait = new WebDriverWait(driver,25);
    }
}