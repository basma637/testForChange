package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    WebDriver driver;

    public DynamicLoadingPage(WebDriver driver) {
        this.driver =driver;
    }

    private final By exampleOneLink =By.partialLinkText("Example 1");
    private final By exampleTwoLink =By.partialLinkText("Example 2");

    public OneePage clickOnExampleOneLink(){
        driver.findElement(exampleOneLink).click();
        return new OneePage(driver);
    }
    public TwoPage clickOnExampleTwoLink(){
        driver.findElement(exampleTwoLink).click();
        return new TwoPage(driver);
    }
}
