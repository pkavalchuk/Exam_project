package project.by.stormnet.functional.entities.pages;

public class FeaturedProductsPage extends AbstractPage {
    private static String header = "//h2[@class='content__header']";
    private static String emptyFeaturedProductsPage = "//*[@id=\"content\"]/div[1]/ul/text()";
    private static String notEmptyFeaturedProductsPage = "//ul[@class='b-result']";


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
}