package project.by.stormnet.functional.tests.VekByTests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import project.by.stormnet.functional.entities.helpers.HomeHelper;

public class RedirectToMenuTabsTest {
    private HomeHelper homeHelper = new HomeHelper();

    @Test(priority = 1)
    public void checkMorozilnikSearch() {
        Boolean isMorozilnik = homeHelper.navigateToHomePage().openMorozilnikSearch().isMorozilnikSearch();
        Assert.assertTrue(isMorozilnik, "No results were found!");
    }

    @Test(priority = 2)
    public void checkPolisosSearch() {
        Boolean isPolisos = homeHelper.navigateToHomePage().openPylisosSearch().isPolisosSearch();
        Assert.assertTrue(isPolisos, "No results were found!");
    }

    @Test(priority = 3)
    public void checkBathSearch() {
        Boolean isBath = homeHelper.navigateToHomePage().openBathSearch().isBathSearch();
        Assert.assertTrue(isBath, "No results were found!");
    }

    @AfterTest
    public void tearDown() {
        homeHelper.quit();
    }
}