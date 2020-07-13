package project.by.stormnet.functional.tests.VekByTests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import project.by.stormnet.functional.entities.helpers.HomeHelper;

public class AddProductFromProductPageTest {
    private HomeHelper homeHelper = new HomeHelper();

    @Test
    public void checkAddProductFromProductPage() throws InterruptedException {
        int countPerPage = homeHelper.addToBasketFromProductPage().getBasketResultsCount();
        Assert.assertTrue(countPerPage > 0, "No results were found!");
    }

    @AfterTest
    public void tearDown() {
        homeHelper.quit();
    }
}