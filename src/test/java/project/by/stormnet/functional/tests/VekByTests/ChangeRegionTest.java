package project.by.stormnet.functional.tests.VekByTests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import project.by.stormnet.functional.entities.helpers.HomeHelper;
import project.by.stormnet.functional.entities.helpers.RegionHelper;

public class ChangeRegionTest {
    private HomeHelper homeHelper = new HomeHelper();
    private RegionHelper regionHelper = new RegionHelper();
    private String param = "Витебск";


    @Test(priority = 1)
    public void checkRegionPageOpen() {
        String headerText = homeHelper.openRegionPage().getRegionPageHeader();
        Assert.assertTrue(headerText.equals("Доставка"), "No results were found!");
    }

    @Test(priority = 2)
    public void changeRegion() throws InterruptedException {
        String currentRegionTextText = regionHelper.changeRegion(param).getCurrentRegionText();
        Assert.assertTrue(currentRegionTextText.equals("из пункта выдачи заказов в г. Витебск"), "No results were found!");
    }

    @AfterTest
    public void tearDown() {
        homeHelper.quit();
    }
}