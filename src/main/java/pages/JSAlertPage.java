package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JSAlertPage {
    WebDriver driver;
    public JSAlertPage(WebDriver driver) {
        this.driver = driver;
    }
    private  final By JSAlertButton = By.xpath("// button [contains(text(),'JS Alert')]");
    private  final By JSAlertConfirmButton = By.xpath("// button [contains(text(),'JS Confirm')]");
    private  final By JSAlertPromptButton = By.xpath("// button [contains(text(),'JS Prompt')]");
    private  final By validationMSGOfAlertButton = By.xpath("// * [@id = 'result']");
    private  final By validationMSGOfAlertConfirmButton = By.xpath("// * [@id = 'result']");
    private  final By validationMSGOfAlertPrompt = By.xpath("// * [@id = 'result']");
    public void ClickOnAlertButton(){
        driver.findElement(JSAlertButton).click();
    }
    public void accetJSAlert() {driver.switchTo().alert().accept();}
    public String getvalidationMSGOfAlertButton(){
        return driver.findElement(validationMSGOfAlertButton).getText();
    }
    public void ClickOnJSAlertConfirmButton(){
        driver.findElement(JSAlertConfirmButton).click();
    }
    public void DismissAlertConfirmButton(){
        driver.switchTo().alert().dismiss();}
    public String getValidationMSGOfAlertConfirmButton(){
        return driver.findElement(validationMSGOfAlertConfirmButton).getText();
    }
    public void ClickOnJSAlertPromptButton(){
        driver.findElement(JSAlertPromptButton).click();
    }
    public void InsertJSAlertPromptText(String AlertText){
        driver.switchTo().alert().sendKeys(AlertText);}
    public String getValidationMSGOfAlertPrompt(){
        return driver.findElement(validationMSGOfAlertPrompt).getText();
    }
    public void acceptJSAlertPrompt() {driver.switchTo().alert().accept();}



}
