package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {

    WebDriver driver;

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    private By dropdown = By.id("oldSelectMenu");

    public void open() {
        driver.get("https://demoqa.com/select-menu");
    }

    public void selectColor(String value) {
        Select select = new Select(driver.findElement(dropdown));
        select.selectByVisibleText(value);
    }

    public String getSelectedColor() {
        Select select = new Select(driver.findElement(dropdown));
        return select.getFirstSelectedOption().getText();
    }
}