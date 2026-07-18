package base;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AlertPage;
import utils.ExcelUtils;

public class AlertTest extends BaseTest {

    AlertPage alertPage;

    @Test(priority = 1)
    public void testAcceptAlert() throws Exception {

        driver.get("https://letcode.in/alert");

        alertPage = new AlertPage(driver);

        alertPage.acceptAlert();

        Alert alert = driver.switchTo().alert();

        System.out.println("Accept Alert Text: " + alert.getText());

        alert.accept();
    }

    @Test(priority = 2)
    public void testConfirmAlert() throws Exception {

        driver.get("https://letcode.in/alert");

        alertPage = new AlertPage(driver);

        alertPage.confirmAlert();

        Alert alert = driver.switchTo().alert();

        System.out.println("Confirm Alert Text: " + alert.getText());

        alert.accept();
    }

    @Test(priority = 3)
    public void testPromptAlert() throws Exception {

        driver.get("https://letcode.in/alert");

        alertPage = new AlertPage(driver);

        alertPage.promptAlert();

        Alert alert = driver.switchTo().alert();

        String name = ExcelUtils.getCellData("AlertTest", 1, 0);

        alert.sendKeys(name);

        alert.accept();

        System.out.println("Prompt Input: " + name);

        ExcelUtils.setCellData("AlertTest", 1, 1, "Passed");
    }

    @Test(priority = 4)
    public void testModernAlert() {

        driver.get("https://letcode.in/alert");

        alertPage = new AlertPage(driver);

        alertPage.modernAlert();

        System.out.println("Modern Alert button clicked successfully");

        Assert.assertTrue(true);
    }
}