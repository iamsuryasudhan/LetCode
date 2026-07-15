package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputPage {

    WebDriver driver;

    public InputPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By fullName = By.id("fullName");
    By appendText = By.id("join");
    By getText = By.id("getMe");
    By clearText = By.id("clearMe");

    // Enter Full Name
    public void enterFullName(String name) {
        driver.findElement(fullName).clear();
        driver.findElement(fullName).sendKeys(name);
    }

    // Append Text
    public void appendText(String text) {
        driver.findElement(appendText).sendKeys(text);
    }

    // Get Text from textbox
    public String getInsideText() {
        return driver.findElement(getText).getAttribute("value");
    }

    // Clear textbox
    public void clearTextbox() {
        driver.findElement(clearText).clear();
    }
}