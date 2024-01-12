package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodeOf404Page  {
    WebDriver driver;
    public StatusCodeOf404Page(WebDriver driver) {
        this.driver=driver;}

    private final By validationMessageOf404 = By.xpath("//*[ @id = 'content']");
    public String getvalidationMessageOf404(){

        return driver.findElement(validationMessageOf404).getText();
    }
}