package login;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test (priority = 1)
    public void testSuccessfulLogin() {

        driver.findElement(By.xpath("//a [@href=\"/login\"]")).click();
        driver.findElement(By.xpath("//input [contains(@id, 'username')]")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//* [@name ='password']")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//i [@class ='fa fa-2x fa-sign-in']")).click();
        String expectedResult= "You logged into a secure area!";
        String actualResult= driver.findElement(By.xpath("//* [@id=\"flash\"]")).getText();
        assertTrue(actualResult.contains(expectedResult));

    }
    @Test (priority = 2)
    public void loginWithInvalidUsername() {
        WebElement pressOnURL = driver.findElement(By.xpath("//a [@href=\"/login\"]"));
        pressOnURL.click();
        WebElement userName = driver.findElement(By.xpath("//input [contains(@id, 'username')]"));
        userName.sendKeys("msmith");
        WebElement password = driver.findElement(By.xpath("//* [@name ='password']"));
        password.sendKeys("SuperSecretPassword!");
        WebElement logInButton = driver.findElement(By.xpath("//i [@class ='fa fa-2x fa-sign-in']"));
        logInButton.click();
        String expectedResult= "Your username is invalid!";
        String actualResult;
        actualResult= driver.findElement(By.xpath("//* [@class=\"flash error\"]")).getText();
       assertTrue(actualResult.contains(expectedResult));
    }
    @Test (priority = 3)
    public void loginWithInvalidPassword() {
        WebElement pressOnURL = driver.findElement(By.xpath("//a [@href=\"/login\"]"));
        pressOnURL.click();
        WebElement userName = driver.findElement(By.xpath("//input [contains(@id, 'username')]"));
        userName.sendKeys("tomsmith");
        WebElement password = driver.findElement(By.xpath("//* [@name ='password']"));
        password.sendKeys("SuperSecretPass");
        WebElement logInButton = driver.findElement(By.xpath("//i [@class ='fa fa-2x fa-sign-in']"));
        logInButton.click();
        String expectedResult= "Your password is invalid!";
        String actualResult;
        actualResult= driver.findElement(By.xpath("//* [@class=\"flash error\"]")).getText();
        assertTrue(actualResult.contains(expectedResult));
    }
}