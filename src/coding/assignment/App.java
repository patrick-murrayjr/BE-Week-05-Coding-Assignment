/**
 * Week 5 Coding Assignment
 * 
 * @author Patrick Murray
 * 
 * 12/16/2023
 */

package coding.assignment;

/**
 * This class is used to test the AsteriskLogger and
 * SpacedLogger classes
 */
public class App {
    public static void main(String[] args) throws Exception {
        AsteriskLogger asteriskLogger = new AsteriskLogger();
        SpacedLogger spacedLogger = new SpacedLogger();

        // AsteriskLogger Tests
        System.out.println("\nTesting asteriskLogger.log(\"Hello\")");
        asteriskLogger.log("Hello");

        System.out.println("\nTesting asteriskLogger.error(\"Hello\")");
        asteriskLogger.error("Hello");

        // SpacedLogger Tests
        System.out.println("\nTesting spacedLogger.log(\"Hello\")");
        spacedLogger.log("Hello");

        System.out.println("\nTesting spacedLogger.error(\"Hello\")");
        spacedLogger.error("Hello");
    }
}
