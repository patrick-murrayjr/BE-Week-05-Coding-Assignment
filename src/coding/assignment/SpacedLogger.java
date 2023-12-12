
package coding.assignment;
/**
 * This class implements the Logger interface and
 * overrides the log and error methods.
 */
public class SpacedLogger implements Logger {

    /**
     * Logs a message with spaces between each character.
     */
    @Override
    public void log(String message) {
        StringBuilder spacedLog = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            spacedLog.append(message.charAt(i) + " ");
        }
        System.out.println(spacedLog);
    }

    /**
     * Logs an error message preceded by the word "ERROR: " with
     * spaces between each character.
     */
    @Override
    public void error(String message) {
        StringBuilder spacedLog = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            spacedLog.append(message.charAt(i) + " ");
        }
        System.out.println("ERROR: " + spacedLog);
    }

}
