package project.by.stormnet.functional.tests.VekByTests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import project.by.stormnet.functional.entities.helpers.HomeHelper;

public class BonusPageTest {
    private HomeHelper homeHelper = new HomeHelper();

    @Test
    public void checkOpenBonusPage() {
        String headerText = homeHelper.openBonusPage().getBonusPageHeader();
        Assert.assertTrue(headerText.equals("Бонусная программа"), "No results were found!");
    }

    @AfterTest
    public void tearDown() {
        homeHelper.quit();
    }
}