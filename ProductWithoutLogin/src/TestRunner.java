import org.junit.BeforeClass;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.runner.JUnitCore.runClasses;

public class TestRunner {
    public static void main(String[] args) {
        Result result = runClasses(TestRunner.class);
        System.out.println("Result Successful: " + result.wasSuccessful());
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }

}
