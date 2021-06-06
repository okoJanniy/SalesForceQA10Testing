package elements.lightning;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class DropDownLightning {
    WebDriver driver;
    String label;
    String dropdownLocatorForLightning = "//*[contains(@class,'modal-body')]//label[text()='%s']/ancestor::" +
            "elements.lightning-combobox//input";
    String optionLocatorForLightning = "//*[contains(@role,'option')]//span[@title='%s']";
    String searchFieldsForLightning = "//*[contains(@class,'modal-body')]//label[text()='%s']/ancestor::" +
            "slot[contains(@name, 'inputField')]//input";

    public DropDownLightning(WebDriver driver, String label){
        this.driver = driver;
        this.label = label;
    }

    @Step("Select new elements.lightning field: {option}")
    public void selectForNewLightningField(String option){
        log.info(String.format("Fill in a field %s, with text %s, by locator%s", label,option,optionLocatorForLightning));
        driver.findElement(By.xpath(String.format(dropdownLocatorForLightning,label))).click();
        driver.findElement(By.xpath(String.format(optionLocatorForLightning,option))).click();
    }

    @Step("Select new search elements.lightning fields: {option}")
    public void selectForNewSearchLightningFields(String option){
        log.info(String.format("Fill in a field %s, with text %s, by locator%s", label,option,optionLocatorForLightning));
        driver.findElement(By.xpath(String.format(searchFieldsForLightning,label))).click();
        driver.findElement(By.xpath(String.format(optionLocatorForLightning,option))).click();
    }

}