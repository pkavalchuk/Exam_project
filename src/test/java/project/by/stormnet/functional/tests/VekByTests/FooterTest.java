package project.by.stormnet.functional.tests.VekByTests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import project.by.stormnet.functional.entities.helpers.HomeHelper;

public class FooterTest {
    private HomeHelper homeHelper = new HomeHelper();

    @Test(priority = 1)
    public void checkVkInFooter() {
        Boolean isVk = homeHelper.navigateToHomePage().isVkIconInFooter();
        Assert.assertTrue(isVk, "No results were found!");
    }

    @Test(priority = 2)
    public void checkFbInFooter() {
        Boolean isFb = homeHelper.navigateToHomePage().isFbIconInFooter();
        Assert.assertTrue(isFb, "No results were found!");
    }

    @Test(priority = 3)
    public void checkInstaInFooter() {
        Boolean isInsta = homeHelper.navigateToHomePage().isInstaIconInFooter();
        Assert.assertTrue(isInsta, "No results were found!");
    }

    @Test(priority = 4)
    public void checkYoutubeInFooter() {
        Boolean isYoutube = homeHelper.navigateToHomePage().isYoutubeIconInFooter();
        Assert.assertTrue(isYoutube, "No results were found!");
    }

    @Test(priority = 5)
    public void checkOkInFooter() {
        Boolean isOk = homeHelper.navigateToHomePage().isOKIconInFooter();
        Assert.assertTrue(isOk, "No results were found!");
    }

    @AfterTest
    public void tearDown() {
        homeHelper.quit();
    }
}