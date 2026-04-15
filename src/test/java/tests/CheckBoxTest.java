package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckBoxPage;

public class CheckBoxTest extends BaseTest {

    @Test
    public void testCheckBox() {

        CheckBoxPage page = new CheckBoxPage(driver);

        page.open();
        page.clickHome();

        Assert.assertTrue(page.isHomeDisplayed());
    }
}