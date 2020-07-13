package project.by.stormnet.functional.entities.pages;

public class BonusPage extends AbstractPage {
    private static String header = "//h1[@class=\"content__header\"]";

    public static BonusPage getBonusPage() {
        BonusPage bonusPage = new BonusPage();
        waitForElementVisible(getElementBy(header));
        System.out.println("Bonus page is opened!");
        return bonusPage;
    }

    public String getHeaderText() {
        return getElement(header).getText();
    }
}