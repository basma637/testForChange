package forgetPassword;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.ForegotPasswordPages;
import pages.RetriveConfirmationPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AccessForgetPassword extends BaseTest {
    @Test(priority = 1)
    public void testCheckForgetPasswordAction() {
        ForegotPasswordPages foregotPasswordPages = homePage.clickOnForegetPassword();
        foregotPasswordPages.insertEmail("basma@gmail.com");
        RetriveConfirmationPage retriveConfirmationPage = foregotPasswordPages.clickOnSubmitRetriveEmail();
        String expectedResult = "Internal Server Error";
        String actualResult =retriveConfirmationPage.getRetriveConfirmationMSG();
        assertTrue(actualResult.contains(expectedResult));
        //InsertEmail.sendKeys("basma@gmail.com", Keys.ENTER);
    }
}
