package project.by.stormnet.functional.tests.VekByTests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import project.by.stormnet.functional.entities.helpers.FeaturedProductsHelper;
import project.by.stormnet.functional.entities.helpers.HomeHelper;
import project.by.stormnet.functional.entities.helpers.ProductHelper;

public class FeaturedProductsTest {
    private HomeHelper homeHelper = new HomeHelper();
    private FeaturedProductsHelper featuredProductsHelper = new FeaturedProductsHelper();
    private ProductHelper productHelper = new ProductHelper();

    @Test(priority = 1)
    public void openFeaturedProductsPage() {
        boolean featuredProductsPageOpen = homeHelper.navigateToHomePage().navigateToFeaturedProductsPage().isFeaturedProductsPageOpen();
        Assert.assertTrue(featuredProductsPageOpen);
    }

    @Test(priority = 2)
    public void emptyFeaturedProducts() {
        boolean featuredProductsEmpty = featuredProductsHelper.isFeaturedProductsEmpty();
        Assert.assertTrue(featuredProductsEmpty);
    }

    @Test(priority = 3)
    public void addToFeaturedProducts() {
        homeHelper.navigateToHomePage().navigateToProductPage().addProductToFeaturedProducts();
        homeHelper.navigateToHomePage().navigateToFeaturedProductsPage().isFeaturedProductsPageOpen();
        boolean add = featuredProductsHelper.isFeaturedProductsNotEmpty();
        Assert.assertTrue(add);
    }

    @AfterTest
    public void tearDown() {
        homeHelper.quit();
    }
}