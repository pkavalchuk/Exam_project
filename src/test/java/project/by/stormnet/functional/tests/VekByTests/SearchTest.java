package project.by.stormnet.functional.tests.VekByTests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import project.by.stormnet.functional.entities.helpers.HomeHelper;

public class SearchTest {
    private HomeHelper homeHelper = new HomeHelper();

    private String param;

    @Factory(dataProvider = "searchKeyProvider")
    public SearchTest(String param) {
        this.param = param;
    }

    @DataProvider
    public static Object[][] searchKeyProvider() {
        return new Object[][]{{"джинсы"}, {"юбки"}, {"платья"}};
    }

    @Test
    public void performSearch() {
        int countPerPage = homeHelper.search(param).getSearchResultsCountPerPage();
        Assert.assertTrue(countPerPage > 0, "No results were found!");
    }

    @AfterTest
    public void tearDown() {
        homeHelper.quit();
    }
}