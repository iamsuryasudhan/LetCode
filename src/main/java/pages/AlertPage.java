package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {

    WebDriver driver;

    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }

    // Accept Alert
    public void acceptAlert() {
        driver.findElement(By.id("accept")).click();
    }

    // Confirm Alert
    public void confirmAlert() {
        driver.findElement(By.id("confirm")).click();
    }

    // Prompt Alert
    public void promptAlert() {
        driver.findElement(By.id("prompt")).click();
    }

    // Modern Alert
    public void modernAlert() {
        driver.findElement(By.id("modern")).click();
    }
}