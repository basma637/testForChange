package checkBox;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CheckBoxPages;
import pages.UploadPage;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckBoxTests extends BaseTest {
    @Test(priority = 1)
    public void testSelectCheckTrue() {
        CheckBoxPages checkBoxPages = homePage.clickOnCheckBoxLink();
        checkBoxPages.clickCheckBox1();
        //System.out.println(checkBoxPages.getCheckBox1Status());
        assertTrue(checkBoxPages.getCheckBox1Status());
      //  CheckBoxPage checkBoxPage;
     //   checkBoxPage = homePage.clickOnCheckBoxLink();
       // checkBoxPage.clickCheckBox1();
    }

    @Test (priority = 2)
    public void testDeselectCheckFalse() {
        CheckBoxPages checkBoxPages = homePage.clickOnCheckBoxLink();
        checkBoxPages.pressOnCheckBox2();
        assertFalse(checkBoxPages.getCheckBox2Status());

       /* WebElement PressOnCheckBox = driver.findElement(By.xpath("// a [contains(@href,'checkboxes')]"));
        PressOnCheckBox.click();
        WebElement deselectCheckBox2 = driver.findElement(By.xpath("// input [@type='checkbox'][2]"));
        deselectCheckBox2.click();
        assertFalse (deselectCheckBox2.isSelected());*/
    }
}
