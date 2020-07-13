package project.by.stormnet.functional.tests.VekByTests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import project.by.stormnet.functional.entities.helpers.HomeHelper;

public class SearchWithParamsTests {
    private HomeHelper homeHelper = new HomeHelper();

    private String param;
    private String startPrice;
    private String endPrice;

    @Factory(dataProvider = "searchKeyProvider")
    public SearchWithParamsTests(String param, String startPrice, String endPrice) {
        this.param = param;
        this.startPrice = startPrice;
        this.endPrice = endPrice;
    }

    @DataProvider
    public static Object[][] searchKeyProvider() {
        return new Object[][]{{"телевизор", "300", "700"}, {"телефон", "100", "1000"}, {"пылесос", "50", "600"}};
    }

    @Test
    public void performSearchWihPriceParams() {
        int countPerPage = homeHelper.search(param).searchWithPriceParams(startPrice, endPrice).getSearchResultsCountPerPage();
        Assert.assertTrue(countPerPage > 0, "No results were found!");
    }

    @Test
    public void performSearchWihSamsungCheckBoxParam() {
        int countPerPage = homeHelper.search(param).searchWithSamsungCheckBoxPara().getSearchResultsCountPerPage();
        Assert.assertTrue(countPerPage > 0, "No results were found!");
    }

    @Test
    public void performResetFilterParams() {
        boolean isCheckboxUnchecked = homeHelper
                .search(param)
                .selectSamsungCheckBox()
                .resetFilter()
                .isSamsungCheckBoxUnchecked();
        Assert.assertTrue(isCheckboxUnchecked, "No results were found!");
    }

    @AfterTest
    public void tearDown() {
        homeHelper.quit();
    }
}