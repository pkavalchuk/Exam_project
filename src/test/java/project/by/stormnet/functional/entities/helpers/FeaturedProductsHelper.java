package project.by.stormnet.functional.entities.helpers;

import project.by.stormnet.functional.entities.pages.FeaturedProductsPage;

public class FeaturedProductsHelper extends AbstractHelper {
    FeaturedProductsPage featuredProductsPage = new FeaturedProductsPage();

    public Boolean isFeaturedProductsPageOpen() {
        return featuredProductsPage.isHeaderOnFeaturedProductsPage();
    }

    public Boolean isFeaturedProductsEmpty() {
        return featuredProductsPage.isFeaturedProductsEmpty();
    }

    public Boolean isFeaturedProductsNotEmpty() {
        return featuredProductsPage.isFeaturedProductsNotEmpty();
    }

    public FeaturedProductsHelper deleteProduct() {
        featuredProductsPage
                .clickToDelete();
        return new FeaturedProductsHelper();
    }

    public ProductHelper navigateToItem() {
        System.out.println("Navigate to 'Product' page");
        featuredProductsPage
                .navigateToProductPageFromFeatured();
        return new ProductHelper();
    }
}