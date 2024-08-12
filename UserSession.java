public class UserSession {
    // Step 1: Create a private static instance of the UserSession class
    private static UserSession instance;

    // Step 2: Variables to maintain login state and user balance
    private boolean isLoggedIn;
    private double balance;

    // Step 3: Make the constructor private to prevent instantiation
    private UserSession() {
        // Initialize the balance to a default value (e.g., 1000.0)
        this.balance = 1000.0;
        this.isLoggedIn = false;
    }

    // Step 4: Provide a public static method to get the single instance
    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    // Step 5: Method to log in the user
    public void login() {
        if (!isLoggedIn) {
            isLoggedIn = true;
            System.out.println("User successfully logged in.");
        } else {
            System.out.println("User is already logged in.");
        }
    }

    // Step 6: Method to log out the user
    public void logout() {
        if (isLoggedIn) {
            isLoggedIn = false;
            System.out.println("User successfully logged out.");
        } else {
            System.out.println("No user is logged in.");
        }
    }

    // Step 7: Method to view balance
    public void viewBalance() {
        if (isLoggedIn) {
            System.out.println("Your current balance is: $" + balance);
        } else {
            System.out.println("Please log in to view your balance.");
        }
    }

    // Step 8: Method to deposit money
    public void deposit(double amount) {
        if (isLoggedIn) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance is: $" + balance);
        } else {
            System.out.println("Please log in to deposit money.");
        }
    }

    // Step 9: Method to withdraw money
    public void withdraw(double amount) {
        if (isLoggedIn) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew $" + amount + ". New balance is: $" + balance);
            } else {
                System.out.println("Insufficient funds. Your current balance is: $" + balance);
            }
        } else {
            System.out.println("Please log in to withdraw money.");
        }
    }

    // Step 10: Method to check login status
    public boolean isLoggedIn() {
        return isLoggedIn;
    }
}
