package project.by.stormnet.functional.entities.pages;

public class BasketPage extends AbstractPage {
    private static String results = "//tr[@class=\"j-basket-item\"]";
    private static String basketPageHeader = "//h2[@class=\"content__header\"]";
    private static String logo = "//a[@class='b-logo']";
    private static String deleteFromBasket = "//a[@class=\"g-pseudo_href cr-from_basket j-from_basket\"]";
    private static String buyButton = "//button[@class=\"g-button cr-button__order j-ga_track\"]";

    public static BasketPage getBasketPage() {
        BasketPage basketPage = new BasketPage();
        waitForElementVisible(getElementBy(basketPageHeader));
        System.out.println("Basket page is opened!");
        return basketPage;
    }

    public int getResultInBasket() {
        waitForElementVisible(getElementBy(results));
        return getElements(results).size();
    }


    public HomePage clickLogo() {
        waitForElementVisible(getElementBy(logo));
        getElement(logo).click();
        return HomePage.getHomePage();
    }

    public BasketPage clickDeleteButton() {
        waitForElementVisible(getElementBy(deleteFromBasket));
        getElement(deleteFromBasket).click();
        return BasketPage.getBasketPage();
    }

    public Boolean isBasketEmpty() throws InterruptedException {
        Thread.sleep(500);
        if (getBasketPage().getDriver().getPageSource().contains("Ваша корзина пуста")) {
            return true;
        } else {
            return false;
        }
    }

    public BasketPage clickBuyButton() {
        waitForElementVisible(getElementBy(buyButton));
        getElement(buyButton).click();
        return BasketPage.getBasketPage();
    }

    public Boolean isBuyProcessStarted() {
        waitForElementVisible(getElementBy(basketPageHeader));
        if (getBasketPage().getDriver().getPageSource().contains("Доставка")) {
            return true;
        } else {
            return false;
        }
    }
}