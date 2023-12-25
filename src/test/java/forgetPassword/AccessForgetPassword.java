package forgetPassword;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AccessForgetPassword extends BaseTest {
    @Test(priority = 1)
    public void testCheckForgetPasswordAction() {
        WebElement PressForgetPassword = driver.findElement(By.xpath("// a [contains(@href,'forgot_password')]"));
        PressForgetPassword.click();
        WebElement InsertEmail = driver.findElement(By.xpath("//* [@id=\"email\"]"));
        InsertEmail.sendKeys("basma@gmail.com", Keys.ENTER);
        WebElement actualResult = driver.findElement(By.tagName("h1"));
        //System.out.println(actualResult);
        assertTrue(actualResult.isEnabled());

}}
