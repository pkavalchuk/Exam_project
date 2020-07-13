package project.by.stormnet.functional.entities.pages;

import org.openqa.selenium.Keys;

public class HomePage extends AbstractPage {
    private static String logo = "//span[@class='b-logo']";
    private static String searchField = "//input[@placeholder='Поиск']";
    private static String searchButton = "//button[@class='search__submit']";
    private static String basketButton = "//span[@class=\"cart__count j-basket_counter\"]";
    private static String productOnHomePage = "//img[@class=\"foreign_goods__img\"]";
    private static String bonusTab = "//img[@alt=\"Товары за бонусы\"]";
    private static String header = "//a[@href='/gazebos/']";
    private static String headerLogged = "//*[@id=\"content\"]/div[1]/div[1]/div/h2";
    private static String regionTab = "//li[@class=\"sitemenu__item cr-sitemenu__static cr-sitemenu__delivery\"]";
    private static String loginButton = "//span[@class=\"user_tools__link ico-login j-react-popup\"]";
    private static String feedbackLink = "//a[@href=\"https://21vek.by/services/reviews\"]";
    private static String forKitchenTab = "//span[@data-ga_action=\"Для кухни\"]";
    private static String morozilnik = "//a[@data-ga_action=\"Крупная техника / Морозильники (2673)\"]";
    private static String forHome = "//span[@data-ga_action=\"Для дома\"]";
    private static String pylosos = "//a[@data-ga_action=\"Бытовая техника / Пылесосы (3)\"]";
    private static String forRepair = "//span[@data-ga_action=\"Для ремонта\"]";
    private static String bath = "//a[@data-ga_action=\"Сантехника / Ванны (375)\"]";
    private static String myButton = "//ul[@class='b-user_tools  cr-state-signed-in']";
    private static String logoutButton = "//*[@id='react-personal']/div[2]/div[6]/div/div";
    private static String myButtonUnloggedUser = "//li[@class='user_tools__item cr-sitemenu__profile']";
    private static String featuredProducts = "//*[@id='react-personal']/div/div[2]";
    private static String instIcon = "//div[@class=\"styles_instagram__87akS styles_icon__19Zkj styles_icon__19Zkj\"]";
    private static String vkIcon = "//div[@class=\"styles_vk__2Ytbl styles_icon__19Zkj styles_icon__19Zkj\"]";
    private static String fbIcon = "//div[@class=\"styles_fb__3eTaZ styles_icon__19Zkj styles_icon__19Zkj\"]";
    private static String youtubeIcon = "//div[@class=\"styles_youtube__2uYKz styles_icon__19Zkj styles_icon__19Zkj\"]";
    private static String okIcon = "//div[@class=\"styles_ok__2tPTg styles_icon__19Zkj styles_icon__19Zkj\"]";

    public static HomePage getHomePage(){
        HomePage homePage = new HomePage();
        waitForElementVisible(getElementBy(logo));
        System.out.println("HomePage is opened!");
        return homePage;
    }

    public HomePage navigateToHomePage(){
        openUrl(baseUrl);
        return getHomePage();
    }

    public HomePage fillSearchField(String searchKey){
        getElement(searchField).sendKeys(searchKey);
        return getHomePage();
    }

    public SearchPage sendSearchField() {
        waitForElementVisible(getElementBy(searchField));
        getElement(searchField).sendKeys(Keys.ENTER);
        return SearchPage.getSearchPage();
    }

    public BasketPage goToBasket() {
        getElement(basketButton).click();
        return BasketPage.getBasketPage();
    }

    public ProductPage goToProduct() {
        getElement(productOnHomePage).click();
        return ProductPage.getProductPage();
    }

    public BonusPage clickToBonus() {
        getElement(bonusTab).click();
        return BonusPage.getBonusPage();
    }

    public SearchPage clickSearchButton(){
        getElement(basketButton).click();
        return SearchPage.getSearchPage();
    }

    public Boolean isHeaderOnHomePage(){
        return getElement(header).isDisplayed();
    }

    public RegionPage clickToRegionTab() {
        getElement(regionTab).click();
        return RegionPage.getRegionPage();
    }

    public FeedbackPage clickToFeedbackLink() {
        getElement(feedbackLink).click();
        return FeedbackPage.getFeedbackPage();
    }

    public LoginPage navigateToLoginPage() {
        waitForElementVisible(getElementBy(loginButton));
        getElement(loginButton).click();
        return LoginPage.getLoginPage();
    }

    public SearchPage clickToMorozilnik() {
        getElement(forKitchenTab).click();
        waitForElementVisible(getElementBy(morozilnik));
        getElement(morozilnik).click();
        return SearchPage.getSearchPage();
    }

    public SearchPage clickToPylisos() {
        getElement(forHome).click();
        waitForElementVisible(getElementBy(pylosos));
        getElement(pylosos).click();
        return SearchPage.getSearchPage();
    }

    public SearchPage clickToBath() {
        getElement(forRepair).click();
        waitForElementVisible(getElementBy(bath));
        getElement(bath).click();
        return SearchPage.getSearchPage();
    }

    public HomePage openDropdownList(){
        waitForElementVisible(getElementBy(myButton));
        getElement(myButton).click();
        return this;
    }

    public HomePage clickOnLogoutButton(){
        waitForElementVisible(getElementBy(logoutButton));
        getElement(logoutButton).click();
        return this;
    }

    public HomePage openDropdownListUnloggedUser(){
        waitForElementVisible(getElementBy(myButtonUnloggedUser));
        getElement(myButtonUnloggedUser).click();
        return this;
    }

    public HomePage clickOnFeaturedProducts(){
        waitForElementVisible(getElementBy(featuredProducts));
        getElement(featuredProducts).click();
        return this;
    }

    public Boolean isVkIconOnHomePage(){
        waitForElementVisible(getElementBy(vkIcon));
        return getElement(vkIcon).isDisplayed();
    }

    public Boolean isFbIconOnHomePage(){
        waitForElementVisible(getElementBy(fbIcon));
        return getElement(fbIcon).isDisplayed();
    }

    public Boolean isInstaIconOnHomePage(){
        waitForElementVisible(getElementBy(instIcon));
        return getElement(instIcon).isDisplayed();
    }

    public Boolean isYoutubeIconOnHomePage(){
        waitForElementVisible(getElementBy(youtubeIcon));
        return getElement(youtubeIcon).isDisplayed();
    }

    public Boolean isOkIconOnHomePage(){
        waitForElementVisible(getElementBy(okIcon));
        return getElement(okIcon).isDisplayed();
    }
}