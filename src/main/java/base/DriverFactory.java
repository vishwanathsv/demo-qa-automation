package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

    public static WebDriver initDriver(String browser) {

        if (browser == null) {
            throw new RuntimeException("Browser value is NULL. Check config.properties");
        }

        WebDriver driver;

        switch (browser.toLowerCase()) {

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            default:
                throw new RuntimeException("Browser not supported: " + browser);
        }

        return driver;
    }
}