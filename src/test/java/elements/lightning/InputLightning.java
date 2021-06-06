package elements.lightning;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class InputLightning {
    WebDriver driver;
    String label;
    String inputLocatorLightning = "//*[contains(@class,'modal-body')]//label[text()='%s']/ancestor::elements.lightning-input//input";

    public InputLightning(WebDriver driver,String label){
        this.driver = driver;
        this.label = label;
    }

    @Step("Write contact elements.lightning: {text}")
    public void writeContactLightning(String text){
        log.info(String.format("Fill in a field %s, with text %s, by locator%s", label,text,inputLocatorLightning));
        driver.findElement(By.xpath(String.format(inputLocatorLightning,label))).sendKeys(text);
    }
}