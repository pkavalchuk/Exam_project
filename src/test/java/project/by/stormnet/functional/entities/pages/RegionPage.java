package project.by.stormnet.functional.entities.pages;

import org.openqa.selenium.Keys;

public class RegionPage extends AbstractPage {
    private static String header = "//h1[@class=\"content__header\"]";
    private static String regionField = "//input[@class=\"g-form__text ui-autocomplete-input\"]";
    private static String elementFromList = "//li[@class=\"ui-menu-item\"]";
    private static String currentRegion = "//span[@class=\"g-pseudo_href j-callpopup cr-popup-big\"]";

    public static RegionPage getRegionPage() {
        RegionPage regionPage = new RegionPage();
        waitForElementVisible(getElementBy(header));
        System.out.println("Region page is opened!");
        return regionPage;
    }

    public String getHeaderText() {
        return getElement(header).getText();
    }

    public String getCurrentRegionText() throws InterruptedException {
        Thread.sleep(500);
        return getElement(currentRegion).getText();
    }

    public RegionPage fillRegionField(String searchKey) {
        waitForElementVisible(getElementBy(regionField));
        getElement(regionField).click();
        getElement(regionField).sendKeys(Keys.BACK_SPACE);
        getElement(regionField).sendKeys(searchKey);
        waitForElementVisible(getElementBy(elementFromList));
        getElement(elementFromList).click();
        return getRegionPage();
    }
}