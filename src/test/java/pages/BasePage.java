package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


@Log4j2
public abstract class BasePage {
    public static final String BASE_URL ="https://vxxv2.my.salesforce.com/";
    WebDriver driver;
    WebDriverWait wait;


    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,25);

    }
    public abstract boolean isPageOpened();

    public boolean isExist(By locator){
        try{
            driver.findElement(locator);
            return true;
        }catch(NoSuchElementException exception){
            log.warn("Element is not exist on page");
            log.warn(exception.getLocalizedMessage());
            return false;
        }

    }

    @Step("Validate input")
    public void validateInput(String label, String expected){
        String locator = "//div[contains(@class,'active')]//span[text()='%s']/ancestor::force-record-layout-item//slot[@slot='outputField']//child::*";
        log.info("Validating input with locator %s",locator);
        Assert.assertEquals(
                driver.findElement(By.xpath(String.format(locator,label))).getText(),
                expected,
                "Input text is not correct");

    }


}
