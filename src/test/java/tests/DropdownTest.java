package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;

public class DropdownTest extends BaseTest {

    @Test
    public void testDropdown() {

        DropdownPage page = new DropdownPage(driver);

        page.open();
        page.selectColor("Purple");

        Assert.assertEquals(page.getSelectedColor(), "Purple");
    }
}