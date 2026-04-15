package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage {

    WebDriver driver;

    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By homeCheckbox = By.xpath("//span[text()='Home']");

    public void open() {
        driver.get("https://demoqa.com/checkbox");
    }

    public void clickHome() {
        driver.findElement(homeCheckbox).click();
    }

    public boolean isHomeDisplayed() {
        return driver.findElement(homeCheckbox).isDisplayed();
    }
}