package project.by.stormnet.functional.entities.helpers;

import project.by.stormnet.functional.entities.pages.SearchPage;

public class SearchHelper extends AbstractHelper {
    private SearchPage searchPage = new SearchPage();

    public int getSearchResultsCountPerPage() {
        return searchPage.getResultSizePerPage();
    }

    public SearchHelper addItemToCompare() {
        searchPage.clickAddToCompareButton();
        return new SearchHelper();
    }

    public Boolean isItemAddedToCompare() {
        return searchPage.isAddedToCompare();
    }

    public SearchHelper searchWithPriceParams(String startPrice, String endPrice) {
        searchPage
                .fillPriceFields(startPrice, endPrice);
        return new SearchHelper();
    }

    public SearchHelper searchWithSamsungCheckBoxPara() {
        searchPage
                .searchBySamsungCheckBox();
        return new SearchHelper();
    }

    public Boolean isSamsungCheckBoxUnchecked() {
        return searchPage.isSamsungCheckBoxUnchecked();
    }

    public SearchHelper selectSamsungCheckBox() {
        searchPage.selectSamsungCheckBox();
        return new SearchHelper();
    }

    public SearchHelper resetFilter() {
        searchPage.clickResetParamsButton();
        return new SearchHelper();
    }

    public Boolean isMorozilnikSearch() {
        return searchPage.isMorozilnikSearch();
    }

    public Boolean isPolisosSearch() {
        return searchPage.isPolisosSearch();
    }

    public Boolean isBathSearch() {
        return searchPage.isBathSearch();
    }
}