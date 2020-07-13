package project.by.stormnet.functional.tests.VekByTests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import project.by.stormnet.functional.entities.helpers.BasketHelper;
import project.by.stormnet.functional.entities.helpers.HomeHelper;

public class AddProductFromSearchPageTest {
    private HomeHelper homeHelper = new HomeHelper();
    private BasketHelper basketHelper = new BasketHelper();
    private String param = "джинсы";

    @Test(priority = 1)
    public void checkBuyProcessInBasket() throws InterruptedException {
        Boolean isBuyProcess = homeHelper.addToBasketFromProductPage().buyProduct().isBuyProcessStarted();
        Assert.assertTrue(isBuyProcess, "No results were found!");
        basketHelper.deleteItemFromBasket();
    }

    @Test(priority = 2)
    public void checkAddProductFromSearchPage() {
        int countPerPage = homeHelper.addToBasketFromSearchPage(param).getBasketResultsCount();
        Assert.assertTrue(countPerPage > 0, "No results were found!");
        basketHelper.deleteItemFromBasket();
    }

    @AfterTest
    public void tearDown() {
        homeHelper.quit();
    }
}