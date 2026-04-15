package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage {

    WebDriver driver;

    public RadioButtonPage(WebDriver driver) {
        this.driver = driver;
    }

    private By yesRadio = By.xpath("//label[@for='yesRadio']");

    public void open() {
        driver.get("https://demoqa.com/radio-button");
    }

    public void selectYes() {
        driver.findElement(yesRadio).click();
    }

    public boolean isYesSelected() {
        return driver.getPageSource().contains("Yes");
    }
}