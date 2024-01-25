package models;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ModulePage;

import static org.testng.Assert.assertEquals;

public class ModelsTest extends BaseTest {
    @Test (priority = 1)
    public void testCloseModel(){

      ModulePage modulePage = homePage.clickOnModuleLink();
      modulePage.clickModulePageById();
      String expectedResult = "Entry Ad";
      String actualResult = modulePage.getValidationMSGOfModulePage();
      assertEquals(actualResult,expectedResult);
    }
    @Test (priority = 2)
    public void testRe_enableModel(){
        ModulePage modulePage = homePage.clickOnModuleLink();
        modulePage.clickModulePageById();
        modulePage.ClickOnreanableButton();
        String expectedResult = "Entry Ad";
        String actualResult = modulePage.getValidationMSGOfModulePage();
        assertEquals(actualResult,expectedResult);
    }
}
