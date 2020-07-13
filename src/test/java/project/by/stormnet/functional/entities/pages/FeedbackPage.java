package project.by.stormnet.functional.entities.pages;

public class FeedbackPage extends AbstractPage {
    private static String header = "//h1[@class=\"content__header\"]";
    private static String feedbackButton = "//button[@class='g-button']";
    private static String noteTextFeedbackForm = "//span[@class=\"g-attention\"]";

    public static FeedbackPage getFeedbackPage() {
        FeedbackPage feedbackPage = new FeedbackPage();
        waitForElementVisible(getElementBy(header));
        System.out.println("Feedback page is opened!");
        return feedbackPage;
    }

    public FeedbackPage clickFeedbackButton() {
        waitForElementVisible(getElementBy(feedbackButton));
        getElement(feedbackButton).click();
        return getFeedbackPage();
    }

    public Boolean isFeedbackForm() {
        waitForElementVisible(getElementBy(noteTextFeedbackForm));
        return getElement(noteTextFeedbackForm).isDisplayed();
    }
}