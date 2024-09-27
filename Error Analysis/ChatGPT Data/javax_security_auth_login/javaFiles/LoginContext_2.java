import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

public class LoginContext_2 {
    public static void main(String[] args) {
        // Define the method to logout using LoginContext
        void logout() {
            try {
                LoginContext lc = new LoginContext("exampleLoginModule");
                lc.logout();
            } catch (LoginException e) {
                System.err.println("Error during logout: " + e.getMessage());
            }
        }
    }
}
