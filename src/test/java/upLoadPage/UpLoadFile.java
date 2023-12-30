package upLoadPage;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class UpLoadFile extends BaseTest {
    @Test(priority = 1)

    public void testUpLoadFile() {
        WebElement PressUploadFile = driver.findElement(By.xpath("// a [contains(@href,'/upload')]"));
        PressUploadFile.click();
        WebElement upLoadFile = driver.findElement(By.xpath("//* [@id=\"file-upload\"]"));
        upLoadFile.sendKeys("C:\\Users\\Bassma Qassem\\Documents\\ui\\DIGI_Library\\AddCustomerToSalesInvoice.xaml");
        WebElement pressOnUpLoadButton = driver.findElement(By.xpath("//*[@type=\"submit\"]"));
        pressOnUpLoadButton.click();
        String expectedResult= "File Uploaded!";
        String actualResult;
        actualResult= driver.findElement(By.xpath("//div [contains( @class, 'example')][h3]")).getText();
        //System.out.println(actualResult);
        assertTrue(actualResult.contains(expectedResult));
}}
