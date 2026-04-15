package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    WebDriver driver;

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    private By alertButton = By.id("alertButton");

    public void open() {
        driver.get("https://demoqa.com/alerts");
    }

    public void clickAlert() {
        driver.findElement(alertButton).click();
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }
}