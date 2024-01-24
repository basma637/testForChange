package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodesPages {
    WebDriver driver;
    public StatusCodesPages(WebDriver driver) {
        this.driver= driver;
    }
    private final By ClickOn200 = By.xpath("// a [contains (@href,'status_codes/200')]");
    private final By ClickOn301 = By.xpath("// a [contains (@href,'status_codes/301')]");
    private final By ClickOn404 = By.xpath("// a [contains (@href,'status_codes/404')]");
    private final By ClickOn500 = By.xpath("// a [contains (@href,'status_codes/500')]");

    //action

    public StatusCodeOf200Page clickOn200code() {
        driver.findElement(ClickOn200).click();
        return new StatusCodeOf200Page(driver);
    }
    public StatusCodeOf301Page clickOn301(){
        driver.findElement(ClickOn301).click();
        return new StatusCodeOf301Page(driver);
    }
    public StatusCodeOf404Page clickOn404(){
        driver.findElement(ClickOn404).click();
        return new StatusCodeOf404Page(driver);
    }
    public StatusCodeOf500Page clickOn500(){
        driver.findElement(ClickOn500).click();
        return new StatusCodeOf500Page(driver);
    }
}
