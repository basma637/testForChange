package statusCode;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;
import static org.testng.Assert.assertTrue;

public class CheckStatusCode extends BaseTest {
    @Test(priority = 1)
    public void test200StatusCode() {
        StatusCodesPages statusCodesPages = homePage.clickOnStatusCodeLink();
        StatusCodeOf200Page statusCodeOf200Page = statusCodesPages.clickOn200code();
        String ActualResult = statusCodeOf200Page.getvalidationMessage();
        //System.out.println(ActualResult);
        String expectedResult = "This page returned a 200 status code";
        assertTrue(ActualResult.contains(expectedResult));
    }
    @Test (priority = 2)
    public void test301StatusCode(){
        StatusCodesPages statusCodesPages = homePage.clickOnStatusCodeLink();
        StatusCodeOf301Page statusCodeOf301Page = statusCodesPages.clickOn301();
        String ActualResult = statusCodeOf301Page.getvalidationMessageOf301();
        String expectedResult = "This page returned a 301 status code";
        assertTrue(ActualResult.contains(expectedResult));
    }
    @Test (priority = 3)
    public void test404StatusCode(){
        StatusCodesPages statusCodesPages = homePage.clickOnStatusCodeLink();
        StatusCodeOf404Page statusCodeOf404Page = statusCodesPages.clickOn404();
        String ActualResult = statusCodeOf404Page.getvalidationMessageOf404();
        String expectedResult = "This page returned a 301 status code";
        assertTrue(ActualResult.contains(expectedResult));
    }
    @Test (priority = 4)
    public void test500StatusCode(){
        StatusCodesPages statusCodesPages = homePage.clickOnStatusCodeLink();
        StatusCodeOf500Page statusCodeOf500Page = statusCodesPages.clickOn500();
        String ActualResult = statusCodeOf500Page.getvalidationMessageOf500();
        String expectedResult = "This page returned a 500 status code";
        assertTrue(ActualResult.contains(expectedResult));
    }
}