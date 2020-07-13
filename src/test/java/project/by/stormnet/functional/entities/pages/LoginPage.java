package project.by.stormnet.functional.entities.pages;

public class LoginPage extends AbstractPage{
    private static String inputButton = "//div[@class='selen-pokdbn5820x']";
    private static String email = "//input[@name='email']";
    private static String password = "//input[@name='password']";


    public static LoginPage getLoginPage(){
        LoginPage loginPage = new LoginPage();
        waitForElementVisible(getElementBy(inputButton));
        System.out.println("Login page is opened!");
        return loginPage;
    }

    public Boolean isButtonOnLoginPage(){
        return getElement(inputButton).isDisplayed();
    }

    public LoginPage fillEmailField(String searchKey){
        getElement(email).sendKeys(searchKey);
        return getLoginPage();
    }

    public LoginPage fillPasswordField(String searchKey){
        getElement(password).sendKeys(searchKey);
        return getLoginPage();
    }

    public HomePage logIn(){
        getElement(inputButton).click();
        return HomePage.getHomePage();
    }
}