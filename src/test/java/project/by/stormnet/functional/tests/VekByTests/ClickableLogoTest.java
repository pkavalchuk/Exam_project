package project.by.stormnet.functional.tests.VekByTests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import project.by.stormnet.functional.entities.helpers.HomeHelper;

public class ClickableLogoTest {
    private HomeHelper homeHelper = new HomeHelper();

    @Test
    public void clickableLogo() {
        boolean foundHeader = homeHelper.navigateToBasketPage().clickLogo().isHomePageOpen();
        Assert.assertTrue(foundHeader);

    }

    @AfterTest
    public void tearDown() {
        homeHelper.quit();
    }
}