
package coding.assignment;
/**
 * <code>AsteriskLogger</code> This class implements the Logger interface and
 * overrides the log and error methods.
 */
public class AsteriskLogger implements Logger {

    /**
     * <code>log</code> logs a message with 3 asterisks on each side.
     */
    @Override
    public void log(String message) {
        System.out.println("***" + message + "***");
    }

    /**
     * <code>error</code> logs an error message preceded by the word "ERROR: " with
     * 3 asterisks on each side and a line of asterisks above and below.
     */
    @Override
    public void error(String message) {
        System.out.println("*".repeat(message.length() + 13));
        System.out.println("***ERROR: " + message + "***");
        System.out.println("*".repeat(message.length() + 13));
    }

}
