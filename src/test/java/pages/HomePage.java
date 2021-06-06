package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public static final  By TITLE =By.xpath("//*[@title = 'Sales']");
    public HomePage(WebDriver driver){
        super(driver);
    }


    public boolean isPageOpened(){
        return isExist(TITLE);
    }
}
