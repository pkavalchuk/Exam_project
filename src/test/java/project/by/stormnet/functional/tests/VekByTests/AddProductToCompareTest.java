package project.by.stormnet.functional.tests.VekByTests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import project.by.stormnet.functional.entities.helpers.HomeHelper;

public class AddProductToCompareTest {
    private HomeHelper homeHelper = new HomeHelper();

    @Test
    public void checkAddProductToCompare() {
        boolean isAddedToCompare = homeHelper
                .openMorozilnikSearch()
                .addItemToCompare()
                .isItemAddedToCompare();
        Assert.assertTrue(isAddedToCompare, "No results were found!");
    }

    @AfterTest
    public void tearDown() {
        homeHelper.quit();
    }
}