
public class Logger {
    // Step 1: Create a private static instance of the Logger class
    private static Logger instance;

    // Step 2: Make the constructor private to prevent instantiation
    private Logger() {
        }

    // Step 3: Provide a public static method to get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Step 4: Method to log messages
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}