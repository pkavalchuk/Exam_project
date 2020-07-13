package project.by.stormnet.functional.entities.helpers;

import project.by.stormnet.functional.entities.pages.BasketPage;
import project.by.stormnet.functional.entities.pages.BonusPage;
import project.by.stormnet.functional.entities.pages.FeedbackPage;
import project.by.stormnet.functional.entities.pages.HomePage;

public class HomeHelper extends AbstractHelper {
    private HomePage homePage = new HomePage();

    public HomeHelper navigateToHomePage(){
        System.out.println("Navigate to 'Home' page");
        homePage.navigateToHomePage();
        return this;
    }

    public SearchHelper search(String searchKey){
        navigateToHomePage();
        homePage
                .fillSearchField(searchKey)
                .sendSearchField();

        return new SearchHelper();
    }

    public BasketHelper addToBasketFromSearchPage(String searchKey){
        navigateToHomePage();
        homePage
                .fillSearchField(searchKey)
                .sendSearchField()
                .clickAddToBasketButton();
        homePage.goToBasket();
        return new BasketHelper();
    }

    public BasketHelper addToBasketFromProductPage() throws InterruptedException {
        navigateToHomePage();
        homePage
                .goToProduct()
                .clickAddToBasketButton();
        Thread.sleep(500);
        homePage.goToBasket();
        return new BasketHelper();
    }

    public BonusHelper openBonusPage(){
        navigateToHomePage();
        homePage
                .clickToBonus();
        return new BonusHelper();
    }

    public RegionHelper openRegionPage(){
        navigateToHomePage();
        homePage
                .clickToRegionTab();
        return new RegionHelper();
    }

    public FeedbackHelper openFeedbackPage(){
        navigateToHomePage();
        homePage
                .clickToFeedbackLink();
        return new FeedbackHelper();
    }

    public BasketHelper navigateToBasketPage(){
        navigateToHomePage();
        System.out.println("Navigate to 'Basket' page");
        homePage.goToBasket();
        return new BasketHelper();
    }

    public Boolean isHomePageOpen(){
        return homePage.isHeaderOnHomePage();
    }

    public LoginHelper navigateToLoginPage() {
        System.out.println("Navigate to 'Login' page");
        homePage.navigateToLoginPage();
        return new LoginHelper();
    }

    public SearchHelper openMorozilnikSearch(){
        navigateToHomePage();
        homePage
                .clickToMorozilnik();
        return new SearchHelper();
    }

    public SearchHelper openPylisosSearch(){
        navigateToHomePage();
        homePage
                .clickToPylisos();
        return new SearchHelper();
    }

    public SearchHelper openBathSearch(){
        navigateToHomePage();
        homePage
                .clickToBath();
        return new SearchHelper();
    }

    public HomeHelper logOut() {
        homePage
                .openDropdownList()
                .clickOnLogoutButton();
        return this;
    }
    public ProductHelper navigateToProductPage() {
        navigateToHomePage();
        homePage.goToProduct();
        System.out.println("Navigate to 'Product' page");
        return new ProductHelper();
    }

    public FeaturedProductsHelper navigateToFeaturedProductsPage() {
        System.out.println("Navigate to 'Featured Products' page");
        homePage
                .openDropdownListUnloggedUser()
                .clickOnFeaturedProducts();
        return new FeaturedProductsHelper();
    }

    public Boolean isVkIconInFooter(){
        return homePage.isVkIconOnHomePage();
    }

    public Boolean isFbIconInFooter(){
        return homePage.isFbIconOnHomePage();
    }

    public Boolean isInstaIconInFooter(){
        return homePage.isInstaIconOnHomePage();
    }

    public Boolean isYoutubeIconInFooter(){
        return homePage.isYoutubeIconOnHomePage();
    }

    public Boolean isOKIconInFooter(){
        return homePage.isOkIconOnHomePage();
    }
}