package statusCode;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckStatusCode extends BaseTest {
    @Test(priority = 1)
    public void test200StatusCode() {
        WebElement PressStatusCodeLink = driver.findElement(By.linkText("Status Codes"));
        PressStatusCodeLink.click();
        WebElement ClickOn200 = driver.findElement(By.xpath("// a [contains (@href,'status_codes/200')]"));
        ClickOn200.click();
        String expectedResult = "This page returned a 200 status code";
        String actualResult;
        actualResult = driver.findElement(By.xpath("//*[ @id = 'content']")).getText();
        //System.out.println(actualResult);
        assertTrue(actualResult.contains(expectedResult));
    }

    @Test(priority = 2)
    public void test301StatusCode() {
        WebElement PressStatusCodeLink = driver.findElement(By.linkText("Status Codes"));
        PressStatusCodeLink.click();
        WebElement ClickOn301 = driver.findElement(By.xpath("// a [contains (@href,'status_codes/301')]"));
        ClickOn301.click();
        String expectedResult = "This page returned a 301 status code";
        String actualResult;
        actualResult = driver.findElement(By.xpath("//*[ @id = 'content']")).getText();
        //System.out.println(actualResult);
        assertTrue(actualResult.contains(expectedResult));

    }

    @Test(priority = 3)
    public void test404StatusCode() {
        WebElement PressStatusCodeLink = driver.findElement(By.linkText("Status Codes"));
        PressStatusCodeLink.click();
        WebElement ClickOn404 = driver.findElement(By.xpath("// a [contains (@href,'status_codes/404')]"));
        ClickOn404.click();
        String expectedResult = "This page returned a 404 status code";
        String actualResult;
        actualResult = driver.findElement(By.xpath("//*[ @id = 'content']")).getText();
        //System.out.println(actualResult);
        assertTrue(actualResult.contains(expectedResult));
    }
    @Test(priority = 4)
    public void test500StatusCode() {
        WebElement PressStatusCodeLink = driver.findElement(By.linkText("Status Codes"));
        PressStatusCodeLink.click();
        WebElement ClickOn500 = driver.findElement(By.xpath("// a [contains (@href,'status_codes/500')]"));
        ClickOn500.click();
        String expectedResult = "This page returned a 500 status code";
        String actualResult;
        actualResult = driver.findElement(By.xpath("//*[ @id = 'content']")).getText();
        //System.out.println(actualResult);
        assertTrue(actualResult.contains(expectedResult));
    }
}