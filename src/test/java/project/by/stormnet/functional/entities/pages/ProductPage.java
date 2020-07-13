package project.by.stormnet.functional.entities.pages;

public class ProductPage extends AbstractPage {
    private static String item = "//div[@class=\"fotorama__frame fotorama__frame_active\"]";
    private static String addToBasketButton = "//button[@class=\"g-button g-buybtn item__buybtn cr-buybtn__in j-ga_track\"]";
    private static String infoBlock = "//div[@class=\"b-attrs columns__nowrap\"]";
    private static String addToFeaturedProducts = "//a[@href='/aside/?item=223101']";

    public static ProductPage getProductPage() {
        ProductPage productPage = new ProductPage();
        waitForElementVisible(getElementBy(item));
        System.out.println("ProductPage is opened!");
        return productPage;
    }

    public ProductPage clickAddToBasketButton() {
        getElement(addToBasketButton).click();
        return ProductPage.getProductPage();
    }

    public ProductPage clickAddToFeaturedProducts() {
        getElement(addToFeaturedProducts).click();
        return ProductPage.getProductPage();
    }

    public Boolean isBlockInfo() {
        return getElement(infoBlock).isDisplayed();
    }
}