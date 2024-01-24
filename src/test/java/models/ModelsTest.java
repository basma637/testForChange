package models;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ModulePage;

public class ModelsTest extends BaseTest {
    @Test
    public void testCloseModel(){
      ModulePage modulePage = homePage.clickOnModuleLink();
      modulePage.clickModulePageById();
    }
}
