package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDwonPage {
    WebDriver driver;
    Select select;
    public DropDwonPage(WebDriver driver) {
        this.driver = driver;
    }
    private final By dropDowmList = By.xpath("// select [@ id = 'dropdown']");
    public void selectFromDropdownList(String VisiableText){
        select = new Select(driver.findElement(dropDowmList));
        select.selectByVisibleText(VisiableText);
    }
    public String getVisiableTextOFSelectedItem(String VisiableText){
        select = new Select(driver.findElement(dropDowmList));
        return String.valueOf(select.getFirstSelectedOption());
    }
   /* public void deselectDropdown(){select= new Select(driver.findElement(dropDowmList));
          select.deselectAll(); }*/

}
