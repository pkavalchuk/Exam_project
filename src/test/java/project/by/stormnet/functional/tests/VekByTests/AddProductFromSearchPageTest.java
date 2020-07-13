package project.by.stormnet.functional.tests.VekByTests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import project.by.stormnet.functional.entities.helpers.HomeHelper;

public class AddProductFromSearchPageTest {
    private HomeHelper homeHelper = new HomeHelper();
    private String param = "джинсы";

    @Test
    public void checkAddProductFromSearchPage() {
        int countPerPage = homeHelper.addToBasketFromSearchPage(param).getBasketResultsCount();
        Assert.assertTrue(countPerPage > 0, "No results were found!");
    }

    @AfterTest
    public void tearDown() {
        homeHelper.quit();
    }
}