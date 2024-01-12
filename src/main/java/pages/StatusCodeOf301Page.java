package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodeOf301Page {
    WebDriver driver;
    public StatusCodeOf301Page(WebDriver driver) {
    this.driver=driver;}

    private final By validationMessageOf301 = By.xpath("//*[ @id = 'content']");
    public String getvalidationMessageOf301(){

        return driver.findElement(validationMessageOf301).getText();
        }
    }

