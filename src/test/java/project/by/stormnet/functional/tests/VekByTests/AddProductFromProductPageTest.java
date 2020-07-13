package project.by.stormnet.functional.tests.VekByTests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import project.by.stormnet.functional.entities.helpers.HomeHelper;

public class AddProductFromProductPageTest {
    private HomeHelper homeHelper = new HomeHelper();

    @Test(priority = 1)
    public void checkDeleteProductFromBasket() throws InterruptedException {
        Boolean isBasketEmpty = homeHelper.addToBasketFromProductPage().deleteItemFromBasket().isBasketEmpty();
        Assert.assertTrue(isBasketEmpty, "No results were found!");
    }

    @Test(priority = 2)
    public void checkAddProductFromProductPage() throws InterruptedException {
        int countPerPage = homeHelper.addToBasketFromProductPage().getBasketResultsCount();
        Assert.assertTrue(countPerPage > 0, "No results were found!");
    }

    @AfterTest
    public void tearDown() {
        homeHelper.quit();
    }
}