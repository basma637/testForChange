package alert;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.JSAlertPage;

import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTest {
    @Test (priority = 1)
    public void testAlert1(){
        JSAlertPage jsAlertPage = homePage.clickOnJSAlert();
        jsAlertPage.ClickOnAlertButton();
        jsAlertPage.accetJSAlert();
        String actualResult = jsAlertPage.getvalidationMSGOfAlertButton();
        String expectedResult = "You successfully clicked an alert";
        assertEquals(actualResult ,expectedResult);
    }
    @Test (priority = 2)
    public void testAlertConfirmButton(){
        JSAlertPage jsAlertPage = homePage.clickOnJSAlert();
        jsAlertPage.ClickOnJSAlertConfirmButton();
        jsAlertPage.DismissAlertConfirmButton();
        String actualResult = jsAlertPage.getValidationMSGOfAlertConfirmButton();
        String expectedResult = "You clicked: Cancel";
        assertEquals(actualResult ,expectedResult);

    }
    @Test (priority = 3)
    public void testAlertPromptButton(){
        JSAlertPage jsAlertPage = homePage.clickOnJSAlert();
        jsAlertPage.ClickOnJSAlertPromptButton();
        jsAlertPage.InsertJSAlertPromptText("basma");
        jsAlertPage.acceptJSAlertPrompt();
        String actualResult = jsAlertPage.getValidationMSGOfAlertPrompt();
        String expectedResult = "You entered: "+ "basma";
        assertEquals(actualResult ,expectedResult);

    }
}
