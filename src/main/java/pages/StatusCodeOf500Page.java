package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodeOf500Page {
    WebDriver driver;
    public StatusCodeOf500Page(WebDriver driver) {
        this.driver=driver;}

    private final By validationMessageOf500 = By.xpath("//*[ @id = 'content']");
    public String getvalidationMessageOf500(){
        return driver.findElement(validationMessageOf500).getText();
    }
}

