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
    private  final  By dynamicLoadingLink = By.xpath("// a [contains(@href , 'dynamic_loading')]");
    private final  By dropDwonLink = By.xpath("// a [contains(@href , '/dropdown')]");
    private  final By alertJSLink = By.xpath("// a [contains(@href , 'javascript_alerts')]");
    private  final By framLink = By.xpath("//a [contains(@href , '/tinymce')]");
    private  final By moduleLink = By.xpath("//a [contains(@href , '/entry_ad')]");
    private void ClickOnLink(By locator){
        driver.findElement(locator).click();
    }

    // Actions
    public LoginPage clickOnFormAuthenticationLink(){
        ClickOnLink(formAuthenticationLink);
        return new LoginPage(driver);
    }

    public UploadPage clickOnUploadLink(){
        ClickOnLink(uploadLink);
        return new UploadPage(driver);
    }
    public StatusCodesPages clickOnStatusCodeLink(){
        ClickOnLink(statusCodeLink);
        return new StatusCodesPages(driver);
    }
    public CheckBoxPages clickOnCheckBoxLink(){
        ClickOnLink(checkBoxLink);
        return new CheckBoxPages(driver);
    }
    public  ForegotPasswordPages  clickOnForegetPassword(){
        ClickOnLink(forgotPassword);
        return new ForegotPasswordPages(driver);
    }
    public DynamicLoadingPage clickOnDynamicallyLoadedLink(){
        ClickOnLink(dynamicLoadingLink);
        return new DynamicLoadingPage(driver);
    }
    public DropDwonPage clickDropDwonLink(){
        ClickOnLink(dropDwonLink);
        return new DropDwonPage(driver);
    }
    public JSAlertPage clickOnJSAlert(){
        ClickOnLink(alertJSLink);
        return new JSAlertPage(driver);
    }
    public FramePage clickOnFram(){
        ClickOnLink(framLink);
        return new FramePage(driver);
    }
    public ModulePage clickOnModuleLink(){
        ClickOnLink(moduleLink);
        return new ModulePage(driver);
    }
   /* public CheckBoxPage clickOnCheckBoxLink(){
        driver.findElement(checkBoxLink).click();
        return new CheckBoxPage(driver);
    }*/
}
