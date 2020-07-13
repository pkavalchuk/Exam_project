package project.by.stormnet.functional.tests.VekByTests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import project.by.stormnet.functional.entities.helpers.HomeHelper;

public class ProductPageTest {
    private HomeHelper homeHelper = new HomeHelper();

    @Test
    public void checkProductInfo() {
        boolean isInfoBlock = homeHelper.navigateToProductPage().isInfoBlock();
        Assert.assertTrue(isInfoBlock, "No results were found!");
    }

    @AfterTest
    public void tearDown() {
        homeHelper.quit();
    }
}