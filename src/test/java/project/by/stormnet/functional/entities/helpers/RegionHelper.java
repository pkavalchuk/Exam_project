package project.by.stormnet.functional.entities.helpers;

import project.by.stormnet.functional.entities.pages.RegionPage;

public class RegionHelper extends AbstractHelper {
    private RegionPage regionPage = new RegionPage();

    public String getRegionPageHeader() {
        return regionPage.getHeaderText();
    }

    public String getCurrentRegionText() throws InterruptedException {
        return regionPage.getCurrentRegionText();
    }

    public RegionHelper changeRegion(String searchKey) {
        regionPage
                .fillRegionField(searchKey);
        return new RegionHelper();
    }
}