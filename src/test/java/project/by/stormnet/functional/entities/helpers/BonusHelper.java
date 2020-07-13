package project.by.stormnet.functional.entities.helpers;

import project.by.stormnet.functional.entities.pages.AbstractPage;
import project.by.stormnet.functional.entities.pages.BonusPage;

public class BonusHelper extends AbstractPage {
    private BonusPage bonusPage = new BonusPage();

    public String getBonusPageHeader() {
        return bonusPage.getHeaderText();
    }
}