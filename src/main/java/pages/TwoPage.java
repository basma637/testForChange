package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TwoPage {
    WebDriver driver;
    WebDriverWait wait;
    public TwoPage(WebDriver driver) {
        this.driver = driver;
    }
    // locators
    private final By StartButton = By.cssSelector("#start > button");
    private final By CatchLoader = By.xpath("// div [@ id = 'loading']");
    private final By ValidationMessage = By.xpath("// div [@id = 'finish']");

    public void clickOnStartButton(){
        driver.findElement(StartButton).click();
    }
    public boolean GetLoaderStatus() {
        wait = new WebDriverWait(driver , Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(ValidationMessage)));
        return driver.findElement(CatchLoader).isDisplayed();
        // return driver.findElement(ValidationMessage).getText();
    }
}

