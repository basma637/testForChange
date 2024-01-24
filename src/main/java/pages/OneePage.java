package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OneePage {
    WebDriver driver;
    WebDriverWait wait;
    public OneePage(WebDriver driver) {
        this.driver = driver;
    }
    private final By StartButton = By.cssSelector("#start > button");
    private final By ValidationMessage = By.cssSelector("#finish > h4");

    public void clickOnStartButton(){
        driver.findElement(StartButton).click();
    }
    public String setValidationMessage(){
        wait = new WebDriverWait(driver , Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(ValidationMessage)));
        return  driver.findElement(ValidationMessage).getText();

    }
}
