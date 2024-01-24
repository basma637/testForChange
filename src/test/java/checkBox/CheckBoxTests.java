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
    }

    @Test (priority = 2)
    public void testDeselectCheckFalse() {
        CheckBoxPages checkBoxPages = homePage.clickOnCheckBoxLink();
        checkBoxPages.pressOnCheckBox2();
        assertFalse(checkBoxPages.getCheckBox2Status());

    }
}
