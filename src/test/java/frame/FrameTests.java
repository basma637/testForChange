package frame;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.FramePage;
import static org.testng.Assert.*;


public class FrameTests extends BaseTest {
        @Test
        public void testFrame() {
            FramePage framePage = homePage.clickOnFram();
            framePage.clearTextBox();
            framePage.insertInTextBox("Hello world!");
            framePage.clickOnIncreaseIndentButton();
            String expectedResult= "Hello world!";
            String actualResult = framePage.getValidationMSG();
            assertEquals(actualResult , expectedResult);

        }

}
