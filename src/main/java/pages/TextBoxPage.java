package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBoxPage {

    WebDriver driver;

    // Constructor
    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By fullName = By.id("userName");
    private By email = By.id("userEmail");
    private By currentAddress = By.id("currentAddress");
    private By submitButton = By.id("submit");

    // Actions

    // Open TextBox Page
    public void open() {
        driver.get("https://demoqa.com/text-box");
    }

    // Fill form
    public void fillForm(String name, String mail, String address) {
        driver.findElement(fullName).sendKeys(name);
        driver.findElement(email).sendKeys(mail);
        driver.findElement(currentAddress).sendKeys(address);
        driver.findElement(submitButton).click();
    }

    // Validation (Better than pageSource)
    public String getEnteredName() {
        return driver.findElement(By.id("name")).getText();
    }
}