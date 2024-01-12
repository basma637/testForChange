package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    // locators
    private final By formAuthenticationLink = By.linkText("Form Authentication");
    private final By statusCodeLink = By.linkText("Status Codes");
    private final By uploadLink = By.linkText("File Upload");
    private final By checkBoxLink = By.xpath("// a [contains(@href,'checkboxes')]");
    private  final By forgotPassword = By.xpath("// a [contains(@href , 'forgot_password')]");

    // Actions
    public LoginPage clickOnFormAuthenticationLink(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public UploadPage clickOnUploadLink(){
        driver.findElement(uploadLink).click();
        return new UploadPage(driver);
    }
    public StatusCodesPages clickOnStatusCodeLink(){
        driver.findElement(statusCodeLink).click();
        return new StatusCodesPages(driver);
    }
    public CheckBoxPages clickOnCheckBoxLink(){
        driver.findElement(checkBoxLink).click();
        return new CheckBoxPages(driver);
    }
    public  ForegotPasswordPages  clickOnForegetPassword(){
        driver.findElement(forgotPassword).click();
        return new ForegotPasswordPages(driver);
    }
   /* public CheckBoxPage clickOnCheckBoxLink(){
        driver.findElement(checkBoxLink).click();
        return new CheckBoxPage(driver);
    }*/
}
