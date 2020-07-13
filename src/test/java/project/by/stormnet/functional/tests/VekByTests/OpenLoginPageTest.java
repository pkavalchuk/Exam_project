package project.by.stormnet.functional.tests.VekByTests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import project.by.stormnet.functional.entities.helpers.HomeHelper;
import project.by.stormnet.functional.entities.helpers.LoginHelper;

public class OpenLoginPageTest {
    private HomeHelper homeHelper = new HomeHelper();
    private LoginHelper loginHelper = new LoginHelper();

    String email = "polinazz@inbox.ru";
    String password = "polina2907810";

    @Test(priority = 1)
    public void visibilityOfElements() {
        boolean loginPageOpen = homeHelper.navigateToHomePage().navigateToLoginPage().isLoginPageOpen();
        Assert.assertTrue(loginPageOpen);
    }

    @Test(priority = 2)
    public void logIn() {
        homeHelper.navigateToHomePage().navigateToLoginPage().isLoginPageOpen();
        boolean userLogged = loginHelper.logIn(email, password).isHomePageOpen();
        Assert.assertTrue(userLogged);
    }

    @Test(priority = 3)
    public void logout() {
        boolean userWasLoggedOut = homeHelper.logOut().isHomePageOpen();
        Assert.assertTrue(userWasLoggedOut);
    }

    @AfterTest
    public void tearDown() {
        homeHelper.quit();
    }
}