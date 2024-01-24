package DynamicLoading;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;
import pages.OneePage;
import pages.TwoPage;

import static org.testng.Assert.*;

public class DynamicLoadingTests extends BaseTest {
    @Test(priority = 1)
    public void testDynamicLoading (){
        DynamicLoadingPage dynamicLoadingPage =homePage.clickOnDynamicallyLoadedLink();
        OneePage oneePage = dynamicLoadingPage.clickOnExampleOneLink();
        oneePage.clickOnStartButton();
        String actualResult = oneePage.setValidationMessage();
        String expectedResult = "Hello World!";
        assertEquals(actualResult , expectedResult);}
    @Test(priority = 2)
    public void testDynamicLoadingCathLoader (){
        DynamicLoadingPage dynamicLoadingPage =homePage.clickOnDynamicallyLoadedLink();
        TwoPage twoPage = dynamicLoadingPage.clickOnExampleTwoLink();
        twoPage.clickOnStartButton();
       // String acualReult = twoPage.GetLoaderStatus();
        System.out.println(twoPage.GetLoaderStatus());

        assertFalse(twoPage.GetLoaderStatus());

    }
}
