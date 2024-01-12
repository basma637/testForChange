package login;
import base.BaseTest;
import org.testng.annotations.*;
import pages.LoginPage;
import pages.SecureAreaPage;
import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTest {

    @Test (priority = 1)
    public void testSuccessfulLogin() {

        LoginPage loginPage = homePage.clickOnFormAuthenticationLink();
        loginPage.insertUsername("tomsmith");
        loginPage.insertPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickOnLoginButton();
        String expectedResult = "You logged into a secure area!";
        String actualResult = secureAreaPage.getValidationMessage();
        assertTrue(actualResult.contains(expectedResult));
    }
    @Test(priority = 2)
    public void testInvalidUsername() {

        LoginPage loginPage=  homePage.clickOnFormAuthenticationLink();
        loginPage.insertUsername("fasdfd");
        loginPage.insertPassword("adsfds");
        SecureAreaPage secureAreaPage = loginPage.clickOnLoginButton();
        String actualResult = secureAreaPage.getValidationMessage();
        String expectedResult= "Your username is invalid!";
        assertTrue(actualResult.contains(expectedResult));

    }

    @Test(priority = 3)
    public void testInvalidPassword() {
        LoginPage loginPage=  homePage.clickOnFormAuthenticationLink();
        loginPage.insertUsername("tomsmith");
        loginPage.insertPassword("adsfds");
        SecureAreaPage secureAreaPage = loginPage.clickOnLoginButton();
        String actualResult = secureAreaPage.getValidationMessage();
        String expectedResult= "Your password is invalid!";
        assertTrue(actualResult.contains(expectedResult));

    }
}