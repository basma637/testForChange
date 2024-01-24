package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CheckBoxPages;
import pages.DropDwonPage;

import static org.testng.Assert.*;

public class DropDownTest extends BaseTest {
    @Test (priority = 1)
    public void testSelectFromDropdown() {
        DropDwonPage dropDwonPage = homePage.clickDropDwonLink();
        dropDwonPage.selectFromDropdownList("Option 1");
        String x = String.valueOf(dropDwonPage.getVisiableTextOFSelectedItem("Option 1"));
        System.out.println(x);
        System.out.println(dropDwonPage.getVisiableTextOFSelectedItem("Option 1"));
        //assertEquals(3, dropDwonPage.getVisiableTextOFSelectedItem().getOptions().size());
        //assertFalse(dropDwonPage.selectFromDropdownList("Option 1").isMultiple());
       // assertEquals("Please select an option", .getFirstSelectedOption().getText());
    }
}
