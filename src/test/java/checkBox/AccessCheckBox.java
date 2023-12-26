package checkBox;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class AccessCheckBox extends BaseTest {
    @Test(priority = 1)
    public void testSelectCheckTrue() {
        WebElement PressOnCheckBox = driver.findElement(By.xpath("// a [contains(@href,'checkboxes')]"));
        PressOnCheckBox.click();
        WebElement SelectCheckBox1 = driver.findElement(By.xpath("// input [@type='checkbox'][1]"));
        SelectCheckBox1.click();
        /*if (SelectCheckBox1.isSelected()){
        System.out.println("box1 checked");
          String expectedResult= "box1 checked"  }
        String actualResult= "box1 checked";*/
        assertTrue(SelectCheckBox1.isSelected());
    }
    @Test (priority = 2)
    public void testDeselectCheckFalse() {
        WebElement PressOnCheckBox = driver.findElement(By.xpath("// a [contains(@href,'checkboxes')]"));
        PressOnCheckBox.click();
        WebElement deselectCheckBox2 = driver.findElement(By.xpath("// input [@type='checkbox'][2]"));
        deselectCheckBox2.click();
        assertFalse (deselectCheckBox2.isSelected());
    }
}
