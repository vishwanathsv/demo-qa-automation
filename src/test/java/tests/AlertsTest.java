package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class AlertsTest extends BaseTest {

    @Test
    public void testAlert() {

        AlertsPage page = new AlertsPage(driver);

        page.open();
        page.clickAlert();

        String alertText = page.getAlertText();
        System.out.println("Alert Text: " + alertText);

        Assert.assertTrue(alertText.contains("You clicked"));

        page.acceptAlert();
    }
}