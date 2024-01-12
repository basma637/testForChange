package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetriveConfirmationPage {
    WebDriver driver;
    public RetriveConfirmationPage(WebDriver driver) {
        this.driver= driver;
    }
    //locator
    private final By RetriveConfirmationMSG = By.tagName("h1");

    //action
    public String getRetriveConfirmationMSG(){
       return driver.findElement(RetriveConfirmationMSG).getText();
    }
}
