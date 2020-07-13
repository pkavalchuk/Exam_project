package project.by.stormnet.functional.tests.VekByTests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import project.by.stormnet.functional.entities.helpers.HomeHelper;

public class OpenFeedbackFormTest {
    private HomeHelper homeHelper = new HomeHelper();
    private String param = "Витебск";

    @Test
    public void checkFeedbackForm() {
        Boolean isFeedbackForm = homeHelper.openFeedbackPage().openFeedbackForm().isFeedbackForm();
        Assert.assertTrue(isFeedbackForm, "No results were found!");
    }

    @AfterTest
    public void tearDown() {
        homeHelper.quit();
    }
}