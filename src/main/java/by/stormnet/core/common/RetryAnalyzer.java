package by.stormnet.core.common;

        import org.testng.IRetryAnalyzer;
        import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    private int counter = 0;
    private int retryLimit = 4;

    public boolean retry(ITestResult iTestResult) {
        if (counter < retryLimit){
            counter++;
            return true;
        }
        return false;
    }
}
