
package coding.assignment;
/**
 * This is an interface that has two methods, one for
 * logging a message and one for error logging.
 * 
 */
public interface Logger {

    /**
     * Logs a message to the console.
     * 
     * @param message
     */
    public void log(String message);

    /**
     * Logs an error message to the console.
     * 
     * @param message
     */
    public void error(String message);
}
