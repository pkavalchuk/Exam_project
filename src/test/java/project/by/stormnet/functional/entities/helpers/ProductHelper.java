package project.by.stormnet.functional.entities.helpers;

import project.by.stormnet.functional.entities.pages.ProductPage;

public class ProductHelper extends AbstractHelper {
    private ProductPage productPage = new ProductPage();

    public Boolean isInfoBlock() {
        return productPage.isBlockInfo();
    }

    public ProductHelper addProductToFeaturedProducts() {
        productPage
                .clickAddToFeaturedProducts();
        return new ProductHelper();
    }
}