package project.by.stormnet.functional.entities.pages;

public class BasketPage extends AbstractPage {
    private static String results = "//tr[@class=\"j-basket-item\"]";
    private static String basketPageHeader = "//h2[@class=\"content__header\"]";
    private static String logo = "//a[@class='b-logo']";

    public static BasketPage getBasketPage() {
        BasketPage basketPage = new BasketPage();
        waitForElementVisible(getElementBy(basketPageHeader));
        System.out.println("Basket page is opened!");
        return basketPage;
    }

    public int getResultInBasket() {
        return getElements(results).size();
    }


    public HomePage clickLogo() {
        waitForElementVisible(getElementBy(logo));
        getElement(logo).click();
        return HomePage.getHomePage();
    }
//
// public SearchPage clickAddToBasketButton(){
// getElement(basketButton).click();
// return SearchPage.getSearchPage();
// }
}