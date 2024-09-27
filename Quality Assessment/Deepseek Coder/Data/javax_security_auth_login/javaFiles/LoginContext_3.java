import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

public class LoginContext_3 {
    public static void main(String[] args) {
        // Create a LoginContext instance
        LoginContext loginContext = null;
        try {
            loginContext = new LoginContext("MyLoginContext");
            // Perform login
            loginContext.login();
            // Perform logout
            loginContext.logout();
        } catch (LoginException e) {
            e.printStackTrace();
        } finally {
            if (loginContext!= null) {
                try {
                    loginContext.logout();
                } catch (LoginException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
