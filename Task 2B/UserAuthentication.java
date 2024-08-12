public class UserAuthentication {
    private static UserAuthentication instance;
    private boolean isAuthenticated;
    private String userName;

    private UserAuthentication() {
        this.isAuthenticated = false;
    }

    public static UserAuthentication getInstance() {
        if (instance == null) {
            instance = new UserAuthentication();
        }
        return instance;
    }

    public void login(String userName) {
        if (!isAuthenticated) {
            this.userName = userName;
            this.isAuthenticated = true;
            System.out.println(userName + " successfully logged in.");
        } else {
            System.out.println(userName + " is already logged in.");
        }
    }

    public void logout() {
        if (isAuthenticated) {
            System.out.println(userName + " logged out.");
            this.isAuthenticated = false;
            this.userName = null;
        } else {
            System.out.println("No user is logged in.");
        }
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public String getUserName() {
        return userName;
    }
}
