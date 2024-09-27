import javax.security.auth.Subject;
import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

public class LoginContext_3 {
    public static void main(String[] args) {
        try {
            LoginContext loginContext = new LoginContext("Sample", new MyCallbackHandler());
            loginContext.login();
            Subject subject = loginContext.getSubject();
            System.out.println("Subject: " + subject);
        } catch (LoginException e) {
            System.err.println("Login failed: " + e.getMessage());
        }
    }
}

class MyCallbackHandler implements CallbackHandler {
    // Implement callback handler methods here
}
