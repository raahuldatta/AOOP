public class Main {
    public static void main(String[] args) {
        // Step 5: Obtain the single instance of the Logger class
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Step 6: Log some messages
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");

        // Check if logger1 and logger2 refer to the same instance
        if (logger1 == logger2) {
            System.out.println("Logger1 and Logger2 are the same instance.");
        } else {
            System.out.println("Logger1 and Logger2 are different instances.");
        }
    }
}
