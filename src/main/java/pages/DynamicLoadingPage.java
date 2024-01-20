package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnePage {
    WebDriver driver;
    public OnePage(WebDriver driver) {
        this.driver = driver;
    }
    // locator
    private final By ExampleOneLink = By.partialLinkText("Example 1");

    public OneePage clickOnExampleOneLink(){
        driver.findElement(ExampleOneLink).click();
        return new OneePage(driver);
    }
}
