package Todo;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TY {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TY13.class);
        System.out.println("Result Successful: " + result.wasSuccessful());
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }
}
