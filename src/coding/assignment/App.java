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

        //Test text
        String testText = "Text for testing";
        
        // AsteriskLogger Tests
        System.out.printf("\nTesting asteriskLogger.log(\"%s\")\n", testText);
        asteriskLogger.log(testText);

        System.out.printf("\nTesting asteriskLogger.error(\"%s\")\n", testText);
        asteriskLogger.error(testText);

        // SpacedLogger Tests
        System.out.printf("\nTesting spacedLogger.log(\"%s\")\n", testText);
        spacedLogger.log(testText);

        System.out.printf("\nTesting spacedLogger.error(\"%s\")\n", testText);
        spacedLogger.error(testText);
    }
}
