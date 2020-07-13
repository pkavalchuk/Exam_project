package project.by.stormnet.functional.entities.helpers;

import project.by.stormnet.functional.entities.pages.LoginPage;

public class LoginHelper extends AbstractHelper {
    LoginPage loginPage = new LoginPage();

    public Boolean isLoginPageOpen() {
        return loginPage.isButtonOnLoginPage();
    }

    public HomeHelper logIn(String email, String password) {
        loginPage
                .fillEmailField(email)
                .fillPasswordField(password)
                .logIn();
        return new HomeHelper();
    }
}