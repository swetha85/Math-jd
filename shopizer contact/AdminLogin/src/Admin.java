
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.runner.JUnitCore.*;


public class Admin {
    public static void main(String[] args) {
        Result result = runClasses(TestRunner.class);
        System.out.println("Result Successful: " + result.wasSuccessful());
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }
}
