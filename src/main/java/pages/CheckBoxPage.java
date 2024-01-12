package pages;

import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class CheckBoxPage {
    WebDriver driver;
    public CheckBoxPage(WebDriver driver){

        this.driver= driver;
    }
// locators
    private final By checkBox1 = By.xpath("// input [@type='checkbox'][1]");
    private final By CheckBox2 = By.xpath("// input [@type='checkbox'][2]");

// actions
    public void clickCheckBox1(){
        driver.findElement(checkBox1).click();
    }
    public boolean getCheckBox1Status() {
        return driver.findElement(checkBox1).isSelected();
    }

public void pressOnCheckBox2(){
    driver.findElement(CheckBox2).click();

}
    }