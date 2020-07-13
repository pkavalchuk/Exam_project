package project.by.stormnet.functional.entities.pages;

public class SearchPage extends AbstractPage {

    private static String results = "//li[@class=\"result__item cr-result__simple cr-result__first  g-box_lseparator\"]";
    private static String searchPageHeader = "//h1[@class=\"content__header cr-category_header\"]";
    private static String addToBasketButton = "//button[@class=\"g-button g-buybtn result__buybtn cr-buybtn__in j-ga_track\"]";
    private static String addToCompareButton = "//a[@class=\"compare__link g-pseudo_href j-compare\"]";
    private static String deleteFromCompareButton = "//a[@class='compare__link g-pseudo_href j-compare j-compare__in']";
    private static String fromPrice = "//input[@name=\"filter[price][from]\"]";
    private static String toPrice = "//input[@name=\"filter[price][to]\"]";
    private static String acceptParamsButton = "//span[@class=\"g-button__text\"]";
    private static String samsungCheckBox = "//label[@title=\"Samsung\"]";
    private static String samsungCheckBoxUnchecked = "//label[@class=\"g-form__checklabel cr-help-place\"][@title=\"Samsung\"]";
    private static String checkBoxChecked = "//label[@class=\"g-form__checklabel cr-help-place g-form__checked\"]";
    private static String resetFilterButton = "//span[@id=\"j-reset\"]";

    public static SearchPage getSearchPage() {
        SearchPage searchPage = new SearchPage();
        waitForElementVisible(getElementBy(searchPageHeader));
        System.out.println("Search page is opened!");
        return searchPage;
    }

    public int getResultSizePerPage() {
        waitForElementVisible(getElementBy(results));
        return getElements(results).size();
    }

    public SearchPage clickAddToBasketButton() {
        waitForElementVisible(getElementBy(addToBasketButton));
        getElement(addToBasketButton).click();
        return SearchPage.getSearchPage();
    }

    public SearchPage clickAddToCompareButton() {
        waitForElementVisible(getElementBy(addToCompareButton));
        getElement(addToCompareButton).click();
        return SearchPage.getSearchPage();
    }

    public Boolean isAddedToCompare() {
        waitForElementVisible(getElementBy(deleteFromCompareButton));
        return getElement(deleteFromCompareButton).isDisplayed();
    }

    public SearchPage fillPriceFields(String startPrice, String endPrice) {
        waitForElementVisible(getElementBy(fromPrice));
        getElement(fromPrice).sendKeys(startPrice);
        getElement(toPrice).sendKeys(endPrice);
        getElement(acceptParamsButton).click();
        return getSearchPage();
    }

    public Boolean isSamsungCheckBoxUnchecked() {
        waitForElementVisible(getElementBy(samsungCheckBoxUnchecked));
        return getElement(samsungCheckBoxUnchecked).isDisplayed();
    }

    public SearchPage searchBySamsungCheckBox() {
        waitForElementVisible(getElementBy(samsungCheckBox));
        getElement(samsungCheckBox).click();
        getElement(acceptParamsButton).click();
        return getSearchPage();
    }

    public SearchPage selectSamsungCheckBox() {
        waitForElementVisible(getElementBy(samsungCheckBox));
        getElement(samsungCheckBox).click();
        return getSearchPage();
    }

    public SearchPage clickResetParamsButton() {
        waitForElementVisible(getElementBy(checkBoxChecked));
        getElement(resetFilterButton).click();
        return SearchPage.getSearchPage();
    }

    public Boolean isMorozilnikSearch() {
        waitForElementVisible(getElementBy(searchPageHeader));
        if (getSearchPage().getDriver().getPageSource().contains("Морозильники")) {
            return true;
        } else return false;
    }

    public Boolean isPolisosSearch() {
        waitForElementVisible(getElementBy(searchPageHeader));
        if (getSearchPage().getDriver().getPageSource().contains("Пылесосы")) {
            return true;
        } else return false;
    }

    public Boolean isBathSearch() {
        waitForElementVisible(getElementBy(searchPageHeader));
        if (getSearchPage().getDriver().getPageSource().contains("Ванны")) {
            return true;
        } else return false;
    }
}