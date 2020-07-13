package project.by.stormnet.functional.entities.helpers;

import project.by.stormnet.functional.entities.pages.FeedbackPage;

public class FeedbackHelper extends AbstractHelper {
    private FeedbackPage feedbackPage = new FeedbackPage();

    public Boolean isFeedbackForm() {
        return feedbackPage.isFeedbackForm();
    }

    public FeedbackHelper openFeedbackForm() {
        feedbackPage
                .clickFeedbackButton();
        return new FeedbackHelper();
    }
}