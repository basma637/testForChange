package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FramePage {
        WebDriver driver;
        WebDriverWait wait;
        public FramePage(WebDriver driver) {
            this.driver =driver;}

        private final String frame = "mce_0_ifr";

        private final By textBox = By.id("tinymce");

        private final By increaseIndentButton = By.cssSelector("[aria-label='Increase indent']");

        private void switchToFrame(){

            driver.switchTo().frame(frame);
        }
        private void switchToParent(){
            driver.switchTo().parentFrame();
        }

        public void clearTextBox(){
            switchToFrame();
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.textToBe(textBox,"Your content goes here." ));
            driver.findElement(textBox).clear();
            switchToParent();
        }
        public void insertInTextBox(String text){
            switchToFrame();
            driver.findElement(textBox).sendKeys(text);
            switchToParent();
        }

        public void clickOnIncreaseIndentButton(){
            driver.findElement(increaseIndentButton).click();
        }
    public String getValidationMSG(){
        switchToFrame();
       return driver.findElement(textBox).getText();
    }

    }
