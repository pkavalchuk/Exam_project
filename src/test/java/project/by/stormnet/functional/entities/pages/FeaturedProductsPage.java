package project.by.stormnet.functional.entities.pages;

public class FeaturedProductsPage extends AbstractPage {
    private static String header = "//h2[@class='content__header']";
    private static String notEmptyFeaturedProductsPage = "//ul[@class='b-result']";
    private static String delete = "//a[@class='putaside__link cr-putaside__del j-putaside j-putaside__del']";
    private static String goToItem = "//span[@class=\"result__img\"]";

    public static FeaturedProductsPage getFeaturedProductsPage() {
        FeaturedProductsPage featuredProductsPage = new FeaturedProductsPage();
        waitForElementVisible(getElementBy(header));
        System.out.println("Featured Products page is opened!");
        return featuredProductsPage;
    }

    public Boolean isHeaderOnFeaturedProductsPage() {
        waitForElementVisible(getElementBy(header));
        return getElement(header).isDisplayed();
    }

    public Boolean isFeaturedProductsEmpty() {
        waitForElementVisible(getElementBy(header));
        if (getFeaturedProductsPage().getDriver().getPageSource().contains("Нет избранных товаров")) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isFeaturedProductsNotEmpty() {
        waitForElementVisible(getElementBy(notEmptyFeaturedProductsPage));
        return getElement(notEmptyFeaturedProductsPage).isDisplayed();
    }

    public FeaturedProductsPage clickToDelete() {
        waitForElementVisible(getElementBy(delete));
        getElement(delete).click();
        return FeaturedProductsPage.getFeaturedProductsPage();
    }

    public ProductPage navigateToProductPageFromFeatured() {
        waitForElementVisible(getElementBy(goToItem));
        getElement(goToItem).click();
        return ProductPage.getProductPage();
    }
}