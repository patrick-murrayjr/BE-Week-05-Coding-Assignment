
package coding.assignment;
/**
 * <code>Logger</code> is an interface that has two methods, one for
 * logging a message and one for error logging.
 * 
 */
public interface Logger {

    /**
     * <code>log</code> logs a message to the console.
     * 
     * @param message
     */
    public void log(String message);

    /**
     * <code>error</code> logs an error message to the console.
     * 
     * @param message
     */
    public void error(String message);
}
