package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForegotPasswordPages {
    WebDriver driver;
    public ForegotPasswordPages(WebDriver driver) {
        this.driver=driver;
    }
    // locators
    private final By InsertEmail = By.xpath("//* [@id=\"email\"]");
    private final  By RetriveButton = By.xpath("// button [@id = 'form_submit']");
    public void insertEmail(String Email){
        driver.findElement(InsertEmail).sendKeys(Email);
    }
    public RetriveConfirmationPage clickOnSubmitRetriveEmail(){
        driver.findElement(RetriveButton).click();
        return new RetriveConfirmationPage(driver);
    }


}
