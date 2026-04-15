package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TextBoxPage;

public class TextBoxTest extends BaseTest {

    @Test
    public void testTextBox() {

        TextBoxPage page = new TextBoxPage(driver);

        page.open();
        page.fillForm("Vishwa", "test@mail.com", "Bangalore");

        Assert.assertTrue(page.getEnteredName().contains("Vishwa"));
    }
}