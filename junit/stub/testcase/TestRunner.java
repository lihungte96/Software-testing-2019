import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result;
        if (args.length >= 1 && "Socket".equals(args[0])) {
            result = JUnitCore.runClasses(TestTcpSocket.class);
        } else {
            result = JUnitCore.runClasses(TestTcpClient.class);
        }
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
