package elements.uiInput;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class DropDown {
    WebDriver driver;
    String label;
    String dropdownLocator = "//*[contains(@class,'modal-body')]//span[text()='%s']/ancestor::div[contains(@class,'elements.lightning.uiInput')]//a";
    String optionLocator = "//*[contains(@class,'uiMenuList')and contains(@class,'visible')]//a[@title='%s']";


    public DropDown(WebDriver driver,String label){
        this.driver = driver;
        this.label = label;
    }

    @Step("Select: {option}")
    public void select(String option){
        log.info(String.format("Fill in a field %s, with text %s, by locator%s", label,option,optionLocator));
        driver.findElement(By.xpath(String.format(dropdownLocator,label))).click();
        driver.findElement(By.xpath(String.format(optionLocator,option))).click();
    }

}