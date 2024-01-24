package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModulePage {
    WebDriver driver;
    public ModulePage(WebDriver driver) {
        this.driver = driver;}

    final By  closeModulePage = By.xpath("// * [@class = 'modal-footer']");
    public void clickModulePageById() {
        try {
            driver.findElement(closeModulePage).click();
        } catch (Exception e) {
            handleException("clickElementById", e);
        }
    }

    // Other methods for interacting with elements on the page

    private void handleException(String clickModulePageById, Exception e) {
        System.err.println("Exception in " + clickModulePageById + ": " + e.getMessage());
        e.printStackTrace();
    }


}
