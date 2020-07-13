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
}