package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RadioButtonPage;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton() {

        RadioButtonPage page = new RadioButtonPage(driver);

        page.open();
        page.selectYes();

        Assert.assertTrue(page.isYesSelected());
    }
}