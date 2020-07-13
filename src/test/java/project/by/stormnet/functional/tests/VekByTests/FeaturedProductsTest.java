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

    @Test(priority = 4)
    public void openProductPage() {
        homeHelper.navigateToHomePage().navigateToFeaturedProductsPage().isFeaturedProductsPageOpen();
        boolean redirect = featuredProductsHelper.navigateToItem().isInfoBlock();
        Assert.assertTrue(redirect);
    }

    @Test(priority = 5)
    public void deleteFromFeaturedProducts() {
        homeHelper.navigateToHomePage().navigateToFeaturedProductsPage().isFeaturedProductsPageOpen();
        boolean delete = featuredProductsHelper.deleteProduct().isFeaturedProductsEmpty();
        Assert.assertTrue(delete);
    }

    @AfterTest
    public void tearDown() {
        homeHelper.quit();
    }
}