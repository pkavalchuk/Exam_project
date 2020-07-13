package project.by.stormnet.functional.entities.helpers;

import project.by.stormnet.functional.entities.pages.BasketPage;

public class BasketHelper extends AbstractHelper {
    private BasketPage basketPage = new BasketPage();

    public int getBasketResultsCount() {
        return basketPage.getResultInBasket();
    }

    public HomeHelper clickLogo() {
        basketPage
                .clickLogo();
        return new HomeHelper();
    }

    public BasketHelper deleteItemFromBasket() {
        basketPage
                .clickDeleteButton();
        return new BasketHelper();
    }

    public Boolean isBasketEmpty() throws InterruptedException {
        return basketPage.isBasketEmpty();
    }

    public BasketHelper buyProduct() {
        basketPage
                .clickBuyButton();
        return new BasketHelper();
    }

    public Boolean isBuyProcessStarted() {
        return basketPage.isBuyProcessStarted();
    }
}